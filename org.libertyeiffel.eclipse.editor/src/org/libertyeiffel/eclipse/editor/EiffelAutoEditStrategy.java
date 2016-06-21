package org.libertyeiffel.eclipse.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class EiffelAutoEditStrategy implements IAutoEditStrategy {

	@Override
	public void customizeDocumentCommand(IDocument document, DocumentCommand command) {
		if (command.text.equals("{")) {
			int line;
			try {
				line = document.getLineOffset(command.offset);
				String indent = getIndentOfLine(document, line);
				
				command.text = "{" + "\r\n" + indent + "}";
				configureCommand(command);
				
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void configureCommand(DocumentCommand command) {
		command.caretOffset = command.offset + 1;
		command.shiftsCaret = false;
	}

	public static int findEndOfWhiteSpace(IDocument document, int offset, int end) 
			throws BadLocationException {
		while (offset < end) {
			char c = document.getChar(offset);
			if (c != ' ' && c != '\t') {
				return offset;
			}
			offset++;
		}
		
		return end;
	}
	
	public static String getIndentOfLine(IDocument document, int line) throws BadLocationException {
		if (line > -1) {
			int start = document.getLineOffset(line);
			int end = start + document.getLineLength(line) - 1;
			int whiteend = findEndOfWhiteSpace(document, start, end);
			
			return document.get(start, whiteend - start);
		} else {
			return "";
		}
	}
}
