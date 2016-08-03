// $ANTLR 3.5.2 eiffel.g 2016-06-17 16:44:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class eiffelParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CURRENT", "FALSE_VAL", "RESULT", 
		"TK_BIT_CONSTANT", "TK_CHARACTER_CONSTANT", "TK_FREE_OPERATOR", "TK_IDENTIFIER", 
		"TK_INTEGER", "TK_MANIFEST_STRING", "TK_REAL", "TRUE_VAL", "'\\!'", "'\\$'", 
		"'\\('", "'\\)'", "'\\*'", "'\\+'", "'\\,'", "'\\-'", "'\\-\\>'", "'\\.'", 
		"'\\.\\.'", "'\\/'", "'\\/\\/'", "'\\/\\='", "'\\:'", "'\\:\\='", "'\\;'", 
		"'\\<'", "'\\<\\<'", "'\\<\\='", "'\\='", "'\\>'", "'\\>\\='", "'\\>\\>'", 
		"'\\?\\='", "'\\['", "'\\\\\\\\'", "'\\]'", "'\\^'", "'\\{'", "'\\}'", 
		"'alias'", "'all'", "'and'", "'as'", "'check'", "'class'", "'creation'", 
		"'debug'", "'deferred'", "'do'", "'else'", "'elseif'", "'end'", "'ensure'", 
		"'expanded'", "'export'", "'external'", "'feature'", "'from'", "'if'", 
		"'implies'", "'indexing'", "'infix'", "'inherit'", "'inspect'", "'invariant'", 
		"'is'", "'like'", "'local'", "'loop'", "'not'", "'obsolete'", "'old'", 
		"'once'", "'or'", "'prefix'", "'redefine'", "'rename'", "'require'", "'rescue'", 
		"'retry'", "'select'", "'strip'", "'then'", "'undefine'", "'unique'", 
		"'until'", "'variant'", "'when'", "'xor'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int CURRENT=4;
	public static final int FALSE_VAL=5;
	public static final int RESULT=6;
	public static final int TK_BIT_CONSTANT=7;
	public static final int TK_CHARACTER_CONSTANT=8;
	public static final int TK_FREE_OPERATOR=9;
	public static final int TK_IDENTIFIER=10;
	public static final int TK_INTEGER=11;
	public static final int TK_MANIFEST_STRING=12;
	public static final int TK_REAL=13;
	public static final int TRUE_VAL=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public eiffelParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public eiffelParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return eiffelParser.tokenNames; }
	@Override public String getGrammarFileName() { return "eiffel.g"; }



	// $ANTLR start "classDeclaration"
	// eiffel.g:16:1: classDeclaration : classHeader 'end' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// eiffel.g:16:18: ( classHeader 'end' )
			// eiffel.g:17:4: classHeader 'end'
			{
			 indexing 
			pushFollow(FOLLOW_classHeader_in_classDeclaration21);
			classHeader();
			state._fsp--;

			 formalGenerics 
			 obsolete 
			 inheritance 
			 creators 
			 features 
			 invariant 
			match(input,58,FOLLOW_58_in_classDeclaration57); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "indexing"
	// eiffel.g:29:1: indexing : 'indexing' indexList ;
	public final void indexing() throws RecognitionException {
		try {
			// eiffel.g:29:10: ( 'indexing' indexList )
			// eiffel.g:30:4: 'indexing' indexList
			{
			match(input,67,FOLLOW_67_in_indexing71); 
			pushFollow(FOLLOW_indexList_in_indexing73);
			indexList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexing"



	// $ANTLR start "indexList"
	// eiffel.g:33:1: indexList : indexClause ( '\\;' indexClause )* ;
	public final void indexList() throws RecognitionException {
		try {
			// eiffel.g:33:11: ( indexClause ( '\\;' indexClause )* )
			// eiffel.g:34:4: indexClause ( '\\;' indexClause )*
			{
			pushFollow(FOLLOW_indexClause_in_indexList86);
			indexClause();
			state._fsp--;

			// eiffel.g:35:4: ( '\\;' indexClause )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==31) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// eiffel.g:35:6: '\\;' indexClause
					{
					match(input,31,FOLLOW_31_in_indexList93); 
					pushFollow(FOLLOW_indexClause_in_indexList95);
					indexClause();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexList"



	// $ANTLR start "indexClause"
	// eiffel.g:39:1: indexClause : indexTerms ;
	public final void indexClause() throws RecognitionException {
		try {
			// eiffel.g:39:13: ( indexTerms )
			// eiffel.g:40:4: indexTerms
			{
			 index_ 
			pushFollow(FOLLOW_indexTerms_in_indexClause118);
			indexTerms();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexClause"



	// $ANTLR start "index_"
	// eiffel.g:43:1: index_ : identifier '\\:' ;
	public final void index_() throws RecognitionException {
		try {
			// eiffel.g:43:8: ( identifier '\\:' )
			// eiffel.g:44:4: identifier '\\:'
			{
			pushFollow(FOLLOW_identifier_in_index_131);
			identifier();
			state._fsp--;

			match(input,29,FOLLOW_29_in_index_133); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_"



	// $ANTLR start "indexTerms"
	// eiffel.g:47:1: indexTerms : indexValue ( '\\,' indexValue )* ;
	public final void indexTerms() throws RecognitionException {
		try {
			// eiffel.g:47:12: ( indexValue ( '\\,' indexValue )* )
			// eiffel.g:48:4: indexValue ( '\\,' indexValue )*
			{
			pushFollow(FOLLOW_indexValue_in_indexTerms146);
			indexValue();
			state._fsp--;

			// eiffel.g:49:4: ( '\\,' indexValue )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==21) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// eiffel.g:49:6: '\\,' indexValue
					{
					match(input,21,FOLLOW_21_in_indexTerms153); 
					pushFollow(FOLLOW_indexValue_in_indexTerms155);
					indexValue();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexTerms"



	// $ANTLR start "indexValue"
	// eiffel.g:52:1: indexValue : ( identifier | manifestConstant );
	public final void indexValue() throws RecognitionException {
		try {
			// eiffel.g:52:12: ( identifier | manifestConstant )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TK_IDENTIFIER) ) {
				alt3=1;
			}
			else if ( (LA3_0==FALSE_VAL||(LA3_0 >= TK_BIT_CONSTANT && LA3_0 <= TK_CHARACTER_CONSTANT)||(LA3_0 >= TK_INTEGER && LA3_0 <= TRUE_VAL)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// eiffel.g:53:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_indexValue171);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:54:4: manifestConstant
					{
					pushFollow(FOLLOW_manifestConstant_in_indexValue176);
					manifestConstant();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexValue"



	// $ANTLR start "classHeader"
	// eiffel.g:58:1: classHeader : 'class' className ;
	public final void classHeader() throws RecognitionException {
		try {
			// eiffel.g:58:13: ( 'class' className )
			// eiffel.g:59:4: 'class' className
			{
			 headerMark 
			match(input,51,FOLLOW_51_in_classHeader192); 
			pushFollow(FOLLOW_className_in_classHeader194);
			className();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classHeader"



	// $ANTLR start "headerMark"
	// eiffel.g:62:1: headerMark : ( 'deferred' | 'expanded' );
	public final void headerMark() throws RecognitionException {
		try {
			// eiffel.g:62:12: ( 'deferred' | 'expanded' )
			// eiffel.g:
			{
			if ( input.LA(1)==54||input.LA(1)==60 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "headerMark"



	// $ANTLR start "className"
	// eiffel.g:67:1: className : identifier ;
	public final void className() throws RecognitionException {
		try {
			// eiffel.g:67:11: ( identifier )
			// eiffel.g:68:4: identifier
			{
			pushFollow(FOLLOW_identifier_in_className225);
			identifier();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "className"



	// $ANTLR start "formalGenerics"
	// eiffel.g:72:1: formalGenerics : '\\[' formalGenericList '\\]' ;
	public final void formalGenerics() throws RecognitionException {
		try {
			// eiffel.g:72:16: ( '\\[' formalGenericList '\\]' )
			// eiffel.g:73:4: '\\[' formalGenericList '\\]'
			{
			match(input,40,FOLLOW_40_in_formalGenerics239); 
			pushFollow(FOLLOW_formalGenericList_in_formalGenerics241);
			formalGenericList();
			state._fsp--;

			match(input,42,FOLLOW_42_in_formalGenerics243); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalGenerics"



	// $ANTLR start "formalGenericList"
	// eiffel.g:76:1: formalGenericList : formalGeneric ( '\\,' formalGeneric )* ;
	public final void formalGenericList() throws RecognitionException {
		try {
			// eiffel.g:76:19: ( formalGeneric ( '\\,' formalGeneric )* )
			// eiffel.g:77:4: formalGeneric ( '\\,' formalGeneric )*
			{
			pushFollow(FOLLOW_formalGeneric_in_formalGenericList256);
			formalGeneric();
			state._fsp--;

			// eiffel.g:78:4: ( '\\,' formalGeneric )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==21) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// eiffel.g:78:6: '\\,' formalGeneric
					{
					match(input,21,FOLLOW_21_in_formalGenericList263); 
					pushFollow(FOLLOW_formalGeneric_in_formalGenericList265);
					formalGeneric();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalGenericList"



	// $ANTLR start "formalGeneric"
	// eiffel.g:81:1: formalGeneric : formalGenericName ;
	public final void formalGeneric() throws RecognitionException {
		try {
			// eiffel.g:81:15: ( formalGenericName )
			// eiffel.g:82:4: formalGenericName
			{
			pushFollow(FOLLOW_formalGenericName_in_formalGeneric281);
			formalGenericName();
			state._fsp--;

			 constraint 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalGeneric"



	// $ANTLR start "formalGenericName"
	// eiffel.g:86:1: formalGenericName : identifier ;
	public final void formalGenericName() throws RecognitionException {
		try {
			// eiffel.g:86:19: ( identifier )
			// eiffel.g:87:4: identifier
			{
			pushFollow(FOLLOW_identifier_in_formalGenericName299);
			identifier();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalGenericName"



	// $ANTLR start "constraint"
	// eiffel.g:90:1: constraint : '\\-\\>' classType ;
	public final void constraint() throws RecognitionException {
		try {
			// eiffel.g:90:12: ( '\\-\\>' classType )
			// eiffel.g:91:4: '\\-\\>' classType
			{
			match(input,23,FOLLOW_23_in_constraint312); 
			pushFollow(FOLLOW_classType_in_constraint314);
			classType();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constraint"



	// $ANTLR start "obsolete"
	// eiffel.g:95:1: obsolete : 'obsolete' message ;
	public final void obsolete() throws RecognitionException {
		try {
			// eiffel.g:95:10: ( 'obsolete' message )
			// eiffel.g:96:4: 'obsolete' message
			{
			match(input,77,FOLLOW_77_in_obsolete328); 
			pushFollow(FOLLOW_message_in_obsolete330);
			message();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "obsolete"



	// $ANTLR start "message"
	// eiffel.g:99:1: message : manifestString ;
	public final void message() throws RecognitionException {
		try {
			// eiffel.g:99:9: ( manifestString )
			// eiffel.g:100:4: manifestString
			{
			pushFollow(FOLLOW_manifestString_in_message343);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "message"



	// $ANTLR start "features"
	// eiffel.g:104:1: features : ( 'feature' )+ ;
	public final void features() throws RecognitionException {
		try {
			// eiffel.g:104:10: ( ( 'feature' )+ )
			// eiffel.g:105:4: ( 'feature' )+
			{
			// eiffel.g:105:4: ( 'feature' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==63) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// eiffel.g:105:6: 'feature'
					{
					match(input,63,FOLLOW_63_in_features359); 
					 featureClause 
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "features"



	// $ANTLR start "featureClause"
	// eiffel.g:108:1: featureClause : featureDeclarationList ;
	public final void featureClause() throws RecognitionException {
		try {
			// eiffel.g:108:15: ( featureDeclarationList )
			// eiffel.g:109:4: featureDeclarationList
			{
			 clients 
			pushFollow(FOLLOW_featureDeclarationList_in_featureClause379);
			featureDeclarationList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureClause"



	// $ANTLR start "featureDeclarationList"
	// eiffel.g:112:1: featureDeclarationList : featureDeclaration ( featureDeclaration )* ;
	public final void featureDeclarationList() throws RecognitionException {
		try {
			// eiffel.g:112:24: ( featureDeclaration ( featureDeclaration )* )
			// eiffel.g:113:4: featureDeclaration ( featureDeclaration )*
			{
			pushFollow(FOLLOW_featureDeclaration_in_featureDeclarationList392);
			featureDeclaration();
			state._fsp--;

			// eiffel.g:114:4: ( featureDeclaration )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==TK_IDENTIFIER||LA6_0==68||LA6_0==81) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// eiffel.g:114:6: featureDeclaration
					{
					 '\;' 
					pushFollow(FOLLOW_featureDeclaration_in_featureDeclarationList401);
					featureDeclaration();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureDeclarationList"



	// $ANTLR start "featureDeclaration"
	// eiffel.g:118:1: featureDeclaration : newFeatureList declarationBody ;
	public final void featureDeclaration() throws RecognitionException {
		try {
			// eiffel.g:118:20: ( newFeatureList declarationBody )
			// eiffel.g:119:4: newFeatureList declarationBody
			{
			pushFollow(FOLLOW_newFeatureList_in_featureDeclaration420);
			newFeatureList();
			state._fsp--;

			pushFollow(FOLLOW_declarationBody_in_featureDeclaration422);
			declarationBody();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureDeclaration"



	// $ANTLR start "declarationBody"
	// eiffel.g:122:1: declarationBody : ( formalArguments 'is' routine | typeMark | 'is' routine );
	public final void declarationBody() throws RecognitionException {
		try {
			// eiffel.g:122:17: ( formalArguments 'is' routine | typeMark | 'is' routine )
			int alt7=3;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt7=1;
				}
				break;
			case 29:
				{
				alt7=2;
				}
				break;
			case 72:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// eiffel.g:123:4: formalArguments 'is' routine
					{
					pushFollow(FOLLOW_formalArguments_in_declarationBody435);
					formalArguments();
					state._fsp--;

					 typeMark 
					match(input,72,FOLLOW_72_in_declarationBody439); 
					pushFollow(FOLLOW_routine_in_declarationBody441);
					routine();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:124:4: typeMark
					{
					pushFollow(FOLLOW_typeMark_in_declarationBody446);
					typeMark();
					state._fsp--;

					 'is'
						    ( manifestConstant
						    | unique
						    | routine
						    )
						  
					}
					break;
				case 3 :
					// eiffel.g:131:4: 'is' routine
					{
					match(input,72,FOLLOW_72_in_declarationBody456); 
					pushFollow(FOLLOW_routine_in_declarationBody458);
					routine();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarationBody"



	// $ANTLR start "newFeatureList"
	// eiffel.g:135:1: newFeatureList : newFeature ( '\\,' newFeature )* ;
	public final void newFeatureList() throws RecognitionException {
		try {
			// eiffel.g:135:16: ( newFeature ( '\\,' newFeature )* )
			// eiffel.g:136:4: newFeature ( '\\,' newFeature )*
			{
			pushFollow(FOLLOW_newFeature_in_newFeatureList472);
			newFeature();
			state._fsp--;

			// eiffel.g:137:4: ( '\\,' newFeature )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==21) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// eiffel.g:137:6: '\\,' newFeature
					{
					match(input,21,FOLLOW_21_in_newFeatureList479); 
					pushFollow(FOLLOW_newFeature_in_newFeatureList481);
					newFeature();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newFeatureList"



	// $ANTLR start "newFeature"
	// eiffel.g:140:1: newFeature : featureName ;
	public final void newFeature() throws RecognitionException {
		try {
			// eiffel.g:140:12: ( featureName )
			// eiffel.g:141:4: featureName
			{
			 'frozen' 
			pushFollow(FOLLOW_featureName_in_newFeature499);
			featureName();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newFeature"



	// $ANTLR start "featureName"
	// eiffel.g:145:1: featureName : ( identifier | prefix | infix );
	public final void featureName() throws RecognitionException {
		try {
			// eiffel.g:145:13: ( identifier | prefix | infix )
			int alt9=3;
			switch ( input.LA(1) ) {
			case TK_IDENTIFIER:
				{
				alt9=1;
				}
				break;
			case 81:
				{
				alt9=2;
				}
				break;
			case 68:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// eiffel.g:146:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_featureName513);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:147:4: prefix
					{
					pushFollow(FOLLOW_prefix_in_featureName518);
					prefix();
					state._fsp--;

					}
					break;
				case 3 :
					// eiffel.g:148:4: infix
					{
					pushFollow(FOLLOW_infix_in_featureName523);
					infix();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureName"



	// $ANTLR start "prefix"
	// eiffel.g:151:1: prefix : 'prefix' manifestString ;
	public final void prefix() throws RecognitionException {
		try {
			// eiffel.g:151:8: ( 'prefix' manifestString )
			// eiffel.g:152:4: 'prefix' manifestString
			{
			match(input,81,FOLLOW_81_in_prefix538); 
			pushFollow(FOLLOW_manifestString_in_prefix540);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prefix"



	// $ANTLR start "infix"
	// eiffel.g:156:1: infix : 'infix' manifestString ;
	public final void infix() throws RecognitionException {
		try {
			// eiffel.g:156:7: ( 'infix' manifestString )
			// eiffel.g:157:4: 'infix' manifestString
			{
			match(input,68,FOLLOW_68_in_infix557); 
			pushFollow(FOLLOW_manifestString_in_infix559);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "infix"



	// $ANTLR start "prefixOperator"
	// eiffel.g:162:1: prefixOperator : ( unary | freeOperator );
	public final void prefixOperator() throws RecognitionException {
		try {
			// eiffel.g:162:16: ( unary | freeOperator )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==20||LA10_0==22||LA10_0==76) ) {
				alt10=1;
			}
			else if ( (LA10_0==TK_FREE_OPERATOR) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// eiffel.g:163:4: unary
					{
					pushFollow(FOLLOW_unary_in_prefixOperator575);
					unary();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:163:12: freeOperator
					{
					pushFollow(FOLLOW_freeOperator_in_prefixOperator579);
					freeOperator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prefixOperator"



	// $ANTLR start "infixOperator"
	// eiffel.g:166:1: infixOperator : ( binary | freeOperator );
	public final void infixOperator() throws RecognitionException {
		try {
			// eiffel.g:166:15: ( binary | freeOperator )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= 19 && LA11_0 <= 20)||LA11_0==22||(LA11_0 >= 26 && LA11_0 <= 27)||LA11_0==32||LA11_0==34||(LA11_0 >= 36 && LA11_0 <= 37)||LA11_0==41||LA11_0==43||LA11_0==48||LA11_0==66||LA11_0==80||LA11_0==95) ) {
				alt11=1;
			}
			else if ( (LA11_0==TK_FREE_OPERATOR) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// eiffel.g:167:4: binary
					{
					pushFollow(FOLLOW_binary_in_infixOperator592);
					binary();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:167:13: freeOperator
					{
					pushFollow(FOLLOW_freeOperator_in_infixOperator596);
					freeOperator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "infixOperator"



	// $ANTLR start "unary"
	// eiffel.g:171:1: unary : ( 'not' | '\\+' | '\\-' );
	public final void unary() throws RecognitionException {
		try {
			// eiffel.g:171:7: ( 'not' | '\\+' | '\\-' )
			// eiffel.g:
			{
			if ( input.LA(1)==20||input.LA(1)==22||input.LA(1)==76 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unary"



	// $ANTLR start "binary"
	// eiffel.g:175:1: binary : ( '\\+' | '\\-' | '\\*' | '\\/' | '\\<' | '\\>' | '\\<\\=' | '\\>\\=' | '\\/\\/' | '\\\\\\\\' | '\\^' | 'and' | 'or' | 'xor' | 'and' 'then' | 'or' 'else' | 'implies' );
	public final void binary() throws RecognitionException {
		try {
			// eiffel.g:175:8: ( '\\+' | '\\-' | '\\*' | '\\/' | '\\<' | '\\>' | '\\<\\=' | '\\>\\=' | '\\/\\/' | '\\\\\\\\' | '\\^' | 'and' | 'or' | 'xor' | 'and' 'then' | 'or' 'else' | 'implies' )
			int alt12=17;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt12=1;
				}
				break;
			case 22:
				{
				alt12=2;
				}
				break;
			case 19:
				{
				alt12=3;
				}
				break;
			case 26:
				{
				alt12=4;
				}
				break;
			case 32:
				{
				alt12=5;
				}
				break;
			case 36:
				{
				alt12=6;
				}
				break;
			case 34:
				{
				alt12=7;
				}
				break;
			case 37:
				{
				alt12=8;
				}
				break;
			case 27:
				{
				alt12=9;
				}
				break;
			case 41:
				{
				alt12=10;
				}
				break;
			case 43:
				{
				alt12=11;
				}
				break;
			case 48:
				{
				int LA12_12 = input.LA(2);
				if ( (LA12_12==89) ) {
					alt12=15;
				}
				else if ( (LA12_12==EOF) ) {
					alt12=12;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 80:
				{
				int LA12_13 = input.LA(2);
				if ( (LA12_13==56) ) {
					alt12=16;
				}
				else if ( (LA12_13==EOF) ) {
					alt12=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 95:
				{
				alt12=14;
				}
				break;
			case 66:
				{
				alt12=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// eiffel.g:176:4: '\\+'
					{
					match(input,20,FOLLOW_20_in_binary631); 
					}
					break;
				case 2 :
					// eiffel.g:176:11: '\\-'
					{
					match(input,22,FOLLOW_22_in_binary635); 
					}
					break;
				case 3 :
					// eiffel.g:176:18: '\\*'
					{
					match(input,19,FOLLOW_19_in_binary639); 
					}
					break;
				case 4 :
					// eiffel.g:176:25: '\\/'
					{
					match(input,26,FOLLOW_26_in_binary643); 
					}
					break;
				case 5 :
					// eiffel.g:177:4: '\\<'
					{
					match(input,32,FOLLOW_32_in_binary648); 
					}
					break;
				case 6 :
					// eiffel.g:177:11: '\\>'
					{
					match(input,36,FOLLOW_36_in_binary652); 
					}
					break;
				case 7 :
					// eiffel.g:177:18: '\\<\\='
					{
					match(input,34,FOLLOW_34_in_binary656); 
					}
					break;
				case 8 :
					// eiffel.g:177:27: '\\>\\='
					{
					match(input,37,FOLLOW_37_in_binary660); 
					}
					break;
				case 9 :
					// eiffel.g:178:4: '\\/\\/'
					{
					match(input,27,FOLLOW_27_in_binary665); 
					}
					break;
				case 10 :
					// eiffel.g:178:13: '\\\\\\\\'
					{
					match(input,41,FOLLOW_41_in_binary669); 
					}
					break;
				case 11 :
					// eiffel.g:178:22: '\\^'
					{
					match(input,43,FOLLOW_43_in_binary673); 
					}
					break;
				case 12 :
					// eiffel.g:179:4: 'and'
					{
					match(input,48,FOLLOW_48_in_binary678); 
					}
					break;
				case 13 :
					// eiffel.g:179:12: 'or'
					{
					match(input,80,FOLLOW_80_in_binary682); 
					}
					break;
				case 14 :
					// eiffel.g:179:19: 'xor'
					{
					match(input,95,FOLLOW_95_in_binary686); 
					}
					break;
				case 15 :
					// eiffel.g:180:4: 'and' 'then'
					{
					match(input,48,FOLLOW_48_in_binary691); 
					match(input,89,FOLLOW_89_in_binary693); 
					}
					break;
				case 16 :
					// eiffel.g:180:19: 'or' 'else'
					{
					match(input,80,FOLLOW_80_in_binary697); 
					match(input,56,FOLLOW_56_in_binary699); 
					}
					break;
				case 17 :
					// eiffel.g:180:33: 'implies'
					{
					match(input,66,FOLLOW_66_in_binary703); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "binary"



	// $ANTLR start "inheritance"
	// eiffel.g:185:1: inheritance : 'inherit' parentList ;
	public final void inheritance() throws RecognitionException {
		try {
			// eiffel.g:185:13: ( 'inherit' parentList )
			// eiffel.g:186:4: 'inherit' parentList
			{
			match(input,69,FOLLOW_69_in_inheritance718); 
			pushFollow(FOLLOW_parentList_in_inheritance720);
			parentList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inheritance"



	// $ANTLR start "parentList"
	// eiffel.g:189:1: parentList : parent ( '\\;' parent )* ;
	public final void parentList() throws RecognitionException {
		try {
			// eiffel.g:189:12: ( parent ( '\\;' parent )* )
			// eiffel.g:190:4: parent ( '\\;' parent )*
			{
			pushFollow(FOLLOW_parent_in_parentList733);
			parent();
			state._fsp--;

			// eiffel.g:191:4: ( '\\;' parent )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==31) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// eiffel.g:191:6: '\\;' parent
					{
					match(input,31,FOLLOW_31_in_parentList740); 
					pushFollow(FOLLOW_parent_in_parentList742);
					parent();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parentList"



	// $ANTLR start "parent"
	// eiffel.g:194:1: parent : classType ;
	public final void parent() throws RecognitionException {
		try {
			// eiffel.g:194:8: ( classType )
			// eiffel.g:195:4: classType
			{
			pushFollow(FOLLOW_classType_in_parent760);
			classType();
			state._fsp--;

			 featureAdaption 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parent"



	// $ANTLR start "featureAdaption"
	// eiffel.g:198:1: featureAdaption : 'end' ;
	public final void featureAdaption() throws RecognitionException {
		try {
			// eiffel.g:198:17: ( 'end' )
			// eiffel.g:199:4: 'end'
			{
			 rename 
			 newExports 
			 undefine 
			 redefine 
			 select 
			match(input,58,FOLLOW_58_in_featureAdaption800); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureAdaption"



	// $ANTLR start "rename"
	// eiffel.g:208:1: rename : 'rename' renameList ;
	public final void rename() throws RecognitionException {
		try {
			// eiffel.g:208:8: ( 'rename' renameList )
			// eiffel.g:209:4: 'rename' renameList
			{
			match(input,83,FOLLOW_83_in_rename814); 
			pushFollow(FOLLOW_renameList_in_rename816);
			renameList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rename"



	// $ANTLR start "renameList"
	// eiffel.g:212:1: renameList : renamePair ( '\\,' renamePair )* ;
	public final void renameList() throws RecognitionException {
		try {
			// eiffel.g:212:12: ( renamePair ( '\\,' renamePair )* )
			// eiffel.g:213:4: renamePair ( '\\,' renamePair )*
			{
			pushFollow(FOLLOW_renamePair_in_renameList829);
			renamePair();
			state._fsp--;

			// eiffel.g:214:4: ( '\\,' renamePair )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==21) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// eiffel.g:214:6: '\\,' renamePair
					{
					match(input,21,FOLLOW_21_in_renameList836); 
					pushFollow(FOLLOW_renamePair_in_renameList838);
					renamePair();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renameList"



	// $ANTLR start "renamePair"
	// eiffel.g:217:1: renamePair : featureName 'as' featureName ;
	public final void renamePair() throws RecognitionException {
		try {
			// eiffel.g:217:12: ( featureName 'as' featureName )
			// eiffel.g:218:4: featureName 'as' featureName
			{
			pushFollow(FOLLOW_featureName_in_renamePair854);
			featureName();
			state._fsp--;

			match(input,49,FOLLOW_49_in_renamePair856); 
			pushFollow(FOLLOW_featureName_in_renamePair858);
			featureName();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renamePair"



	// $ANTLR start "clients"
	// eiffel.g:222:1: clients : '\\{' '\\}' ;
	public final void clients() throws RecognitionException {
		try {
			// eiffel.g:222:9: ( '\\{' '\\}' )
			// eiffel.g:223:4: '\\{' '\\}'
			{
			match(input,44,FOLLOW_44_in_clients872); 
			 classList 
			match(input,45,FOLLOW_45_in_clients876); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "clients"



	// $ANTLR start "classList"
	// eiffel.g:226:1: classList : className ( '\\,' className )* ;
	public final void classList() throws RecognitionException {
		try {
			// eiffel.g:226:11: ( className ( '\\,' className )* )
			// eiffel.g:227:4: className ( '\\,' className )*
			{
			pushFollow(FOLLOW_className_in_classList889);
			className();
			state._fsp--;

			// eiffel.g:228:4: ( '\\,' className )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==21) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// eiffel.g:228:6: '\\,' className
					{
					match(input,21,FOLLOW_21_in_classList896); 
					pushFollow(FOLLOW_className_in_classList898);
					className();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classList"



	// $ANTLR start "newExports"
	// eiffel.g:232:1: newExports : 'export' newExportList ;
	public final void newExports() throws RecognitionException {
		try {
			// eiffel.g:232:12: ( 'export' newExportList )
			// eiffel.g:233:4: 'export' newExportList
			{
			match(input,61,FOLLOW_61_in_newExports915); 
			pushFollow(FOLLOW_newExportList_in_newExports917);
			newExportList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newExports"



	// $ANTLR start "newExportList"
	// eiffel.g:236:1: newExportList : newExportItem ( '\\;' newExportItem )* ;
	public final void newExportList() throws RecognitionException {
		try {
			// eiffel.g:236:15: ( newExportItem ( '\\;' newExportItem )* )
			// eiffel.g:237:4: newExportItem ( '\\;' newExportItem )*
			{
			pushFollow(FOLLOW_newExportItem_in_newExportList930);
			newExportItem();
			state._fsp--;

			// eiffel.g:238:4: ( '\\;' newExportItem )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==31) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// eiffel.g:238:6: '\\;' newExportItem
					{
					match(input,31,FOLLOW_31_in_newExportList937); 
					pushFollow(FOLLOW_newExportItem_in_newExportList939);
					newExportItem();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newExportList"



	// $ANTLR start "newExportItem"
	// eiffel.g:241:1: newExportItem : clients featureSet ;
	public final void newExportItem() throws RecognitionException {
		try {
			// eiffel.g:241:15: ( clients featureSet )
			// eiffel.g:242:4: clients featureSet
			{
			pushFollow(FOLLOW_clients_in_newExportItem955);
			clients();
			state._fsp--;

			pushFollow(FOLLOW_featureSet_in_newExportItem957);
			featureSet();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newExportItem"



	// $ANTLR start "featureSet"
	// eiffel.g:245:1: featureSet : ( featureList | 'all' );
	public final void featureSet() throws RecognitionException {
		try {
			// eiffel.g:245:12: ( featureList | 'all' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TK_IDENTIFIER||LA17_0==68||LA17_0==81) ) {
				alt17=1;
			}
			else if ( (LA17_0==47) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// eiffel.g:246:4: featureList
					{
					pushFollow(FOLLOW_featureList_in_featureSet970);
					featureList();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:247:4: 'all'
					{
					match(input,47,FOLLOW_47_in_featureSet975); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureSet"



	// $ANTLR start "featureList"
	// eiffel.g:250:1: featureList : featureName ( '\\,' featureName )* ;
	public final void featureList() throws RecognitionException {
		try {
			// eiffel.g:250:13: ( featureName ( '\\,' featureName )* )
			// eiffel.g:251:4: featureName ( '\\,' featureName )*
			{
			pushFollow(FOLLOW_featureName_in_featureList988);
			featureName();
			state._fsp--;

			// eiffel.g:252:4: ( '\\,' featureName )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==21) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// eiffel.g:252:6: '\\,' featureName
					{
					match(input,21,FOLLOW_21_in_featureList995); 
					pushFollow(FOLLOW_featureName_in_featureList997);
					featureName();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "featureList"



	// $ANTLR start "formalArguments"
	// eiffel.g:256:1: formalArguments : '\\(' entityDeclarationList '\\)' ;
	public final void formalArguments() throws RecognitionException {
		try {
			// eiffel.g:256:17: ( '\\(' entityDeclarationList '\\)' )
			// eiffel.g:257:4: '\\(' entityDeclarationList '\\)'
			{
			match(input,17,FOLLOW_17_in_formalArguments1014); 
			pushFollow(FOLLOW_entityDeclarationList_in_formalArguments1016);
			entityDeclarationList();
			state._fsp--;

			match(input,18,FOLLOW_18_in_formalArguments1018); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalArguments"



	// $ANTLR start "entityDeclarationList"
	// eiffel.g:260:1: entityDeclarationList : entityDeclarationGroup ( '\\;' entityDeclarationGroup )* ;
	public final void entityDeclarationList() throws RecognitionException {
		try {
			// eiffel.g:260:23: ( entityDeclarationGroup ( '\\;' entityDeclarationGroup )* )
			// eiffel.g:261:4: entityDeclarationGroup ( '\\;' entityDeclarationGroup )*
			{
			pushFollow(FOLLOW_entityDeclarationGroup_in_entityDeclarationList1031);
			entityDeclarationGroup();
			state._fsp--;

			// eiffel.g:262:4: ( '\\;' entityDeclarationGroup )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==31) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// eiffel.g:262:6: '\\;' entityDeclarationGroup
					{
					match(input,31,FOLLOW_31_in_entityDeclarationList1038); 
					pushFollow(FOLLOW_entityDeclarationGroup_in_entityDeclarationList1040);
					entityDeclarationGroup();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entityDeclarationList"



	// $ANTLR start "entityDeclarationGroup"
	// eiffel.g:265:1: entityDeclarationGroup : identifierList typeMark ;
	public final void entityDeclarationGroup() throws RecognitionException {
		try {
			// eiffel.g:265:24: ( identifierList typeMark )
			// eiffel.g:266:4: identifierList typeMark
			{
			pushFollow(FOLLOW_identifierList_in_entityDeclarationGroup1058);
			identifierList();
			state._fsp--;

			pushFollow(FOLLOW_typeMark_in_entityDeclarationGroup1060);
			typeMark();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entityDeclarationGroup"



	// $ANTLR start "identifierList"
	// eiffel.g:269:1: identifierList : identifier ( '\\,' identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// eiffel.g:269:16: ( identifier ( '\\,' identifier )* )
			// eiffel.g:270:4: identifier ( '\\,' identifier )*
			{
			pushFollow(FOLLOW_identifier_in_identifierList1073);
			identifier();
			state._fsp--;

			// eiffel.g:271:4: ( '\\,' identifier )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==21) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// eiffel.g:271:6: '\\,' identifier
					{
					match(input,21,FOLLOW_21_in_identifierList1080); 
					pushFollow(FOLLOW_identifier_in_identifierList1082);
					identifier();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifierList"



	// $ANTLR start "typeMark"
	// eiffel.g:274:1: typeMark : '\\:' type ;
	public final void typeMark() throws RecognitionException {
		try {
			// eiffel.g:274:10: ( '\\:' type )
			// eiffel.g:275:4: '\\:' type
			{
			match(input,29,FOLLOW_29_in_typeMark1098); 
			pushFollow(FOLLOW_type_in_typeMark1100);
			type();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeMark"



	// $ANTLR start "routine"
	// eiffel.g:279:1: routine : routineBody 'end' ;
	public final void routine() throws RecognitionException {
		try {
			// eiffel.g:279:9: ( routineBody 'end' )
			// eiffel.g:280:4: routineBody 'end'
			{
			 obsolete 
			 precondition 
			 localDeclarations 
			pushFollow(FOLLOW_routineBody_in_routine1129);
			routineBody();
			state._fsp--;

			 postcondition 
			 rescue 
			match(input,58,FOLLOW_58_in_routine1144); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "routine"



	// $ANTLR start "routineBody"
	// eiffel.g:290:1: routineBody : ( effective | deferred );
	public final void routineBody() throws RecognitionException {
		try {
			// eiffel.g:290:13: ( effective | deferred )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==55||LA21_0==62||LA21_0==79) ) {
				alt21=1;
			}
			else if ( (LA21_0==54) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// eiffel.g:291:4: effective
					{
					pushFollow(FOLLOW_effective_in_routineBody1158);
					effective();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:292:4: deferred
					{
					pushFollow(FOLLOW_deferred_in_routineBody1163);
					deferred();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "routineBody"



	// $ANTLR start "effective"
	// eiffel.g:295:1: effective : ( internal | external );
	public final void effective() throws RecognitionException {
		try {
			// eiffel.g:295:11: ( internal | external )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==55||LA22_0==79) ) {
				alt22=1;
			}
			else if ( (LA22_0==62) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// eiffel.g:296:4: internal
					{
					pushFollow(FOLLOW_internal_in_effective1176);
					internal();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:297:4: external
					{
					pushFollow(FOLLOW_external_in_effective1181);
					external();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effective"



	// $ANTLR start "internal"
	// eiffel.g:300:1: internal : routineMark ;
	public final void internal() throws RecognitionException {
		try {
			// eiffel.g:300:10: ( routineMark )
			// eiffel.g:301:4: routineMark
			{
			pushFollow(FOLLOW_routineMark_in_internal1194);
			routineMark();
			state._fsp--;

			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "internal"



	// $ANTLR start "routineMark"
	// eiffel.g:304:1: routineMark : ( 'do' | 'once' );
	public final void routineMark() throws RecognitionException {
		try {
			// eiffel.g:304:13: ( 'do' | 'once' )
			// eiffel.g:
			{
			if ( input.LA(1)==55||input.LA(1)==79 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "routineMark"



	// $ANTLR start "deferred"
	// eiffel.g:309:1: deferred : 'deferred' ;
	public final void deferred() throws RecognitionException {
		try {
			// eiffel.g:309:10: ( 'deferred' )
			// eiffel.g:310:4: 'deferred'
			{
			match(input,54,FOLLOW_54_in_deferred1227); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "deferred"



	// $ANTLR start "localDeclarations"
	// eiffel.g:314:1: localDeclarations : 'local' entityDeclarationList ;
	public final void localDeclarations() throws RecognitionException {
		try {
			// eiffel.g:314:19: ( 'local' entityDeclarationList )
			// eiffel.g:315:4: 'local' entityDeclarationList
			{
			match(input,74,FOLLOW_74_in_localDeclarations1241); 
			pushFollow(FOLLOW_entityDeclarationList_in_localDeclarations1243);
			entityDeclarationList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "localDeclarations"



	// $ANTLR start "instruction"
	// eiffel.g:319:1: instruction : ( creation | call | assignment | assignmentAttempt | conditional | multiBranch | loop | debug | check_ | retry );
	public final void instruction() throws RecognitionException {
		try {
			// eiffel.g:319:13: ( creation | call | assignment | assignmentAttempt | conditional | multiBranch | loop | debug | check_ | retry )
			int alt23=10;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt23=1;
				}
				break;
			case TK_IDENTIFIER:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 24:
				case 31:
					{
					alt23=2;
					}
					break;
				case 30:
					{
					alt23=3;
					}
					break;
				case 39:
					{
					alt23=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RESULT:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 24:
				case 31:
					{
					alt23=2;
					}
					break;
				case 30:
					{
					alt23=3;
					}
					break;
				case 39:
					{
					alt23=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case CURRENT:
				{
				alt23=2;
				}
				break;
			case 65:
				{
				alt23=5;
				}
				break;
			case 70:
				{
				alt23=6;
				}
				break;
			case 64:
				{
				alt23=7;
				}
				break;
			case 53:
				{
				alt23=8;
				}
				break;
			case 50:
				{
				alt23=9;
				}
				break;
			case 86:
				{
				alt23=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// eiffel.g:320:4: creation
					{
					pushFollow(FOLLOW_creation_in_instruction1257);
					creation();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:321:4: call
					{
					pushFollow(FOLLOW_call_in_instruction1262);
					call();
					state._fsp--;

					}
					break;
				case 3 :
					// eiffel.g:322:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_instruction1267);
					assignment();
					state._fsp--;

					}
					break;
				case 4 :
					// eiffel.g:323:4: assignmentAttempt
					{
					pushFollow(FOLLOW_assignmentAttempt_in_instruction1272);
					assignmentAttempt();
					state._fsp--;

					}
					break;
				case 5 :
					// eiffel.g:324:4: conditional
					{
					pushFollow(FOLLOW_conditional_in_instruction1277);
					conditional();
					state._fsp--;

					}
					break;
				case 6 :
					// eiffel.g:325:4: multiBranch
					{
					pushFollow(FOLLOW_multiBranch_in_instruction1282);
					multiBranch();
					state._fsp--;

					}
					break;
				case 7 :
					// eiffel.g:326:4: loop
					{
					pushFollow(FOLLOW_loop_in_instruction1287);
					loop();
					state._fsp--;

					}
					break;
				case 8 :
					// eiffel.g:327:4: debug
					{
					pushFollow(FOLLOW_debug_in_instruction1292);
					debug();
					state._fsp--;

					}
					break;
				case 9 :
					// eiffel.g:328:4: check_
					{
					pushFollow(FOLLOW_check__in_instruction1297);
					check_();
					state._fsp--;

					}
					break;
				case 10 :
					// eiffel.g:329:4: retry
					{
					pushFollow(FOLLOW_retry_in_instruction1302);
					retry();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction"



	// $ANTLR start "precondition"
	// eiffel.g:333:1: precondition : 'require' ;
	public final void precondition() throws RecognitionException {
		try {
			// eiffel.g:333:14: ( 'require' )
			// eiffel.g:334:4: 'require'
			{
			match(input,84,FOLLOW_84_in_precondition1316); 
			 'else' 
			 assertion 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "precondition"



	// $ANTLR start "postcondition"
	// eiffel.g:337:1: postcondition : 'ensure' ;
	public final void postcondition() throws RecognitionException {
		try {
			// eiffel.g:337:15: ( 'ensure' )
			// eiffel.g:338:4: 'ensure'
			{
			match(input,59,FOLLOW_59_in_postcondition1333); 
			 'then' 
			 assertion 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postcondition"



	// $ANTLR start "invariant"
	// eiffel.g:341:1: invariant : 'invariant' ;
	public final void invariant() throws RecognitionException {
		try {
			// eiffel.g:341:11: ( 'invariant' )
			// eiffel.g:342:4: 'invariant'
			{
			match(input,71,FOLLOW_71_in_invariant1350); 
			 assertion 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "invariant"



	// $ANTLR start "assertion"
	// eiffel.g:345:1: assertion : assertionClause ( '\\;' assertionClause )* ;
	public final void assertion() throws RecognitionException {
		try {
			// eiffel.g:345:11: ( assertionClause ( '\\;' assertionClause )* )
			// eiffel.g:346:4: assertionClause ( '\\;' assertionClause )*
			{
			pushFollow(FOLLOW_assertionClause_in_assertion1365);
			assertionClause();
			state._fsp--;

			// eiffel.g:347:4: ( '\\;' assertionClause )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==31) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// eiffel.g:347:6: '\\;' assertionClause
					{
					match(input,31,FOLLOW_31_in_assertion1372); 
					pushFollow(FOLLOW_assertionClause_in_assertion1374);
					assertionClause();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assertion"



	// $ANTLR start "assertionClause"
	// eiffel.g:350:1: assertionClause : ( unlabeledAssertionClause | tagMark );
	public final void assertionClause() throws RecognitionException {
		try {
			// eiffel.g:350:17: ( unlabeledAssertionClause | tagMark )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= CURRENT && LA25_0 <= TK_CHARACTER_CONSTANT)||(LA25_0 >= TK_INTEGER && LA25_0 <= TRUE_VAL)||LA25_0==17||LA25_0==33||LA25_0==88) ) {
				alt25=1;
			}
			else if ( (LA25_0==TK_IDENTIFIER) ) {
				int LA25_2 = input.LA(2);
				if ( (LA25_2==EOF||LA25_2==TK_FREE_OPERATOR||(LA25_2 >= 19 && LA25_2 <= 20)||LA25_2==22||LA25_2==24||(LA25_2 >= 26 && LA25_2 <= 28)||(LA25_2 >= 31 && LA25_2 <= 32)||(LA25_2 >= 34 && LA25_2 <= 37)||LA25_2==41||LA25_2==43||LA25_2==48||LA25_2==66||LA25_2==80||LA25_2==95) ) {
					alt25=1;
				}
				else if ( (LA25_2==29) ) {
					alt25=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// eiffel.g:351:4: unlabeledAssertionClause
					{
					 tagMark 
					pushFollow(FOLLOW_unlabeledAssertionClause_in_assertionClause1394);
					unlabeledAssertionClause();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:352:4: tagMark
					{
					pushFollow(FOLLOW_tagMark_in_assertionClause1399);
					tagMark();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assertionClause"



	// $ANTLR start "unlabeledAssertionClause"
	// eiffel.g:355:1: unlabeledAssertionClause : booleanExpression ;
	public final void unlabeledAssertionClause() throws RecognitionException {
		try {
			// eiffel.g:355:26: ( booleanExpression )
			// eiffel.g:356:4: booleanExpression
			{
			pushFollow(FOLLOW_booleanExpression_in_unlabeledAssertionClause1414);
			booleanExpression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unlabeledAssertionClause"



	// $ANTLR start "tagMark"
	// eiffel.g:359:1: tagMark : tag '\\:' ;
	public final void tagMark() throws RecognitionException {
		try {
			// eiffel.g:359:9: ( tag '\\:' )
			// eiffel.g:360:4: tag '\\:'
			{
			pushFollow(FOLLOW_tag_in_tagMark1427);
			tag();
			state._fsp--;

			match(input,29,FOLLOW_29_in_tagMark1429); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMark"



	// $ANTLR start "tag"
	// eiffel.g:363:1: tag : identifier ;
	public final void tag() throws RecognitionException {
		try {
			// eiffel.g:363:5: ( identifier )
			// eiffel.g:364:4: identifier
			{
			pushFollow(FOLLOW_identifier_in_tag1442);
			identifier();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tag"



	// $ANTLR start "check_"
	// eiffel.g:375:1: check_ : 'check' 'end' ;
	public final void check_() throws RecognitionException {
		try {
			// eiffel.g:375:8: ( 'check' 'end' )
			// eiffel.g:376:4: 'check' 'end'
			{
			match(input,50,FOLLOW_50_in_check_1460); 
			 assertion 
			match(input,58,FOLLOW_58_in_check_1464); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "check_"



	// $ANTLR start "variant"
	// eiffel.g:380:1: variant : 'variant' expression ;
	public final void variant() throws RecognitionException {
		try {
			// eiffel.g:380:9: ( 'variant' expression )
			// eiffel.g:381:4: 'variant' expression
			{
			match(input,93,FOLLOW_93_in_variant1478); 
			 tagMark 
			pushFollow(FOLLOW_expression_in_variant1482);
			expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variant"



	// $ANTLR start "redefine"
	// eiffel.g:385:1: redefine : 'redefine' featureList ;
	public final void redefine() throws RecognitionException {
		try {
			// eiffel.g:385:10: ( 'redefine' featureList )
			// eiffel.g:386:4: 'redefine' featureList
			{
			match(input,82,FOLLOW_82_in_redefine1496); 
			pushFollow(FOLLOW_featureList_in_redefine1498);
			featureList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "redefine"



	// $ANTLR start "undefine"
	// eiffel.g:390:1: undefine : 'undefine' featureList ;
	public final void undefine() throws RecognitionException {
		try {
			// eiffel.g:390:10: ( 'undefine' featureList )
			// eiffel.g:391:4: 'undefine' featureList
			{
			match(input,90,FOLLOW_90_in_undefine1512); 
			pushFollow(FOLLOW_featureList_in_undefine1514);
			featureList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "undefine"



	// $ANTLR start "select"
	// eiffel.g:395:1: select : 'select' featureList ;
	public final void select() throws RecognitionException {
		try {
			// eiffel.g:395:8: ( 'select' featureList )
			// eiffel.g:396:4: 'select' featureList
			{
			match(input,87,FOLLOW_87_in_select1528); 
			pushFollow(FOLLOW_featureList_in_select1530);
			featureList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select"



	// $ANTLR start "type"
	// eiffel.g:400:1: type : ( classType | classTypeExpanded | anchored );
	public final void type() throws RecognitionException {
		try {
			// eiffel.g:400:6: ( classType | classTypeExpanded | anchored )
			int alt26=3;
			switch ( input.LA(1) ) {
			case TK_IDENTIFIER:
				{
				alt26=1;
				}
				break;
			case 60:
				{
				alt26=2;
				}
				break;
			case 73:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// eiffel.g:402:3: classType
					{
					pushFollow(FOLLOW_classType_in_type1545);
					classType();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:403:4: classTypeExpanded
					{
					pushFollow(FOLLOW_classTypeExpanded_in_type1550);
					classTypeExpanded();
					state._fsp--;

					}
					break;
				case 3 :
					// eiffel.g:404:4: anchored
					{
					pushFollow(FOLLOW_anchored_in_type1557);
					anchored();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "classType"
	// eiffel.g:408:1: classType : className ;
	public final void classType() throws RecognitionException {
		try {
			// eiffel.g:408:11: ( className )
			// eiffel.g:409:4: className
			{
			pushFollow(FOLLOW_className_in_classType1572);
			className();
			state._fsp--;

			 actualGenerics 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classType"



	// $ANTLR start "actualGenerics"
	// eiffel.g:412:1: actualGenerics : '\\[' typeList '\\]' ;
	public final void actualGenerics() throws RecognitionException {
		try {
			// eiffel.g:412:16: ( '\\[' typeList '\\]' )
			// eiffel.g:413:4: '\\[' typeList '\\]'
			{
			match(input,40,FOLLOW_40_in_actualGenerics1587); 
			pushFollow(FOLLOW_typeList_in_actualGenerics1589);
			typeList();
			state._fsp--;

			match(input,42,FOLLOW_42_in_actualGenerics1591); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actualGenerics"



	// $ANTLR start "typeList"
	// eiffel.g:416:1: typeList : type ( '\\,' type )* ;
	public final void typeList() throws RecognitionException {
		try {
			// eiffel.g:416:10: ( type ( '\\,' type )* )
			// eiffel.g:417:4: type ( '\\,' type )*
			{
			pushFollow(FOLLOW_type_in_typeList1604);
			type();
			state._fsp--;

			// eiffel.g:418:4: ( '\\,' type )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==21) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// eiffel.g:418:6: '\\,' type
					{
					match(input,21,FOLLOW_21_in_typeList1611); 
					pushFollow(FOLLOW_type_in_typeList1613);
					type();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeList"



	// $ANTLR start "classTypeExpanded"
	// eiffel.g:421:1: classTypeExpanded : 'expanded' className ;
	public final void classTypeExpanded() throws RecognitionException {
		try {
			// eiffel.g:421:19: ( 'expanded' className )
			// eiffel.g:422:4: 'expanded' className
			{
			match(input,60,FOLLOW_60_in_classTypeExpanded1629); 
			pushFollow(FOLLOW_className_in_classTypeExpanded1631);
			className();
			state._fsp--;

			 actualGenerics 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classTypeExpanded"



	// $ANTLR start "anchored"
	// eiffel.g:429:1: anchored : 'like' anchor ;
	public final void anchored() throws RecognitionException {
		try {
			// eiffel.g:429:10: ( 'like' anchor )
			// eiffel.g:430:4: 'like' anchor
			{
			match(input,73,FOLLOW_73_in_anchored1650); 
			pushFollow(FOLLOW_anchor_in_anchored1652);
			anchor();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "anchored"



	// $ANTLR start "anchor"
	// eiffel.g:433:1: anchor : ( identifier | CURRENT );
	public final void anchor() throws RecognitionException {
		try {
			// eiffel.g:433:8: ( identifier | CURRENT )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==TK_IDENTIFIER) ) {
				alt28=1;
			}
			else if ( (LA28_0==CURRENT) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// eiffel.g:434:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_anchor1665);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:435:4: CURRENT
					{
					match(input,CURRENT,FOLLOW_CURRENT_in_anchor1670); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "anchor"



	// $ANTLR start "compound"
	// eiffel.g:439:1: compound : instruction ( '\\;' instruction )* ;
	public final void compound() throws RecognitionException {
		try {
			// eiffel.g:439:10: ( instruction ( '\\;' instruction )* )
			// eiffel.g:440:4: instruction ( '\\;' instruction )*
			{
			pushFollow(FOLLOW_instruction_in_compound1684);
			instruction();
			state._fsp--;

			// eiffel.g:441:4: ( '\\;' instruction )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==31) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// eiffel.g:441:6: '\\;' instruction
					{
					match(input,31,FOLLOW_31_in_compound1691); 
					pushFollow(FOLLOW_instruction_in_compound1693);
					instruction();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			 '\;' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compound"



	// $ANTLR start "conditional"
	// eiffel.g:445:1: conditional : 'if' thenPartList 'end' ;
	public final void conditional() throws RecognitionException {
		try {
			// eiffel.g:445:13: ( 'if' thenPartList 'end' )
			// eiffel.g:446:4: 'if' thenPartList 'end'
			{
			match(input,65,FOLLOW_65_in_conditional1712); 
			pushFollow(FOLLOW_thenPartList_in_conditional1714);
			thenPartList();
			state._fsp--;

			 elsePart 
			match(input,58,FOLLOW_58_in_conditional1718); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditional"



	// $ANTLR start "thenPartList"
	// eiffel.g:449:1: thenPartList : thenPart ( 'elseif' thenPart )* ;
	public final void thenPartList() throws RecognitionException {
		try {
			// eiffel.g:449:14: ( thenPart ( 'elseif' thenPart )* )
			// eiffel.g:450:4: thenPart ( 'elseif' thenPart )*
			{
			pushFollow(FOLLOW_thenPart_in_thenPartList1731);
			thenPart();
			state._fsp--;

			// eiffel.g:451:4: ( 'elseif' thenPart )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==57) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// eiffel.g:451:6: 'elseif' thenPart
					{
					match(input,57,FOLLOW_57_in_thenPartList1738); 
					pushFollow(FOLLOW_thenPart_in_thenPartList1740);
					thenPart();
					state._fsp--;

					}
					break;

				default :
					break loop30;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "thenPartList"



	// $ANTLR start "thenPart"
	// eiffel.g:454:1: thenPart : booleanExpression 'then' ;
	public final void thenPart() throws RecognitionException {
		try {
			// eiffel.g:454:10: ( booleanExpression 'then' )
			// eiffel.g:455:4: booleanExpression 'then'
			{
			pushFollow(FOLLOW_booleanExpression_in_thenPart1756);
			booleanExpression();
			state._fsp--;

			match(input,89,FOLLOW_89_in_thenPart1758); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "thenPart"



	// $ANTLR start "elsePart"
	// eiffel.g:458:1: elsePart : 'else' ;
	public final void elsePart() throws RecognitionException {
		try {
			// eiffel.g:458:10: ( 'else' )
			// eiffel.g:459:4: 'else'
			{
			match(input,56,FOLLOW_56_in_elsePart1773); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elsePart"



	// $ANTLR start "multiBranch"
	// eiffel.g:463:1: multiBranch : 'inspect' expression 'end' ;
	public final void multiBranch() throws RecognitionException {
		try {
			// eiffel.g:463:13: ( 'inspect' expression 'end' )
			// eiffel.g:464:4: 'inspect' expression 'end'
			{
			match(input,70,FOLLOW_70_in_multiBranch1789); 
			pushFollow(FOLLOW_expression_in_multiBranch1791);
			expression();
			state._fsp--;

			 whenPartList 
			 elsePart 
			match(input,58,FOLLOW_58_in_multiBranch1800); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiBranch"



	// $ANTLR start "whenPartList"
	// eiffel.g:468:1: whenPartList : ( 'when' whenPart )+ ;
	public final void whenPartList() throws RecognitionException {
		try {
			// eiffel.g:468:14: ( ( 'when' whenPart )+ )
			// eiffel.g:469:4: ( 'when' whenPart )+
			{
			// eiffel.g:469:4: ( 'when' whenPart )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==94) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// eiffel.g:469:6: 'when' whenPart
					{
					match(input,94,FOLLOW_94_in_whenPartList1815); 
					pushFollow(FOLLOW_whenPart_in_whenPartList1817);
					whenPart();
					state._fsp--;

					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whenPartList"



	// $ANTLR start "whenPart"
	// eiffel.g:472:1: whenPart : choices 'then' ;
	public final void whenPart() throws RecognitionException {
		try {
			// eiffel.g:472:10: ( choices 'then' )
			// eiffel.g:473:4: choices 'then'
			{
			pushFollow(FOLLOW_choices_in_whenPart1833);
			choices();
			state._fsp--;

			match(input,89,FOLLOW_89_in_whenPart1835); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whenPart"



	// $ANTLR start "choices"
	// eiffel.g:476:1: choices : choice ( '\\,' choice )* ;
	public final void choices() throws RecognitionException {
		try {
			// eiffel.g:476:9: ( choice ( '\\,' choice )* )
			// eiffel.g:477:4: choice ( '\\,' choice )*
			{
			pushFollow(FOLLOW_choice_in_choices1850);
			choice();
			state._fsp--;

			// eiffel.g:478:4: ( '\\,' choice )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==21) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// eiffel.g:478:6: '\\,' choice
					{
					match(input,21,FOLLOW_21_in_choices1857); 
					pushFollow(FOLLOW_choice_in_choices1859);
					choice();
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choices"



	// $ANTLR start "choice"
	// eiffel.g:481:1: choice : ( constant | interval );
	public final void choice() throws RecognitionException {
		try {
			// eiffel.g:481:8: ( constant | interval )
			int alt33=2;
			switch ( input.LA(1) ) {
			case CURRENT:
			case FALSE_VAL:
			case RESULT:
			case TK_BIT_CONSTANT:
			case TK_IDENTIFIER:
			case TK_MANIFEST_STRING:
			case TK_REAL:
			case TRUE_VAL:
				{
				alt33=1;
				}
				break;
			case TK_CHARACTER_CONSTANT:
				{
				int LA33_2 = input.LA(2);
				if ( (LA33_2==21||LA33_2==89) ) {
					alt33=1;
				}
				else if ( (LA33_2==25) ) {
					alt33=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TK_INTEGER:
				{
				int LA33_3 = input.LA(2);
				if ( (LA33_3==21||LA33_3==89) ) {
					alt33=1;
				}
				else if ( (LA33_3==25) ) {
					alt33=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// eiffel.g:482:4: constant
					{
					pushFollow(FOLLOW_constant_in_choice1875);
					constant();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:483:4: interval
					{
					pushFollow(FOLLOW_interval_in_choice1880);
					interval();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choice"



	// $ANTLR start "interval"
	// eiffel.g:486:1: interval : ( integerInterval | characterInterval );
	public final void interval() throws RecognitionException {
		try {
			// eiffel.g:486:10: ( integerInterval | characterInterval )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==TK_INTEGER) ) {
				alt34=1;
			}
			else if ( (LA34_0==TK_CHARACTER_CONSTANT) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// eiffel.g:487:4: integerInterval
					{
					pushFollow(FOLLOW_integerInterval_in_interval1893);
					integerInterval();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:488:4: characterInterval
					{
					pushFollow(FOLLOW_characterInterval_in_interval1898);
					characterInterval();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interval"



	// $ANTLR start "integerInterval"
	// eiffel.g:491:1: integerInterval : integerConstant '\\.\\.' integerConstant ;
	public final void integerInterval() throws RecognitionException {
		try {
			// eiffel.g:491:17: ( integerConstant '\\.\\.' integerConstant )
			// eiffel.g:492:4: integerConstant '\\.\\.' integerConstant
			{
			pushFollow(FOLLOW_integerConstant_in_integerInterval1911);
			integerConstant();
			state._fsp--;

			match(input,25,FOLLOW_25_in_integerInterval1913); 
			pushFollow(FOLLOW_integerConstant_in_integerInterval1915);
			integerConstant();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "integerInterval"



	// $ANTLR start "characterInterval"
	// eiffel.g:495:1: characterInterval : characterConstant '\\.\\.' characterConstant ;
	public final void characterInterval() throws RecognitionException {
		try {
			// eiffel.g:495:19: ( characterConstant '\\.\\.' characterConstant )
			// eiffel.g:496:4: characterConstant '\\.\\.' characterConstant
			{
			pushFollow(FOLLOW_characterConstant_in_characterInterval1928);
			characterConstant();
			state._fsp--;

			match(input,25,FOLLOW_25_in_characterInterval1930); 
			pushFollow(FOLLOW_characterConstant_in_characterInterval1932);
			characterConstant();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "characterInterval"



	// $ANTLR start "loop"
	// eiffel.g:500:1: loop : initialization loopBody 'end' ;
	public final void loop() throws RecognitionException {
		try {
			// eiffel.g:500:6: ( initialization loopBody 'end' )
			// eiffel.g:501:4: initialization loopBody 'end'
			{
			pushFollow(FOLLOW_initialization_in_loop1946);
			initialization();
			state._fsp--;

			 invariant 
			 variant 
			pushFollow(FOLLOW_loopBody_in_loop1961);
			loopBody();
			state._fsp--;

			match(input,58,FOLLOW_58_in_loop1966); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "loop"



	// $ANTLR start "initialization"
	// eiffel.g:509:1: initialization : 'from' ;
	public final void initialization() throws RecognitionException {
		try {
			// eiffel.g:509:16: ( 'from' )
			// eiffel.g:510:4: 'from'
			{
			match(input,64,FOLLOW_64_in_initialization1980); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "initialization"



	// $ANTLR start "loopBody"
	// eiffel.g:513:1: loopBody : exit_ 'loop' ;
	public final void loopBody() throws RecognitionException {
		try {
			// eiffel.g:513:10: ( exit_ 'loop' )
			// eiffel.g:514:4: exit_ 'loop'
			{
			pushFollow(FOLLOW_exit__in_loopBody1995);
			exit_();
			state._fsp--;

			match(input,75,FOLLOW_75_in_loopBody1997); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "loopBody"



	// $ANTLR start "exit_"
	// eiffel.g:517:1: exit_ : 'until' booleanExpression ;
	public final void exit_() throws RecognitionException {
		try {
			// eiffel.g:517:7: ( 'until' booleanExpression )
			// eiffel.g:518:4: 'until' booleanExpression
			{
			match(input,92,FOLLOW_92_in_exit_2012); 
			pushFollow(FOLLOW_booleanExpression_in_exit_2014);
			booleanExpression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exit_"



	// $ANTLR start "debug"
	// eiffel.g:522:1: debug : 'debug' debugBody 'end' ;
	public final void debug() throws RecognitionException {
		try {
			// eiffel.g:522:7: ( 'debug' debugBody 'end' )
			// eiffel.g:523:4: 'debug' debugBody 'end'
			{
			match(input,53,FOLLOW_53_in_debug2028); 
			pushFollow(FOLLOW_debugBody_in_debug2030);
			debugBody();
			state._fsp--;

			match(input,58,FOLLOW_58_in_debug2032); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debug"



	// $ANTLR start "debugBody"
	// eiffel.g:526:1: debugBody : ( '\\(' debugKeyList '\\)' )? ;
	public final void debugBody() throws RecognitionException {
		try {
			// eiffel.g:526:11: ( ( '\\(' debugKeyList '\\)' )? )
			// eiffel.g:527:4: ( '\\(' debugKeyList '\\)' )?
			{
			// eiffel.g:527:4: ( '\\(' debugKeyList '\\)' )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==17) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// eiffel.g:527:6: '\\(' debugKeyList '\\)'
					{
					match(input,17,FOLLOW_17_in_debugBody2047); 
					pushFollow(FOLLOW_debugKeyList_in_debugBody2049);
					debugKeyList();
					state._fsp--;

					match(input,18,FOLLOW_18_in_debugBody2051); 
					 compound 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debugBody"



	// $ANTLR start "debugKeyList"
	// eiffel.g:530:1: debugKeyList : debugKey ( '\\,' debugKey )* ;
	public final void debugKeyList() throws RecognitionException {
		try {
			// eiffel.g:530:14: ( debugKey ( '\\,' debugKey )* )
			// eiffel.g:531:4: debugKey ( '\\,' debugKey )*
			{
			pushFollow(FOLLOW_debugKey_in_debugKeyList2069);
			debugKey();
			state._fsp--;

			// eiffel.g:532:4: ( '\\,' debugKey )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==21) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// eiffel.g:532:6: '\\,' debugKey
					{
					match(input,21,FOLLOW_21_in_debugKeyList2076); 
					pushFollow(FOLLOW_debugKey_in_debugKeyList2078);
					debugKey();
					state._fsp--;

					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debugKeyList"



	// $ANTLR start "debugKey"
	// eiffel.g:535:1: debugKey : manifestString ;
	public final void debugKey() throws RecognitionException {
		try {
			// eiffel.g:535:10: ( manifestString )
			// eiffel.g:536:4: manifestString
			{
			pushFollow(FOLLOW_manifestString_in_debugKey2094);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debugKey"



	// $ANTLR start "rescue"
	// eiffel.g:540:1: rescue : 'rescue' ;
	public final void rescue() throws RecognitionException {
		try {
			// eiffel.g:540:8: ( 'rescue' )
			// eiffel.g:541:4: 'rescue'
			{
			match(input,85,FOLLOW_85_in_rescue2108); 
			 compound 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rescue"



	// $ANTLR start "retry"
	// eiffel.g:544:1: retry : 'retry' ;
	public final void retry() throws RecognitionException {
		try {
			// eiffel.g:544:7: ( 'retry' )
			// eiffel.g:545:4: 'retry'
			{
			match(input,86,FOLLOW_86_in_retry2123); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "retry"



	// $ANTLR start "unique"
	// eiffel.g:549:1: unique : 'unique' ;
	public final void unique() throws RecognitionException {
		try {
			// eiffel.g:549:8: ( 'unique' )
			// eiffel.g:550:4: 'unique'
			{
			match(input,91,FOLLOW_91_in_unique2137); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unique"



	// $ANTLR start "entity"
	// eiffel.g:554:1: entity : ( identifier | RESULT | CURRENT );
	public final void entity() throws RecognitionException {
		try {
			// eiffel.g:554:8: ( identifier | RESULT | CURRENT )
			int alt37=3;
			switch ( input.LA(1) ) {
			case TK_IDENTIFIER:
				{
				alt37=1;
				}
				break;
			case RESULT:
				{
				alt37=2;
				}
				break;
			case CURRENT:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// eiffel.g:555:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_entity2151);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:556:4: RESULT
					{
					match(input,RESULT,FOLLOW_RESULT_in_entity2158); 
					}
					break;
				case 3 :
					// eiffel.g:557:4: CURRENT
					{
					match(input,CURRENT,FOLLOW_CURRENT_in_entity2165); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entity"



	// $ANTLR start "writable"
	// eiffel.g:561:1: writable : local ;
	public final void writable() throws RecognitionException {
		try {
			// eiffel.g:561:10: ( local )
			// eiffel.g:563:7: local
			{
			pushFollow(FOLLOW_local_in_writable2187);
			local();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "writable"



	// $ANTLR start "attribute"
	// eiffel.g:567:1: attribute : identifier ;
	public final void attribute() throws RecognitionException {
		try {
			// eiffel.g:567:11: ( identifier )
			// eiffel.g:568:4: identifier
			{
			pushFollow(FOLLOW_identifier_in_attribute2202);
			identifier();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attribute"



	// $ANTLR start "local"
	// eiffel.g:571:1: local : ( identifier | RESULT );
	public final void local() throws RecognitionException {
		try {
			// eiffel.g:571:7: ( identifier | RESULT )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==TK_IDENTIFIER) ) {
				alt38=1;
			}
			else if ( (LA38_0==RESULT) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// eiffel.g:572:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_local2215);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:573:4: RESULT
					{
					match(input,RESULT,FOLLOW_RESULT_in_local2220); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "local"



	// $ANTLR start "creators"
	// eiffel.g:588:1: creators : 'creation' creationClause ( 'creation' creationClause )* ;
	public final void creators() throws RecognitionException {
		try {
			// eiffel.g:588:10: ( 'creation' creationClause ( 'creation' creationClause )* )
			// eiffel.g:589:4: 'creation' creationClause ( 'creation' creationClause )*
			{
			match(input,52,FOLLOW_52_in_creators2237); 
			pushFollow(FOLLOW_creationClause_in_creators2239);
			creationClause();
			state._fsp--;

			// eiffel.g:590:4: ( 'creation' creationClause )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==52) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// eiffel.g:590:6: 'creation' creationClause
					{
					match(input,52,FOLLOW_52_in_creators2246); 
					pushFollow(FOLLOW_creationClause_in_creators2248);
					creationClause();
					state._fsp--;

					}
					break;

				default :
					break loop39;
				}
			}

			 'creation' 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creators"



	// $ANTLR start "creationClause"
	// eiffel.g:593:1: creationClause : featureList ;
	public final void creationClause() throws RecognitionException {
		try {
			// eiffel.g:593:16: ( featureList )
			// eiffel.g:594:4: featureList
			{
			 clients 
			pushFollow(FOLLOW_featureList_in_creationClause2268);
			featureList();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creationClause"



	// $ANTLR start "creation"
	// eiffel.g:598:1: creation : '\\!' '\\!' writable ;
	public final void creation() throws RecognitionException {
		try {
			// eiffel.g:598:10: ( '\\!' '\\!' writable )
			// eiffel.g:599:4: '\\!' '\\!' writable
			{
			match(input,15,FOLLOW_15_in_creation2282); 
			 type 
			match(input,15,FOLLOW_15_in_creation2286); 
			pushFollow(FOLLOW_writable_in_creation2288);
			writable();
			state._fsp--;

			 creationCall 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creation"



	// $ANTLR start "creationCall"
	// eiffel.g:602:1: creationCall : '\\.' unqualifiedCall ;
	public final void creationCall() throws RecognitionException {
		try {
			// eiffel.g:602:14: ( '\\.' unqualifiedCall )
			// eiffel.g:603:4: '\\.' unqualifiedCall
			{
			match(input,24,FOLLOW_24_in_creationCall2303); 
			pushFollow(FOLLOW_unqualifiedCall_in_creationCall2305);
			unqualifiedCall();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creationCall"



	// $ANTLR start "assignment"
	// eiffel.g:607:1: assignment : writable '\\:\\=' expression ;
	public final void assignment() throws RecognitionException {
		try {
			// eiffel.g:607:12: ( writable '\\:\\=' expression )
			// eiffel.g:608:4: writable '\\:\\=' expression
			{
			pushFollow(FOLLOW_writable_in_assignment2319);
			writable();
			state._fsp--;

			match(input,30,FOLLOW_30_in_assignment2321); 
			pushFollow(FOLLOW_expression_in_assignment2323);
			expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignmentAttempt"
	// eiffel.g:612:1: assignmentAttempt : writable '\\?\\=' expression ;
	public final void assignmentAttempt() throws RecognitionException {
		try {
			// eiffel.g:612:19: ( writable '\\?\\=' expression )
			// eiffel.g:613:4: writable '\\?\\=' expression
			{
			pushFollow(FOLLOW_writable_in_assignmentAttempt2337);
			writable();
			state._fsp--;

			match(input,39,FOLLOW_39_in_assignmentAttempt2339); 
			pushFollow(FOLLOW_expression_in_assignmentAttempt2341);
			expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignmentAttempt"



	// $ANTLR start "call"
	// eiffel.g:617:1: call : callChain ;
	public final void call() throws RecognitionException {
		try {
			// eiffel.g:617:6: ( callChain )
			// eiffel.g:618:4: callChain
			{
			 parenthesizedQualifier 
			pushFollow(FOLLOW_callChain_in_call2357);
			callChain();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "call"



	// $ANTLR start "parenthesizedQualifier"
	// eiffel.g:621:1: parenthesizedQualifier : parenthesized '\\.' ;
	public final void parenthesizedQualifier() throws RecognitionException {
		try {
			// eiffel.g:621:24: ( parenthesized '\\.' )
			// eiffel.g:622:4: parenthesized '\\.'
			{
			pushFollow(FOLLOW_parenthesized_in_parenthesizedQualifier2370);
			parenthesized();
			state._fsp--;

			match(input,24,FOLLOW_24_in_parenthesizedQualifier2372); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parenthesizedQualifier"



	// $ANTLR start "callChain"
	// eiffel.g:625:1: callChain : unqualifiedCall ( '\\.' unqualifiedCall )* ;
	public final void callChain() throws RecognitionException {
		try {
			// eiffel.g:625:11: ( unqualifiedCall ( '\\.' unqualifiedCall )* )
			// eiffel.g:626:4: unqualifiedCall ( '\\.' unqualifiedCall )*
			{
			pushFollow(FOLLOW_unqualifiedCall_in_callChain2385);
			unqualifiedCall();
			state._fsp--;

			// eiffel.g:627:4: ( '\\.' unqualifiedCall )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==24) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// eiffel.g:627:6: '\\.' unqualifiedCall
					{
					match(input,24,FOLLOW_24_in_callChain2392); 
					pushFollow(FOLLOW_unqualifiedCall_in_callChain2394);
					unqualifiedCall();
					state._fsp--;

					}
					break;

				default :
					break loop40;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "callChain"



	// $ANTLR start "unqualifiedCall"
	// eiffel.g:630:1: unqualifiedCall : entity ;
	public final void unqualifiedCall() throws RecognitionException {
		try {
			// eiffel.g:630:17: ( entity )
			// eiffel.g:631:4: entity
			{
			pushFollow(FOLLOW_entity_in_unqualifiedCall2410);
			entity();
			state._fsp--;

			 actuals 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unqualifiedCall"



	// $ANTLR start "actuals"
	// eiffel.g:635:1: actuals : '\\(' actualList '\\)' ;
	public final void actuals() throws RecognitionException {
		try {
			// eiffel.g:635:9: ( '\\(' actualList '\\)' )
			// eiffel.g:636:4: '\\(' actualList '\\)'
			{
			match(input,17,FOLLOW_17_in_actuals2426); 
			pushFollow(FOLLOW_actualList_in_actuals2428);
			actualList();
			state._fsp--;

			match(input,18,FOLLOW_18_in_actuals2430); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actuals"



	// $ANTLR start "actualList"
	// eiffel.g:639:1: actualList : actual ( '\\,' actual )* ;
	public final void actualList() throws RecognitionException {
		try {
			// eiffel.g:639:12: ( actual ( '\\,' actual )* )
			// eiffel.g:640:4: actual ( '\\,' actual )*
			{
			pushFollow(FOLLOW_actual_in_actualList2443);
			actual();
			state._fsp--;

			// eiffel.g:641:4: ( '\\,' actual )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==21) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// eiffel.g:641:6: '\\,' actual
					{
					match(input,21,FOLLOW_21_in_actualList2450); 
					pushFollow(FOLLOW_actual_in_actualList2452);
					actual();
					state._fsp--;

					}
					break;

				default :
					break loop41;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actualList"



	// $ANTLR start "actual"
	// eiffel.g:644:1: actual : ( expression | address );
	public final void actual() throws RecognitionException {
		try {
			// eiffel.g:644:8: ( expression | address )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( ((LA42_0 >= CURRENT && LA42_0 <= TK_CHARACTER_CONSTANT)||(LA42_0 >= TK_IDENTIFIER && LA42_0 <= TRUE_VAL)||LA42_0==17||LA42_0==33||LA42_0==88) ) {
				alt42=1;
			}
			else if ( (LA42_0==16) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// eiffel.g:645:4: expression
					{
					pushFollow(FOLLOW_expression_in_actual2468);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:646:4: address
					{
					pushFollow(FOLLOW_address_in_actual2473);
					address();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actual"



	// $ANTLR start "address"
	// eiffel.g:649:1: address : '\\$' identifier ;
	public final void address() throws RecognitionException {
		try {
			// eiffel.g:649:9: ( '\\$' identifier )
			// eiffel.g:650:4: '\\$' identifier
			{
			match(input,16,FOLLOW_16_in_address2486); 
			pushFollow(FOLLOW_identifier_in_address2488);
			identifier();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "address"



	// $ANTLR start "booleanExpression"
	// eiffel.g:666:1: booleanExpression : expression ;
	public final void booleanExpression() throws RecognitionException {
		try {
			// eiffel.g:666:19: ( expression )
			// eiffel.g:667:4: expression
			{
			pushFollow(FOLLOW_expression_in_booleanExpression2505);
			expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "booleanExpression"



	// $ANTLR start "expression"
	// eiffel.g:672:1: expression : ( manifestArray | expPrec3 );
	public final void expression() throws RecognitionException {
		try {
			// eiffel.g:672:12: ( manifestArray | expPrec3 )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==33) ) {
				alt43=1;
			}
			else if ( ((LA43_0 >= CURRENT && LA43_0 <= TK_CHARACTER_CONSTANT)||(LA43_0 >= TK_IDENTIFIER && LA43_0 <= TRUE_VAL)||LA43_0==17||LA43_0==88) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// eiffel.g:673:4: manifestArray
					{
					pushFollow(FOLLOW_manifestArray_in_expression2521);
					manifestArray();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:674:4: expPrec3
					{
					pushFollow(FOLLOW_expPrec3_in_expression2526);
					expPrec3();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expPrec3"
	// eiffel.g:677:1: expPrec3 : expPrec4 ( opPrec3 expPrec4 )* ;
	public final void expPrec3() throws RecognitionException {
		try {
			// eiffel.g:677:10: ( expPrec4 ( opPrec3 expPrec4 )* )
			// eiffel.g:678:4: expPrec4 ( opPrec3 expPrec4 )*
			{
			pushFollow(FOLLOW_expPrec4_in_expPrec32539);
			expPrec4();
			state._fsp--;

			// eiffel.g:679:4: ( opPrec3 expPrec4 )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==66) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// eiffel.g:679:6: opPrec3 expPrec4
					{
					pushFollow(FOLLOW_opPrec3_in_expPrec32546);
					opPrec3();
					state._fsp--;

					pushFollow(FOLLOW_expPrec4_in_expPrec32548);
					expPrec4();
					state._fsp--;

					}
					break;

				default :
					break loop44;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec3"



	// $ANTLR start "opPrec3"
	// eiffel.g:682:1: opPrec3 : 'implies' ;
	public final void opPrec3() throws RecognitionException {
		try {
			// eiffel.g:682:9: ( 'implies' )
			// eiffel.g:683:4: 'implies'
			{
			match(input,66,FOLLOW_66_in_opPrec32564); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec3"



	// $ANTLR start "expPrec4"
	// eiffel.g:686:1: expPrec4 : expPrec5 ( opPrec4 expPrec5 )* ;
	public final void expPrec4() throws RecognitionException {
		try {
			// eiffel.g:686:10: ( expPrec5 ( opPrec4 expPrec5 )* )
			// eiffel.g:687:4: expPrec5 ( opPrec4 expPrec5 )*
			{
			pushFollow(FOLLOW_expPrec5_in_expPrec42577);
			expPrec5();
			state._fsp--;

			// eiffel.g:688:4: ( opPrec4 expPrec5 )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==80||LA45_0==95) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// eiffel.g:688:6: opPrec4 expPrec5
					{
					pushFollow(FOLLOW_opPrec4_in_expPrec42584);
					opPrec4();
					state._fsp--;

					pushFollow(FOLLOW_expPrec5_in_expPrec42586);
					expPrec5();
					state._fsp--;

					}
					break;

				default :
					break loop45;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec4"



	// $ANTLR start "opPrec4"
	// eiffel.g:691:1: opPrec4 : ( 'or' | 'or' 'else' | 'xor' );
	public final void opPrec4() throws RecognitionException {
		try {
			// eiffel.g:691:9: ( 'or' | 'or' 'else' | 'xor' )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==80) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==56) ) {
					alt46=2;
				}
				else if ( ((LA46_1 >= CURRENT && LA46_1 <= TK_CHARACTER_CONSTANT)||(LA46_1 >= TK_IDENTIFIER && LA46_1 <= TRUE_VAL)||LA46_1==17||LA46_1==88) ) {
					alt46=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA46_0==95) ) {
				alt46=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// eiffel.g:692:4: 'or'
					{
					match(input,80,FOLLOW_80_in_opPrec42602); 
					}
					break;
				case 2 :
					// eiffel.g:693:4: 'or' 'else'
					{
					match(input,80,FOLLOW_80_in_opPrec42607); 
					match(input,56,FOLLOW_56_in_opPrec42609); 
					}
					break;
				case 3 :
					// eiffel.g:694:4: 'xor'
					{
					match(input,95,FOLLOW_95_in_opPrec42614); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec4"



	// $ANTLR start "expPrec5"
	// eiffel.g:697:1: expPrec5 : expPrec6 ( opPrec5 expPrec6 )* ;
	public final void expPrec5() throws RecognitionException {
		try {
			// eiffel.g:697:10: ( expPrec6 ( opPrec5 expPrec6 )* )
			// eiffel.g:698:4: expPrec6 ( opPrec5 expPrec6 )*
			{
			pushFollow(FOLLOW_expPrec6_in_expPrec52627);
			expPrec6();
			state._fsp--;

			// eiffel.g:699:4: ( opPrec5 expPrec6 )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==48) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// eiffel.g:699:6: opPrec5 expPrec6
					{
					pushFollow(FOLLOW_opPrec5_in_expPrec52634);
					opPrec5();
					state._fsp--;

					pushFollow(FOLLOW_expPrec6_in_expPrec52636);
					expPrec6();
					state._fsp--;

					}
					break;

				default :
					break loop47;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec5"



	// $ANTLR start "opPrec5"
	// eiffel.g:702:1: opPrec5 : ( 'and' | 'and' 'then' );
	public final void opPrec5() throws RecognitionException {
		try {
			// eiffel.g:702:9: ( 'and' | 'and' 'then' )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==48) ) {
				int LA48_1 = input.LA(2);
				if ( (LA48_1==89) ) {
					alt48=2;
				}
				else if ( ((LA48_1 >= CURRENT && LA48_1 <= TK_CHARACTER_CONSTANT)||(LA48_1 >= TK_IDENTIFIER && LA48_1 <= TRUE_VAL)||LA48_1==17||LA48_1==88) ) {
					alt48=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// eiffel.g:703:4: 'and'
					{
					match(input,48,FOLLOW_48_in_opPrec52652); 
					}
					break;
				case 2 :
					// eiffel.g:704:4: 'and' 'then'
					{
					match(input,48,FOLLOW_48_in_opPrec52657); 
					match(input,89,FOLLOW_89_in_opPrec52659); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec5"



	// $ANTLR start "expPrec6"
	// eiffel.g:707:1: expPrec6 : expPrec7 ( opPrec6 expPrec7 )* ;
	public final void expPrec6() throws RecognitionException {
		try {
			// eiffel.g:707:10: ( expPrec7 ( opPrec6 expPrec7 )* )
			// eiffel.g:708:4: expPrec7 ( opPrec6 expPrec7 )*
			{
			pushFollow(FOLLOW_expPrec7_in_expPrec62672);
			expPrec7();
			state._fsp--;

			// eiffel.g:709:4: ( opPrec6 expPrec7 )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==28||LA49_0==32||(LA49_0 >= 34 && LA49_0 <= 37)) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// eiffel.g:709:6: opPrec6 expPrec7
					{
					pushFollow(FOLLOW_opPrec6_in_expPrec62679);
					opPrec6();
					state._fsp--;

					pushFollow(FOLLOW_expPrec7_in_expPrec62681);
					expPrec7();
					state._fsp--;

					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec6"



	// $ANTLR start "opPrec6"
	// eiffel.g:712:1: opPrec6 : ( '\\=' | '\\/\\=' | '\\<' | '\\>' | '\\<\\=' | '\\>\\=' );
	public final void opPrec6() throws RecognitionException {
		try {
			// eiffel.g:712:9: ( '\\=' | '\\/\\=' | '\\<' | '\\>' | '\\<\\=' | '\\>\\=' )
			// eiffel.g:
			{
			if ( input.LA(1)==28||input.LA(1)==32||(input.LA(1) >= 34 && input.LA(1) <= 37) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec6"



	// $ANTLR start "expPrec7"
	// eiffel.g:721:1: expPrec7 : expPrec8 ( opPrec7 expPrec8 )* ;
	public final void expPrec7() throws RecognitionException {
		try {
			// eiffel.g:721:10: ( expPrec8 ( opPrec7 expPrec8 )* )
			// eiffel.g:722:4: expPrec8 ( opPrec7 expPrec8 )*
			{
			pushFollow(FOLLOW_expPrec8_in_expPrec72735);
			expPrec8();
			state._fsp--;

			// eiffel.g:723:4: ( opPrec7 expPrec8 )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==20||LA50_0==22) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// eiffel.g:723:6: opPrec7 expPrec8
					{
					pushFollow(FOLLOW_opPrec7_in_expPrec72742);
					opPrec7();
					state._fsp--;

					pushFollow(FOLLOW_expPrec8_in_expPrec72744);
					expPrec8();
					state._fsp--;

					}
					break;

				default :
					break loop50;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec7"



	// $ANTLR start "opPrec7"
	// eiffel.g:726:1: opPrec7 : ( '\\+' | '\\-' );
	public final void opPrec7() throws RecognitionException {
		try {
			// eiffel.g:726:9: ( '\\+' | '\\-' )
			// eiffel.g:
			{
			if ( input.LA(1)==20||input.LA(1)==22 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec7"



	// $ANTLR start "expPrec8"
	// eiffel.g:731:1: expPrec8 : expPrec9 ( opPrec8 expPrec9 )* ;
	public final void expPrec8() throws RecognitionException {
		try {
			// eiffel.g:731:10: ( expPrec9 ( opPrec8 expPrec9 )* )
			// eiffel.g:732:4: expPrec9 ( opPrec8 expPrec9 )*
			{
			pushFollow(FOLLOW_expPrec9_in_expPrec82778);
			expPrec9();
			state._fsp--;

			// eiffel.g:733:4: ( opPrec8 expPrec9 )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==19||(LA51_0 >= 26 && LA51_0 <= 27)||LA51_0==41) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// eiffel.g:733:6: opPrec8 expPrec9
					{
					pushFollow(FOLLOW_opPrec8_in_expPrec82785);
					opPrec8();
					state._fsp--;

					pushFollow(FOLLOW_expPrec9_in_expPrec82787);
					expPrec9();
					state._fsp--;

					}
					break;

				default :
					break loop51;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec8"



	// $ANTLR start "opPrec8"
	// eiffel.g:736:1: opPrec8 : ( '\\*' | '\\/' | '\\/\\/' | '\\\\\\\\' );
	public final void opPrec8() throws RecognitionException {
		try {
			// eiffel.g:736:9: ( '\\*' | '\\/' | '\\/\\/' | '\\\\\\\\' )
			// eiffel.g:
			{
			if ( input.LA(1)==19||(input.LA(1) >= 26 && input.LA(1) <= 27)||input.LA(1)==41 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec8"



	// $ANTLR start "expPrec9"
	// eiffel.g:743:1: expPrec9 : expPrec10 ( opPrec9 expPrec10 )* ;
	public final void expPrec9() throws RecognitionException {
		try {
			// eiffel.g:743:10: ( expPrec10 ( opPrec9 expPrec10 )* )
			// eiffel.g:744:4: expPrec10 ( opPrec9 expPrec10 )*
			{
			pushFollow(FOLLOW_expPrec10_in_expPrec92831);
			expPrec10();
			state._fsp--;

			// eiffel.g:745:4: ( opPrec9 expPrec10 )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==43) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// eiffel.g:745:6: opPrec9 expPrec10
					{
					pushFollow(FOLLOW_opPrec9_in_expPrec92838);
					opPrec9();
					state._fsp--;

					pushFollow(FOLLOW_expPrec10_in_expPrec92840);
					expPrec10();
					state._fsp--;

					}
					break;

				default :
					break loop52;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec9"



	// $ANTLR start "opPrec9"
	// eiffel.g:748:1: opPrec9 : '\\^' ;
	public final void opPrec9() throws RecognitionException {
		try {
			// eiffel.g:748:9: ( '\\^' )
			// eiffel.g:749:4: '\\^'
			{
			match(input,43,FOLLOW_43_in_opPrec92856); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec9"



	// $ANTLR start "expPrec10"
	// eiffel.g:752:1: expPrec10 : expPrec11 ( opPrec10 expPrec11 )* ;
	public final void expPrec10() throws RecognitionException {
		try {
			// eiffel.g:752:11: ( expPrec11 ( opPrec10 expPrec11 )* )
			// eiffel.g:753:4: expPrec11 ( opPrec10 expPrec11 )*
			{
			pushFollow(FOLLOW_expPrec11_in_expPrec102869);
			expPrec11();
			state._fsp--;

			// eiffel.g:754:4: ( opPrec10 expPrec11 )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==TK_FREE_OPERATOR) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// eiffel.g:754:6: opPrec10 expPrec11
					{
					pushFollow(FOLLOW_opPrec10_in_expPrec102876);
					opPrec10();
					state._fsp--;

					pushFollow(FOLLOW_expPrec11_in_expPrec102878);
					expPrec11();
					state._fsp--;

					}
					break;

				default :
					break loop53;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec10"



	// $ANTLR start "opPrec10"
	// eiffel.g:757:1: opPrec10 : freeOperator ;
	public final void opPrec10() throws RecognitionException {
		try {
			// eiffel.g:757:10: ( freeOperator )
			// eiffel.g:758:4: freeOperator
			{
			pushFollow(FOLLOW_freeOperator_in_opPrec102894);
			freeOperator();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opPrec10"



	// $ANTLR start "expPrec11"
	// eiffel.g:761:1: expPrec11 : ( elementarExp | strip );
	public final void expPrec11() throws RecognitionException {
		try {
			// eiffel.g:761:11: ( elementarExp | strip )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( ((LA54_0 >= CURRENT && LA54_0 <= TK_CHARACTER_CONSTANT)||(LA54_0 >= TK_IDENTIFIER && LA54_0 <= TRUE_VAL)||LA54_0==17) ) {
				alt54=1;
			}
			else if ( (LA54_0==88) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// eiffel.g:762:4: elementarExp
					{
					 unaryOperators 
					pushFollow(FOLLOW_elementarExp_in_expPrec112909);
					elementarExp();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:763:4: strip
					{
					pushFollow(FOLLOW_strip_in_expPrec112914);
					strip();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expPrec11"



	// $ANTLR start "unaryOperators"
	// eiffel.g:767:1: unaryOperators : ( 'old' | 'not' | '\\+' | '\\-' | freeOperator );
	public final void unaryOperators() throws RecognitionException {
		try {
			// eiffel.g:767:16: ( 'old' | 'not' | '\\+' | '\\-' | freeOperator )
			int alt55=5;
			switch ( input.LA(1) ) {
			case 78:
				{
				alt55=1;
				}
				break;
			case 76:
				{
				alt55=2;
				}
				break;
			case 20:
				{
				alt55=3;
				}
				break;
			case 22:
				{
				alt55=4;
				}
				break;
			case TK_FREE_OPERATOR:
				{
				alt55=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// eiffel.g:768:4: 'old'
					{
					match(input,78,FOLLOW_78_in_unaryOperators2928); 
					}
					break;
				case 2 :
					// eiffel.g:769:4: 'not'
					{
					match(input,76,FOLLOW_76_in_unaryOperators2933); 
					}
					break;
				case 3 :
					// eiffel.g:770:4: '\\+'
					{
					match(input,20,FOLLOW_20_in_unaryOperators2938); 
					}
					break;
				case 4 :
					// eiffel.g:771:4: '\\-'
					{
					match(input,22,FOLLOW_22_in_unaryOperators2943); 
					}
					break;
				case 5 :
					// eiffel.g:772:4: freeOperator
					{
					pushFollow(FOLLOW_freeOperator_in_unaryOperators2948);
					freeOperator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unaryOperators"



	// $ANTLR start "elementarExp"
	// eiffel.g:775:1: elementarExp : ( parenthesized | callChain | booleanConstant | characterConstant | integer | real | manifestString | bitConstant );
	public final void elementarExp() throws RecognitionException {
		try {
			// eiffel.g:775:14: ( parenthesized | callChain | booleanConstant | characterConstant | integer | real | manifestString | bitConstant )
			int alt56=8;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt56=1;
				}
				break;
			case CURRENT:
			case RESULT:
			case TK_IDENTIFIER:
				{
				alt56=2;
				}
				break;
			case FALSE_VAL:
			case TRUE_VAL:
				{
				alt56=3;
				}
				break;
			case TK_CHARACTER_CONSTANT:
				{
				alt56=4;
				}
				break;
			case TK_INTEGER:
				{
				alt56=5;
				}
				break;
			case TK_REAL:
				{
				alt56=6;
				}
				break;
			case TK_MANIFEST_STRING:
				{
				alt56=7;
				}
				break;
			case TK_BIT_CONSTANT:
				{
				alt56=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// eiffel.g:776:4: parenthesized
					{
					pushFollow(FOLLOW_parenthesized_in_elementarExp2961);
					parenthesized();
					state._fsp--;

					 '\.' callChain 
					}
					break;
				case 2 :
					// eiffel.g:777:4: callChain
					{
					pushFollow(FOLLOW_callChain_in_elementarExp2968);
					callChain();
					state._fsp--;

					}
					break;
				case 3 :
					// eiffel.g:778:4: booleanConstant
					{
					pushFollow(FOLLOW_booleanConstant_in_elementarExp2973);
					booleanConstant();
					state._fsp--;

					}
					break;
				case 4 :
					// eiffel.g:779:4: characterConstant
					{
					pushFollow(FOLLOW_characterConstant_in_elementarExp2978);
					characterConstant();
					state._fsp--;

					}
					break;
				case 5 :
					// eiffel.g:780:4: integer
					{
					pushFollow(FOLLOW_integer_in_elementarExp2983);
					integer();
					state._fsp--;

					}
					break;
				case 6 :
					// eiffel.g:781:4: real
					{
					pushFollow(FOLLOW_real_in_elementarExp2988);
					real();
					state._fsp--;

					}
					break;
				case 7 :
					// eiffel.g:782:4: manifestString
					{
					pushFollow(FOLLOW_manifestString_in_elementarExp2993);
					manifestString();
					state._fsp--;

					}
					break;
				case 8 :
					// eiffel.g:783:4: bitConstant
					{
					pushFollow(FOLLOW_bitConstant_in_elementarExp2998);
					bitConstant();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elementarExp"



	// $ANTLR start "parenthesized"
	// eiffel.g:788:1: parenthesized : '\\(' expression '\\)' ;
	public final void parenthesized() throws RecognitionException {
		try {
			// eiffel.g:788:15: ( '\\(' expression '\\)' )
			// eiffel.g:789:4: '\\(' expression '\\)'
			{
			match(input,17,FOLLOW_17_in_parenthesized3017); 
			pushFollow(FOLLOW_expression_in_parenthesized3019);
			expression();
			state._fsp--;

			match(input,18,FOLLOW_18_in_parenthesized3021); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parenthesized"



	// $ANTLR start "constant"
	// eiffel.g:793:1: constant : ( manifestConstant | constantAttribute );
	public final void constant() throws RecognitionException {
		try {
			// eiffel.g:793:10: ( manifestConstant | constantAttribute )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==FALSE_VAL||(LA57_0 >= TK_BIT_CONSTANT && LA57_0 <= TK_CHARACTER_CONSTANT)||(LA57_0 >= TK_INTEGER && LA57_0 <= TRUE_VAL)) ) {
				alt57=1;
			}
			else if ( (LA57_0==CURRENT||LA57_0==RESULT||LA57_0==TK_IDENTIFIER) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// eiffel.g:794:4: manifestConstant
					{
					pushFollow(FOLLOW_manifestConstant_in_constant3035);
					manifestConstant();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:795:4: constantAttribute
					{
					pushFollow(FOLLOW_constantAttribute_in_constant3040);
					constantAttribute();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constant"



	// $ANTLR start "constantAttribute"
	// eiffel.g:798:1: constantAttribute : entity ;
	public final void constantAttribute() throws RecognitionException {
		try {
			// eiffel.g:798:19: ( entity )
			// eiffel.g:799:4: entity
			{
			pushFollow(FOLLOW_entity_in_constantAttribute3053);
			entity();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constantAttribute"



	// $ANTLR start "manifestConstant"
	// eiffel.g:803:1: manifestConstant : ( booleanConstant | characterConstant | integerConstant | realConstant | manifestString | bitConstant );
	public final void manifestConstant() throws RecognitionException {
		try {
			// eiffel.g:803:18: ( booleanConstant | characterConstant | integerConstant | realConstant | manifestString | bitConstant )
			int alt58=6;
			switch ( input.LA(1) ) {
			case FALSE_VAL:
			case TRUE_VAL:
				{
				alt58=1;
				}
				break;
			case TK_CHARACTER_CONSTANT:
				{
				alt58=2;
				}
				break;
			case TK_INTEGER:
				{
				alt58=3;
				}
				break;
			case TK_REAL:
				{
				alt58=4;
				}
				break;
			case TK_MANIFEST_STRING:
				{
				alt58=5;
				}
				break;
			case TK_BIT_CONSTANT:
				{
				alt58=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// eiffel.g:804:4: booleanConstant
					{
					pushFollow(FOLLOW_booleanConstant_in_manifestConstant3067);
					booleanConstant();
					state._fsp--;

					}
					break;
				case 2 :
					// eiffel.g:805:4: characterConstant
					{
					pushFollow(FOLLOW_characterConstant_in_manifestConstant3072);
					characterConstant();
					state._fsp--;

					}
					break;
				case 3 :
					// eiffel.g:806:4: integerConstant
					{
					pushFollow(FOLLOW_integerConstant_in_manifestConstant3077);
					integerConstant();
					state._fsp--;

					}
					break;
				case 4 :
					// eiffel.g:807:4: realConstant
					{
					pushFollow(FOLLOW_realConstant_in_manifestConstant3082);
					realConstant();
					state._fsp--;

					}
					break;
				case 5 :
					// eiffel.g:808:4: manifestString
					{
					pushFollow(FOLLOW_manifestString_in_manifestConstant3087);
					manifestString();
					state._fsp--;

					}
					break;
				case 6 :
					// eiffel.g:809:4: bitConstant
					{
					pushFollow(FOLLOW_bitConstant_in_manifestConstant3092);
					bitConstant();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "manifestConstant"



	// $ANTLR start "integerConstant"
	// eiffel.g:812:1: integerConstant : integer ;
	public final void integerConstant() throws RecognitionException {
		try {
			// eiffel.g:812:17: ( integer )
			// eiffel.g:813:4: integer
			{
			 sign 
			pushFollow(FOLLOW_integer_in_integerConstant3107);
			integer();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "integerConstant"



	// $ANTLR start "realConstant"
	// eiffel.g:816:1: realConstant : real ;
	public final void realConstant() throws RecognitionException {
		try {
			// eiffel.g:816:14: ( real )
			// eiffel.g:817:4: real
			{
			 sign 
			pushFollow(FOLLOW_real_in_realConstant3122);
			real();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "realConstant"



	// $ANTLR start "sign"
	// eiffel.g:820:1: sign : ( '\\+' | '\\-' );
	public final void sign() throws RecognitionException {
		try {
			// eiffel.g:820:6: ( '\\+' | '\\-' )
			// eiffel.g:
			{
			if ( input.LA(1)==20||input.LA(1)==22 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sign"



	// $ANTLR start "booleanConstant"
	// eiffel.g:826:1: booleanConstant : ( TRUE_VAL | FALSE_VAL );
	public final void booleanConstant() throws RecognitionException {
		try {
			// eiffel.g:826:17: ( TRUE_VAL | FALSE_VAL )
			// eiffel.g:
			{
			if ( input.LA(1)==FALSE_VAL||input.LA(1)==TRUE_VAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "booleanConstant"



	// $ANTLR start "manifestArray"
	// eiffel.g:832:1: manifestArray : '\\<\\<' expressionList '\\>\\>' ;
	public final void manifestArray() throws RecognitionException {
		try {
			// eiffel.g:832:15: ( '\\<\\<' expressionList '\\>\\>' )
			// eiffel.g:833:4: '\\<\\<' expressionList '\\>\\>'
			{
			match(input,33,FOLLOW_33_in_manifestArray3173); 
			pushFollow(FOLLOW_expressionList_in_manifestArray3175);
			expressionList();
			state._fsp--;

			match(input,38,FOLLOW_38_in_manifestArray3177); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "manifestArray"



	// $ANTLR start "expressionList"
	// eiffel.g:836:1: expressionList : expression ( '\\,' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// eiffel.g:836:16: ( expression ( '\\,' expression )* )
			// eiffel.g:837:4: expression ( '\\,' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList3190);
			expression();
			state._fsp--;

			// eiffel.g:838:4: ( '\\,' expression )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==21) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// eiffel.g:838:6: '\\,' expression
					{
					match(input,21,FOLLOW_21_in_expressionList3197); 
					pushFollow(FOLLOW_expression_in_expressionList3199);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop59;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expressionList"



	// $ANTLR start "strip"
	// eiffel.g:842:1: strip : 'strip' '\\(' attributeList '\\)' ;
	public final void strip() throws RecognitionException {
		try {
			// eiffel.g:842:7: ( 'strip' '\\(' attributeList '\\)' )
			// eiffel.g:843:4: 'strip' '\\(' attributeList '\\)'
			{
			match(input,88,FOLLOW_88_in_strip3216); 
			match(input,17,FOLLOW_17_in_strip3218); 
			pushFollow(FOLLOW_attributeList_in_strip3220);
			attributeList();
			state._fsp--;

			match(input,18,FOLLOW_18_in_strip3222); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "strip"



	// $ANTLR start "attributeList"
	// eiffel.g:846:1: attributeList : identifier ( '\\,' identifier )* ;
	public final void attributeList() throws RecognitionException {
		try {
			// eiffel.g:846:15: ( identifier ( '\\,' identifier )* )
			// eiffel.g:847:4: identifier ( '\\,' identifier )*
			{
			pushFollow(FOLLOW_identifier_in_attributeList3235);
			identifier();
			state._fsp--;

			// eiffel.g:848:4: ( '\\,' identifier )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==21) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// eiffel.g:848:6: '\\,' identifier
					{
					match(input,21,FOLLOW_21_in_attributeList3242); 
					pushFollow(FOLLOW_identifier_in_attributeList3244);
					identifier();
					state._fsp--;

					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "attributeList"



	// $ANTLR start "external"
	// eiffel.g:852:1: external : 'external' languageName ;
	public final void external() throws RecognitionException {
		try {
			// eiffel.g:852:10: ( 'external' languageName )
			// eiffel.g:853:4: 'external' languageName
			{
			match(input,62,FOLLOW_62_in_external3261); 
			pushFollow(FOLLOW_languageName_in_external3263);
			languageName();
			state._fsp--;

			 externalName 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "external"



	// $ANTLR start "languageName"
	// eiffel.g:856:1: languageName : manifestString ;
	public final void languageName() throws RecognitionException {
		try {
			// eiffel.g:856:14: ( manifestString )
			// eiffel.g:857:4: manifestString
			{
			pushFollow(FOLLOW_manifestString_in_languageName3278);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "languageName"



	// $ANTLR start "externalName"
	// eiffel.g:860:1: externalName : 'alias' manifestString ;
	public final void externalName() throws RecognitionException {
		try {
			// eiffel.g:860:14: ( 'alias' manifestString )
			// eiffel.g:861:4: 'alias' manifestString
			{
			match(input,46,FOLLOW_46_in_externalName3291); 
			pushFollow(FOLLOW_manifestString_in_externalName3293);
			manifestString();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "externalName"



	// $ANTLR start "identifier"
	// eiffel.g:864:1: identifier : TK_IDENTIFIER ;
	public final void identifier() throws RecognitionException {
		try {
			// eiffel.g:864:12: ( TK_IDENTIFIER )
			// eiffel.g:865:4: TK_IDENTIFIER
			{
			match(input,TK_IDENTIFIER,FOLLOW_TK_IDENTIFIER_in_identifier3306); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "manifestString"
	// eiffel.g:868:1: manifestString : TK_MANIFEST_STRING ;
	public final void manifestString() throws RecognitionException {
		try {
			// eiffel.g:868:16: ( TK_MANIFEST_STRING )
			// eiffel.g:869:4: TK_MANIFEST_STRING
			{
			match(input,TK_MANIFEST_STRING,FOLLOW_TK_MANIFEST_STRING_in_manifestString3319); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "manifestString"



	// $ANTLR start "integer"
	// eiffel.g:872:1: integer : TK_INTEGER ;
	public final void integer() throws RecognitionException {
		try {
			// eiffel.g:872:9: ( TK_INTEGER )
			// eiffel.g:873:4: TK_INTEGER
			{
			match(input,TK_INTEGER,FOLLOW_TK_INTEGER_in_integer3332); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "integer"



	// $ANTLR start "real"
	// eiffel.g:876:1: real : TK_REAL ;
	public final void real() throws RecognitionException {
		try {
			// eiffel.g:876:6: ( TK_REAL )
			// eiffel.g:877:4: TK_REAL
			{
			match(input,TK_REAL,FOLLOW_TK_REAL_in_real3345); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "real"



	// $ANTLR start "bitConstant"
	// eiffel.g:880:1: bitConstant : TK_BIT_CONSTANT ;
	public final void bitConstant() throws RecognitionException {
		try {
			// eiffel.g:880:13: ( TK_BIT_CONSTANT )
			// eiffel.g:881:4: TK_BIT_CONSTANT
			{
			match(input,TK_BIT_CONSTANT,FOLLOW_TK_BIT_CONSTANT_in_bitConstant3358); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bitConstant"



	// $ANTLR start "characterConstant"
	// eiffel.g:884:1: characterConstant : TK_CHARACTER_CONSTANT ;
	public final void characterConstant() throws RecognitionException {
		try {
			// eiffel.g:884:19: ( TK_CHARACTER_CONSTANT )
			// eiffel.g:885:4: TK_CHARACTER_CONSTANT
			{
			match(input,TK_CHARACTER_CONSTANT,FOLLOW_TK_CHARACTER_CONSTANT_in_characterConstant3371); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "characterConstant"



	// $ANTLR start "freeOperator"
	// eiffel.g:888:1: freeOperator : TK_FREE_OPERATOR ;
	public final void freeOperator() throws RecognitionException {
		try {
			// eiffel.g:888:14: ( TK_FREE_OPERATOR )
			// eiffel.g:889:4: TK_FREE_OPERATOR
			{
			match(input,TK_FREE_OPERATOR,FOLLOW_TK_FREE_OPERATOR_in_freeOperator3384); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "freeOperator"

	// Delegated rules



	public static final BitSet FOLLOW_classHeader_in_classDeclaration21 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_classDeclaration57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_indexing71 = new BitSet(new long[]{0x0000000000007DA0L});
	public static final BitSet FOLLOW_indexList_in_indexing73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexClause_in_indexList86 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_indexList93 = new BitSet(new long[]{0x0000000000007DA0L});
	public static final BitSet FOLLOW_indexClause_in_indexList95 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_indexTerms_in_indexClause118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_index_131 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_index_133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexValue_in_indexTerms146 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_indexTerms153 = new BitSet(new long[]{0x0000000000007DA0L});
	public static final BitSet FOLLOW_indexValue_in_indexTerms155 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_identifier_in_indexValue171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestConstant_in_indexValue176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_classHeader192 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_className_in_classHeader194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_className225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_formalGenerics239 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_formalGenericList_in_formalGenerics241 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_formalGenerics243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalGeneric_in_formalGenericList256 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_formalGenericList263 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_formalGeneric_in_formalGenericList265 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_formalGenericName_in_formalGeneric281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_formalGenericName299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_constraint312 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_classType_in_constraint314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_obsolete328 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_message_in_obsolete330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestString_in_message343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_features359 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_featureDeclarationList_in_featureClause379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_featureDeclaration_in_featureDeclarationList392 = new BitSet(new long[]{0x0000000000000402L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureDeclaration_in_featureDeclarationList401 = new BitSet(new long[]{0x0000000000000402L,0x0000000000020010L});
	public static final BitSet FOLLOW_newFeatureList_in_featureDeclaration420 = new BitSet(new long[]{0x0000000020020000L,0x0000000000000100L});
	public static final BitSet FOLLOW_declarationBody_in_featureDeclaration422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalArguments_in_declarationBody435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_declarationBody439 = new BitSet(new long[]{0x40C0000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_routine_in_declarationBody441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeMark_in_declarationBody446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_declarationBody456 = new BitSet(new long[]{0x40C0000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_routine_in_declarationBody458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newFeature_in_newFeatureList472 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_newFeatureList479 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_newFeature_in_newFeatureList481 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_featureName_in_newFeature499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_featureName513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefix_in_featureName518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infix_in_featureName523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_prefix538 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_manifestString_in_prefix540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_infix557 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_manifestString_in_infix559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_prefixOperator575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_freeOperator_in_prefixOperator579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_in_infixOperator592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_freeOperator_in_infixOperator596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binary631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binary635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_binary639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binary643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binary648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binary652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binary656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binary660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_binary665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_binary669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_binary673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_binary678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_binary682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_binary686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_binary691 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_binary693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_binary697 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_binary699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_binary703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_inheritance718 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_parentList_in_inheritance720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parent_in_parentList733 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_parentList740 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_parent_in_parentList742 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_classType_in_parent760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_featureAdaption800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_rename814 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_renameList_in_rename816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renamePair_in_renameList829 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_renameList836 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_renamePair_in_renameList838 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_featureName_in_renamePair854 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_renamePair856 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureName_in_renamePair858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_clients872 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_clients876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_classList889 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_classList896 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_className_in_classList898 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_61_in_newExports915 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_newExportList_in_newExports917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newExportItem_in_newExportList930 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_newExportList937 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_newExportItem_in_newExportList939 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_clients_in_newExportItem955 = new BitSet(new long[]{0x0000800000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureSet_in_newExportItem957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_featureList_in_featureSet970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_featureSet975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_featureName_in_featureList988 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_featureList995 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureName_in_featureList997 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_17_in_formalArguments1014 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_entityDeclarationList_in_formalArguments1016 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_formalArguments1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entityDeclarationGroup_in_entityDeclarationList1031 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_entityDeclarationList1038 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_entityDeclarationGroup_in_entityDeclarationList1040 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_identifierList_in_entityDeclarationGroup1058 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_typeMark_in_entityDeclarationGroup1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_identifierList1073 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_identifierList1080 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identifier_in_identifierList1082 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_29_in_typeMark1098 = new BitSet(new long[]{0x1000000000000400L,0x0000000000000200L});
	public static final BitSet FOLLOW_type_in_typeMark1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routineBody_in_routine1129 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_routine1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effective_in_routineBody1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deferred_in_routineBody1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internal_in_effective1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_external_in_effective1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routineMark_in_internal1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_deferred1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_localDeclarations1241 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_entityDeclarationList_in_localDeclarations1243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_creation_in_instruction1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_instruction1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_instruction1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentAttempt_in_instruction1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_instruction1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiBranch_in_instruction1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_instruction1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debug_in_instruction1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_check__in_instruction1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_retry_in_instruction1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_precondition1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_postcondition1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_invariant1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertionClause_in_assertion1365 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_assertion1372 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_assertionClause_in_assertion1374 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_unlabeledAssertionClause_in_assertionClause1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tagMark_in_assertionClause1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanExpression_in_unlabeledAssertionClause1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tag_in_tagMark1427 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_tagMark1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tag1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_check_1460 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_check_1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_variant1478 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_variant1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_redefine1496 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureList_in_redefine1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_undefine1512 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureList_in_undefine1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_select1528 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_featureList_in_select1530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_type1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classTypeExpanded_in_type1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anchored_in_type1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_classType1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_actualGenerics1587 = new BitSet(new long[]{0x1000000000000400L,0x0000000000000200L});
	public static final BitSet FOLLOW_typeList_in_actualGenerics1589 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_actualGenerics1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList1604 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_typeList1611 = new BitSet(new long[]{0x1000000000000400L,0x0000000000000200L});
	public static final BitSet FOLLOW_type_in_typeList1613 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_60_in_classTypeExpanded1629 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_className_in_classTypeExpanded1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_anchored1650 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_anchor_in_anchored1652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_anchor1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_in_anchor1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_compound1684 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_compound1691 = new BitSet(new long[]{0x0024000000008450L,0x0000000000400043L});
	public static final BitSet FOLLOW_instruction_in_compound1693 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_65_in_conditional1712 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_thenPartList_in_conditional1714 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_conditional1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_thenPart_in_thenPartList1731 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_thenPartList1738 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_thenPart_in_thenPartList1740 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_booleanExpression_in_thenPart1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_thenPart1758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_elsePart1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_multiBranch1789 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_multiBranch1791 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_multiBranch1800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_whenPartList1815 = new BitSet(new long[]{0x0000000000007DF0L});
	public static final BitSet FOLLOW_whenPart_in_whenPartList1817 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_choices_in_whenPart1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_whenPart1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_choice_in_choices1850 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_choices1857 = new BitSet(new long[]{0x0000000000007DF0L});
	public static final BitSet FOLLOW_choice_in_choices1859 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_constant_in_choice1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interval_in_choice1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerInterval_in_interval1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterInterval_in_interval1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerConstant_in_integerInterval1911 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_integerInterval1913 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerConstant_in_integerInterval1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterConstant_in_characterInterval1928 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_characterInterval1930 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_characterConstant_in_characterInterval1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initialization_in_loop1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_loopBody_in_loop1961 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_loop1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_initialization1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit__in_loopBody1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_loopBody1997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_exit_2012 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_booleanExpression_in_exit_2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_debug2028 = new BitSet(new long[]{0x0400000000020000L});
	public static final BitSet FOLLOW_debugBody_in_debug2030 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_debug2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_debugBody2047 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_debugKeyList_in_debugBody2049 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_debugBody2051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debugKey_in_debugKeyList2069 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_debugKeyList2076 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_debugKey_in_debugKeyList2078 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_manifestString_in_debugKey2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_rescue2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_retry2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_unique2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_entity2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULT_in_entity2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_in_entity2165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_in_writable2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_attribute2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_local2215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULT_in_local2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_creators2237 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_creationClause_in_creators2239 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_creators2246 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020010L});
	public static final BitSet FOLLOW_creationClause_in_creators2248 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_featureList_in_creationClause2268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_creation2282 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_creation2286 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_writable_in_creation2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_creationCall2303 = new BitSet(new long[]{0x0000000000000450L});
	public static final BitSet FOLLOW_unqualifiedCall_in_creationCall2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writable_in_assignment2319 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_assignment2321 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_assignment2323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writable_in_assignmentAttempt2337 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_assignmentAttempt2339 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_assignmentAttempt2341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callChain_in_call2357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesized_in_parenthesizedQualifier2370 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_parenthesizedQualifier2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unqualifiedCall_in_callChain2385 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_callChain2392 = new BitSet(new long[]{0x0000000000000450L});
	public static final BitSet FOLLOW_unqualifiedCall_in_callChain2394 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_entity_in_unqualifiedCall2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_actuals2426 = new BitSet(new long[]{0x0000000200037DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_actualList_in_actuals2428 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_actuals2430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_in_actualList2443 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_actualList2450 = new BitSet(new long[]{0x0000000200037DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_actual_in_actualList2452 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_expression_in_actual2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_address_in_actual2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_address2486 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identifier_in_address2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_booleanExpression2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestArray_in_expression2521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec3_in_expression2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec4_in_expPrec32539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_opPrec3_in_expPrec32546 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec4_in_expPrec32548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_opPrec32564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec5_in_expPrec42577 = new BitSet(new long[]{0x0000000000000002L,0x0000000080010000L});
	public static final BitSet FOLLOW_opPrec4_in_expPrec42584 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec5_in_expPrec42586 = new BitSet(new long[]{0x0000000000000002L,0x0000000080010000L});
	public static final BitSet FOLLOW_80_in_opPrec42602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_opPrec42607 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_opPrec42609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_opPrec42614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec6_in_expPrec52627 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_opPrec5_in_expPrec52634 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec6_in_expPrec52636 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_opPrec52652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_opPrec52657 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_opPrec52659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec7_in_expPrec62672 = new BitSet(new long[]{0x0000003D10000002L});
	public static final BitSet FOLLOW_opPrec6_in_expPrec62679 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec7_in_expPrec62681 = new BitSet(new long[]{0x0000003D10000002L});
	public static final BitSet FOLLOW_expPrec8_in_expPrec72735 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_opPrec7_in_expPrec72742 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec8_in_expPrec72744 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_expPrec9_in_expPrec82778 = new BitSet(new long[]{0x000002000C080002L});
	public static final BitSet FOLLOW_opPrec8_in_expPrec82785 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec9_in_expPrec82787 = new BitSet(new long[]{0x000002000C080002L});
	public static final BitSet FOLLOW_expPrec10_in_expPrec92831 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_opPrec9_in_expPrec92838 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec10_in_expPrec92840 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_opPrec92856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expPrec11_in_expPrec102869 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_opPrec10_in_expPrec102876 = new BitSet(new long[]{0x0000000000027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expPrec11_in_expPrec102878 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_freeOperator_in_opPrec102894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementarExp_in_expPrec112909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strip_in_expPrec112914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_unaryOperators2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_unaryOperators2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_unaryOperators2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_unaryOperators2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_freeOperator_in_unaryOperators2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesized_in_elementarExp2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callChain_in_elementarExp2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanConstant_in_elementarExp2973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterConstant_in_elementarExp2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_elementarExp2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_in_elementarExp2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestString_in_elementarExp2993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitConstant_in_elementarExp2998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_parenthesized3017 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_parenthesized3019 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parenthesized3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestConstant_in_constant3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAttribute_in_constant3040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_in_constantAttribute3053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanConstant_in_manifestConstant3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterConstant_in_manifestConstant3072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerConstant_in_manifestConstant3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_realConstant_in_manifestConstant3082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestString_in_manifestConstant3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitConstant_in_manifestConstant3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_integerConstant3107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_in_realConstant3122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_manifestArray3173 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expressionList_in_manifestArray3175 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_manifestArray3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList3190 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_expressionList3197 = new BitSet(new long[]{0x0000000200027DF0L,0x0000000001000000L});
	public static final BitSet FOLLOW_expression_in_expressionList3199 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_88_in_strip3216 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_strip3218 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_attributeList_in_strip3220 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_strip3222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_attributeList3235 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_attributeList3242 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identifier_in_attributeList3244 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_62_in_external3261 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_languageName_in_external3263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_manifestString_in_languageName3278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_externalName3291 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_manifestString_in_externalName3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_IDENTIFIER_in_identifier3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_MANIFEST_STRING_in_manifestString3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_INTEGER_in_integer3332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_REAL_in_real3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_BIT_CONSTANT_in_bitConstant3358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_CHARACTER_CONSTANT_in_characterConstant3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TK_FREE_OPERATOR_in_freeOperator3384 = new BitSet(new long[]{0x0000000000000002L});
}
