package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class EiffelConfiguration extends TextSourceViewerConfiguration{
	
	private EiffelRuleScanner scanner;
	private ColorManager colorManager;
	
	public EiffelConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	public EiffelConfiguration(IPreferenceStore preferenceStore, ColorManager colorManager) {
		super(preferenceStore);
		
		this.colorManager = colorManager;
	}
	
	protected EiffelRuleScanner getScanner() {
		if (scanner == null) {
			scanner = new EiffelRuleScanner(colorManager);
			scanner.setDefaultReturnToken(new Token(
					new TextAttribute(colorManager.getColor(EiffelColorConstants.DEFAULT))));
		}
		
		return scanner;
	}
	
	//Define reconciler for EiffelEditor
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer damagerRepairer = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(damagerRepairer, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(damagerRepairer, IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
	
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		assistant.setContentAssistProcessor(new CompletionProcessor(), IDocument.DEFAULT_CONTENT_TYPE);
		assistant.setInformationControlCreator(getInformationControlCreator(sourceViewer));
		
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(200);
		assistant.enableAutoInsert(true);
		assistant.enablePrefixCompletion(true);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
		
		return assistant;
	}
	
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		return null;
	}
}
