package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IUndoManager;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.libertyeiffel.eclipse.editor.EiffelEditorPlugin;

public class EiffelSourceViewerConfiguration extends SourceViewerConfiguration {

	public EiffelSourceViewerConfiguration() {
		super();
	}
	
	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		
		return EiffelEditorPlugin.MY_PARTITIONING;
	}
	
	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
				IDocument.DEFAULT_CONTENT_TYPE, EiffelPartitionScanner.MULTILINE_COMMENT,
				EiffelPartitionScanner.SINGLELINE_COMMENT, EiffelPartitionScanner.STRING
		};
	}
	
	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		MonoReconciler reconciler = new MonoReconciler(new EiffelReconcilingStrategy(), true);
		reconciler.install(sourceViewer);
		
		return reconciler;
	}
	
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer viewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer repairer = new DefaultDamagerRepairer(new 
				EiffelCodeScanner(new EiffelColorProvider()));
		reconciler.setDamager(repairer, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, EiffelPartitionScanner.SINGLELINE_COMMENT);
		reconciler.setRepairer(repairer, EiffelPartitionScanner.MULTILINE_COMMENT);
		reconciler.setRepairer(repairer, EiffelPartitionScanner.STRING);
		
		return reconciler;
	}
	
	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		IAutoEditStrategy strategy = (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType) ? 
				new EiffelAutoEditStrategy() : new DefaultIndentLineAutoEditStrategy());
		
		return new IAutoEditStrategy[] {strategy};
	}
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		
		assistant.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		assistant.setContentAssistProcessor(new EiffelContentAssistantProcessor(),
				IDocument.DEFAULT_CONTENT_TYPE);
		
		assistant.setAutoActivationDelay(0);
		assistant.enableAutoActivation(true);
		
		assistant.setProposalSelectorBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		
		return assistant;
	}
	
	
	
	@Override
	public IUndoManager getUndoManager(ISourceViewer sourceViewer) {
		return null;
	}
}
