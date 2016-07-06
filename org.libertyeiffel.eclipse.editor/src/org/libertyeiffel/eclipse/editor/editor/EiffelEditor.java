package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	
	public EiffelEditor() {
		super();
		
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
		setDocumentProvider(new EiffelDocumentProvider());
	}
	
//	@Override
//	protected void createActions() {
//		Action action = new ContentAssistAction(resourceBundle, "ContentAssistProposal", this);
//		String id = ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS;
//		action.setActionDefinitionId(id);
//		setAction("ContentAssistProposal", action);
//		markAsStateDependentAction("ContentAssistProposal", true);
//	};
	
	@Override
	public void dispose() {
		super.dispose();
	}
}
