package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.libertyeiffel.eclipse.editors.parser.EiffelParser;

public class CompletionProcessor implements IContentAssistProcessor {

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		ICompletionProposal[] result = new ICompletionProposal[EiffelParser.KEYWORDS.length];
		for (int i = 0; i < EiffelParser.KEYWORDS.length; i++) {
			result[i] = new CompletionProposal(EiffelParser.KEYWORDS[i], offset, 0, EiffelParser.KEYWORDS[i].length());
		}
		
		return result;
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] {EiffelParser.KEYWORDS[0].charAt(0)};
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

}
