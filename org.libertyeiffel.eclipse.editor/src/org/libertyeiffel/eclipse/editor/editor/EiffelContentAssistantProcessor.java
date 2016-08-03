package org.libertyeiffel.eclipse.editor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class EiffelContentAssistantProcessor implements IContentAssistProcessor {
	private final IContextInformation[] NO_CONTEXTS = { };
	private final char[] PROPOSAL_ACTIVATION_CHARS = { '.', '"'};
	private ICompletionProposal[] NO_COMPLETIONS = { };

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		try {
			List<ICompletionProposal> completionProposals = new ArrayList<ICompletionProposal>();
			IDocument document = viewer.getDocument();
			String prefix = lastWord(document, offset);
			String indent = lastIndent(document, offset);
//			EiffelModel model = EiffelModel.getModel(document, null);
//			model.getContentProposals(prefix, indent, offset, completionProposals);
		
			return completionProposals.toArray(new ICompletionProposal[completionProposals.size()]);
			
		} catch (Exception e) {
			return NO_COMPLETIONS;
		}
	}
	
	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		
		return NO_CONTEXTS;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		
		return PROPOSAL_ACTIVATION_CHARS;
	}

	private String lastWord(IDocument document, int offset) {
		try {
			for (int n = offset - 1; n >= 0; n--) {
				char c = document.getChar(n);
				if (!Character.isJavaIdentifierPart(c)) {
					return document.get(n + 1, offset-n-1);
				}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return "";
	}

	private String lastIndent(IDocument document, int offset) {
		try {
			int start = offset - 1;
			while (start >= 0 && document.getChar(start) != '\n')
				start--;
			
			int end = start;
			while (end < offset && Character.isSpaceChar(document.getChar(end)))
				end++;
			
			return document.get(start + 1, end - start - 1);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		
		return null;
	}

	@Override
	public String getErrorMessage() {
		
		return "No Content Assist Found";
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		
		return null;
	}

}
