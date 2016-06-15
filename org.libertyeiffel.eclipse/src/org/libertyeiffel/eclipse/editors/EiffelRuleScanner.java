package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.libertyeiffel.eclipse.editors.parser.EiffelParser;

public class EiffelRuleScanner extends RuleBasedScanner {

	public EiffelRuleScanner(ColorManager colorManager) {
		
		WordRule rule = new WordRule(new IWordDetector() {
			
			@Override
			public boolean isWordStart(char c) {
				return Character.isJavaIdentifierStart(c);
			}
			
			@Override
			public boolean isWordPart(char c) {
				return Character.isJavaIdentifierPart(c);
			}
		});
		Token keyword = new Token(new TextAttribute(colorManager.getColor(EiffelColorConstants.KEYWORD)));
		Token comment = new Token(new TextAttribute(colorManager.getColor(EiffelColorConstants.COMMENT)));
		Token string = new Token(new TextAttribute(colorManager.getColor(EiffelColorConstants.STRING)));
		
		//add tokens for each reserved word
		for (int n = 0; n < EiffelParser.KEYWORDS.length; n++) {
			rule.addWord(EiffelParser.KEYWORDS[n], keyword);
		}
		setRules(new IRule[] {
				rule,
				new SingleLineRule("--", null, comment),
				new SingleLineRule("{", "}", string),
				new WhitespaceRule(new IWhitespaceDetector() {
					
					@Override
					public boolean isWhitespace(char c) {
						return Character.isWhitespace(c);
					}
				})
		});
		
//		IToken commentToken = new Token(new TextAttribute(colorManager
//				.getColor(EiffelColorConstants.COMMENT)));
//		IToken variableToken = new Token(new TextAttribute(colorManager
//				.getColor(EiffelColorConstants.VARIABLE)));
//		
//		IRule[] rules = new IRule[2];
//		rules[0] = new EndOfLineRule("--", commentToken);
//		rules[1] = new SingleLineRule("class", "", variableToken);
//		setRules(rules);
	}
}
