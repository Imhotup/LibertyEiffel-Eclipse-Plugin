package org.libertyeiffel.eclipse.editor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

public class EiffelCodeScanner extends RuleBasedScanner {

	private static String[] eKeywords = {
			"class", "end", "if", "else", "true", "while", "for",
			"create", "feature", "ANY"
	};
	
	public EiffelCodeScanner(EiffelColorProvider provider) {
		IToken keyword = new Token(new TextAttribute(provider
				.getColor(EiffelColorProvider.KEYWORD)));
		IToken string = new Token(new TextAttribute(provider
				.getColor(EiffelColorProvider.STRING)));
		IToken comment = new Token(new TextAttribute(provider
				.getColor(EiffelColorProvider.SINGLE_LINE_COMMENT)));
		IToken other = new Token(new TextAttribute(provider
				.getColor(EiffelColorProvider.DEFAULT)));
		
		List<Object> rules = new ArrayList<>();
		
		//add rule for single line comments.
		rules.add(new EndOfLineRule("--", comment));
		
		// Add rule for strings and character constants.
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		rules.add(new SingleLineRule("'", "'", string, '\\'));
		
		//Add generic whitespace rule.
		rules.add(new WhitespaceRule(new EiffelWhitespaceDetector()));
		
		//Add word rule for keywords.
		WordRule wordRule = new WordRule(new EiffelWordDetector(), other);
		for (int i = 0; i < eKeywords.length; i++) {
			wordRule.addWord(eKeywords[i], keyword);
			rules.add(wordRule);
			
			IRule[] result = new IRule[rules.size()];
			rules.toArray(result);
			setRules(result);
		}
	}
}
