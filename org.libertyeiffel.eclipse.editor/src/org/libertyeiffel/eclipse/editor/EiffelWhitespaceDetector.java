package org.libertyeiffel.eclipse.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class EiffelWhitespaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}

}
