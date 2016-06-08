package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class EiffelConfiguration extends TextSourceViewerConfiguration{
	
	private ContentAssistant contentAssistant;
	
	public EiffelConfiguration() {
		this(null);
	}

	public EiffelConfiguration(IPreferenceStore preferenceStore) {
		super(preferenceStore);
		
		//Initialize ContentAssistant
		contentAssistant = new ContentAssistant();
		
		//Define a default ContentAssistProcessor
		contentAssistant.setContentAssistProcessor(new CompletionProcessor(), 
				IDocument.DEFAULT_CONTENT_TYPE);
		
		//Set a proper orientation for the content assist proposal
		contentAssistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		
		contentAssistant.setInformationControlCreator(getInformationControlCreator(sourceViewer));
		
		return contentAssistant;
	}
}
