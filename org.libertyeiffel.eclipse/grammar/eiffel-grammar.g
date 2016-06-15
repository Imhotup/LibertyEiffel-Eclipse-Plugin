/*
// eiffel.g
//
//  version 1.0  -  June 2000
//
//  Miguel Oliveira e Silva (mos@det.ua.pt)
//
// Eiffel striped parser
//
// antlr -k 3 eiffel-grammar.g
//
*/

classDeclaration :
	  { indexing }
	  classHeader
	  { formalGenerics }
	  { obsolete }
	  { inheritance }
	  { creators }
	  { features }
	  { invariant }
	  "end"
	;


indexing :
	  "indexing" indexList
	;

indexList :
	  indexClause
	  ( "\;" indexClause )*
	  { "\;" }
	;

indexClause :
	  { index_ } indexTerms
	;

index_ :
	  identifier "\:"
	;

indexTerms :
	  indexValue
	  ( "\," indexValue )*
	;

indexValue :
	  identifier
	| manifestConstant
	;


classHeader :
	  { headerMark } "class" className
	;

headerMark :
	  "deferred"
	| "expanded"
	;

className :
	  identifier
	;


formalGenerics :
	  "\[" formalGenericList "\]"
	;

formalGenericList :
	  formalGeneric
	  ( "\," formalGeneric )*
	;

formalGeneric :
	  formalGenericName
	  { constraint }
	;

formalGenericName :
	  identifier
	;

constraint :
	  "\-\>" classType
	;


obsolete :
	  "obsolete" message
	;

message :
	  manifestString
	;


features :
	  ( "feature" { featureClause } )+
	;

featureClause :
	  { clients } featureDeclarationList
	;

featureDeclarationList :
	  featureDeclaration
	  ( { "\;" } featureDeclaration )* { "\;" }
	;


featureDeclaration :
	  newFeatureList declarationBody
	;

declarationBody :
	  formalArguments { typeMark } "is" routine
	| typeMark
	  { "is"
	    ( manifestConstant
	    | unique
	    | routine
	    )
	  }
	| "is" routine
	;


newFeatureList :
	  newFeature
	  ( "\," newFeature )*
	;

newFeature :
	  { "frozen" } featureName
	;


featureName :
	  identifier
	| prefix
	| infix
	;

prefix : /* lacks verification of string contents */
	  "prefix" manifestString
	;
/*	: "prefix" "\"" prefixOperator "\"" */

infix : /* lacks verification of string contents */
	  "infix" manifestString
	;
/*	: "infix" "\"" infixOperator "\"" */

/*
prefixOperator :
	  unary | freeOperator
	;

infixOperator :
	  binary | freeOperator
	;


unary :
	  "not" | "\+" | "\-"
	;

binary :
	  "\+" | "\-" | "\*" | "\/"
	| "\<" | "\>" | "\<\=" | "\>\="
	| "\/\/" | "\\\\" | "\^"
	| "and" | "or" | "xor"
	| "and" "then" | "or" "else" | "implies"
	;
*/


inheritance :
	  "inherit" parentList
	;

parentList :
	  parent
	  ( "\;" parent )* { "\;" }
	;

parent :
	  classType { featureAdaption }
	;

featureAdaption :
	  { rename_ }
	  { newExports }
	  { undefine }
	  { redefine }
	  { select_ }
	  "end"
	;


rename_ :
	  "rename" renameList
	;

renameList :
	  renamePair
	  ( "\," renamePair )*
	;

renamePair :
	  featureName "as" featureName
	;


clients :
	  "\{" { classList } "\}"
	;

classList :
	  className
	  ( "\," className )*
	;


newExports :
	  "export" newExportList
	;

newExportList :
	  newExportItem
	  ( "\;" newExportItem )*
	;

newExportItem :
	  clients featureSet
	;

featureSet :
	  featureList
	| "all"
	;

featureList :
	  featureName
	  ( "\," featureName )*
	;


formalArguments :
	  "\(" entityDeclarationList "\)"
	;

entityDeclarationList :
	  entityDeclarationGroup
	  ( "\;" entityDeclarationGroup )* { "\;" }
	;

entityDeclarationGroup :
	  identifierList typeMark
	;

identifierList :
	  identifier
	  ( "\," identifier )*
	;

typeMark :
	  "\:" type
	;


routine :
	  { obsolete }
	  { precondition }
	  { localDeclarations }
	  routineBody
	  { postcondition }
	  { rescue }
	  "end"
	;


routineBody :
	  effective
	| deferred
	;

effective :
	  internal
	| external
	;

internal :
	  routineMark { compound }
	;

routineMark :
	  "do"
	| "once"
	;

deferred :
	  "deferred"
	;


localDeclarations :
	  "local" entityDeclarationList
	;


instruction :
	  creation
	| call
	| assignment
	| assignmentAttempt
	| conditional
	| multiBranch
	| loop
	| debug
	| check_
	| retry
	;


precondition :
	  "require" { "else" } { assertion }
	;

postcondition :
	  "ensure" { "then" } { assertion }
	;

invariant :
	  "invariant" { assertion }
	;

assertion :
	  assertionClause
	  ( "\;" assertionClause )* { "\;" }
	;

assertionClause :
	  { tagMark } unlabeledAssertionClause
	| tagMark /* to allow assertions which are only comments with a tag! */
	;

unlabeledAssertionClause :
	  booleanExpression
	;

tagMark :
	  tag "\:"
	;

tag :
	  identifier
	;


/*
old :
	  "old" expression
	;
*/


check_ :
	  "check" { assertion } "end"
	;


variant :
	  "variant" { tagMark } expression
	;


redefine :
	  "redefine" featureList
	;


undefine :
	  "undefine" featureList
	;


select_ :
	  "select" featureList
	;


type :
	  <<is_formal_generic(LATEXT(1))>>? formalGenericName /* formalGenericType */
	| classType
	| classTypeExpanded /* also classType */
	| anchored
	| bitType
	;

classType :
	  className { actualGenerics }
	;

actualGenerics :
	  "\[" typeList "\]"
	;

typeList :
	  type
	  ( "\," type )*
	;

classTypeExpanded :
	  "expanded" className { actualGenerics } /* classType */
	;

bitType :
	  BIT constant
	;

anchored :
	  "like" anchor
	;

anchor :
	  identifier
	| CURRENT
	;


compound :
	  instruction
	  ( "\;" instruction )* { "\;" }
	;


conditional :
	  "if" thenPartList { elsePart } "end"
	;

thenPartList :
	  thenPart
	  ( "elseif" thenPart )*
	;

thenPart :
	  booleanExpression "then" { compound }
	;

elsePart :
	  "else" { compound }
	;


multiBranch :
	  "inspect" expression
	  { whenPartList } { elsePart } "end"
	;

whenPartList :
	  ( "when" whenPart )+
	;

whenPart :
	  choices "then" { compound }
	;

choices :
	  choice
	  ( "\," choice )*
	;

choice :
	  constant
	| interval
	;

interval :
	  integerInterval
	| characterInterval
	;

integerInterval :
	  integerConstant "\.\." integerConstant
	;

characterInterval :
	  characterConstant "\.\." characterConstant
	;


loop :
	  initialization
	  { invariant }
	  { variant }
	  loopBody
	  "end"
	;


initialization :
	  "from" { compound }
	;

loopBody :
	  exit_ "loop" { compound }
	;

exit_ :
	  "until" booleanExpression
	;


debug :
	  "debug" debugBody "end"
	;

debugBody :
	  ( "\(" debugKeyList "\)" { compound } )?
	| { compound }
	;

debugKeyList :
	  debugKey
	  ( "\," debugKey )*
	;

debugKey :
	  manifestString
	;


rescue :
	  "rescue" { compound }
	;

retry :
	  "retry"
	;


unique :
	  "unique"
	;


entity :
	  identifier /* writable.(attribute|local) | readOnly.formal */
	| RESULT /* writable->local */
	| CURRENT /* readOnly */
	;
/*	  writable | readOnly */

writable :
	  <<is_local_entity(LATEXT(1)) || strcmp(LATEXT(1),"Result") == 0>>? local
	| attribute
	;

attribute :
	  identifier
	;

local :
	  identifier
	| RESULT
	;

/*
readOnly :
	  formal
	| CURRENT
	;

formal :
	  identifier
	;
*/


creators :
	  "creation" creationClause
	  ( "creation" creationClause )* { "creation" }
	;

creationClause :
	  { clients } featureList
	;


creation :
	  "\!" { type } "\!" writable { creationCall }
	;

creationCall :
	  "\." unqualifiedCall
	;


assignment :
	  writable "\:\=" expression
	;


assignmentAttempt :
	  writable "\?\=" expression
	;


call :
	  { parenthesizedQualifier } callChain
	;

parenthesizedQualifier :
	  parenthesized "\."
	;

callChain :
	  unqualifiedCall
	  ( "\." unqualifiedCall )*
	;

unqualifiedCall :
	  entity { actuals }
	;


actuals :
	  "\(" actualList "\)"
	;

actualList :
	  actual
	  ( "\," actual )*
	;

actual :
	  expression
	| address
	;

address :
	  "\$" identifier
	;


/*
expression :
	  call
	| operatorExpression
	| equality
	| manifestConstant
	| manifestArray
	| old
	| strip
	;
*/

booleanExpression :
	  expression
	;

/* NEW */

expression :
	  manifestArray
	| expPrec3
	;

expPrec3 :
	  expPrec4
	  ( opPrec3 expPrec4 )*
	;

opPrec3 :
	  "implies"
	;

expPrec4 :
	  expPrec5
	  ( opPrec4 expPrec5 )*
	;

opPrec4 :
	  "or"
	| "or" "else"
	| "xor"
	;

expPrec5 :
	  expPrec6
	  ( opPrec5 expPrec6 )*
	;

opPrec5 :
	  "and"
	| "and" "then"
	;

expPrec6 :
	  expPrec7
	  ( opPrec6 expPrec7 )*
	;

opPrec6 :
	  "\="
	| "\/\="
	| "\<"
	| "\>"
	| "\<\="
	| "\>\="
	;

expPrec7 :
	  expPrec8
	  ( opPrec7 expPrec8 )*
	;

opPrec7 :
	  "\+"
	| "\-"
	;

expPrec8 :
	  expPrec9
	  ( opPrec8 expPrec9 )*
	;

opPrec8 :
	  "\*"
	| "\/"
	| "\/\/"
	| "\\\\"
	;

expPrec9 :
	  expPrec10
	  ( opPrec9 expPrec10 )*
	;

opPrec9 :
	  "\^"
	;

expPrec10 :
	  expPrec11
	  ( opPrec10 expPrec11 )*
	;

opPrec10 :
	  freeOperator
	;

expPrec11 :
	  { unaryOperators } elementarExp
	| strip
	;


unaryOperators :
	  "old"
	| "not"
	| "\+"
	| "\-"
	| freeOperator
	;

elementarExp :
	  parenthesized { "\." callChain }
	| callChain
	| booleanConstant
	| characterConstant
	| integer
	| real
	| manifestString
	| bitConstant
	;
	/* last six alternatives used instead of manifestConstant */
	/* to solve INTEGER and REAL sign ambiguities */

parenthesized :
	  "\(" expression "\)"
	;


constant :
	  manifestConstant
	| constantAttribute
	;

constantAttribute :
	  entity
	;


manifestConstant :
	  booleanConstant
	| characterConstant
	| integerConstant
	| realConstant
	| manifestString
	| bitConstant
	;

integerConstant :
	  { sign } integer
	;

realConstant :
	  { sign } real
	;

sign :
	  "\+"
	| "\-"
	;


booleanConstant :
	  TRUE_VAL
	| FALSE_VAL
	;


manifestArray :
	  "\<\<" expressionList "\>\>"
	;

expressionList :
	  expression
	  ( "\," expression )*
	;


strip :
	  "strip" "\(" attributeList "\)"
	;

attributeList :
	  identifier
	  ( "\," identifier )*
	;


external :
	  "external" languageName { externalName }
	;

languageName :
	  manifestString
	;

externalName :
	  "alias" manifestString
	;

identifier :
	  TK_IDENTIFIER
	;

manifestString :
	  TK_MANIFEST_STRING
	;

integer :
	  TK_INTEGER
	;

real :
	  TK_REAL
	;

bitConstant :
	  TK_BIT_CONSTANT
	;

characterConstant :
	  TK_CHARACTER_CONSTANT
	;

freeOperator :
	  TK_FREE_OPERATOR
	;


#token TK_IDENTIFIER		"[a-zA-Z][_0-9a-zA-Z]*"

#token "\""			<< zzmode(STRING); zzmore(); >>
#lexclass STRING
#token "\%~[\n\"]"		<< zzmore(); >>
#token "\%\""			<< zzmore(); >>
#token "\%\n[\ \t]*\%"		<< zzline++; /*zzreplstr("");*/ zzmore(); >>
#token TK_MANIFEST_STRING "\""	<<zzmode(START);>>
#token "[\ \t]"			<< zzmore(); >>
#token "~[\%\"\ \t]"		<< zzmore(); >>

#lexclass START

/* TK_INTEGER: verification of _ position not done!!! */
#token TK_INTEGER		"[0-9][_0-9]*"

#token TK_REAL			"[0-9]*\.[0-9]+{([eE]{[\+\-]}[0-9]+)}"

#token TK_BIT_CONSTANT		"[01]+[bB]"

#token TK_CHARACTER_CONSTANT	"\'(~[\%\']|(\%\/[0-9]+\/)|(\%[ABCDFHLNQRSTUV\%\'\"\(\)\<\>]))\'"

/* TK_FREE_OPERATOR: not complete, ambiguous definition */
#token TK_FREE_OPERATOR		"[\@\#\|\&][\@\#\|\&\<\>\-\=\\\/\*\+\^]*"

