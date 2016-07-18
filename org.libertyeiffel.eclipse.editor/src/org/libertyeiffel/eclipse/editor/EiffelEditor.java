package org.libertyeiffel.eclipse.editor;

import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	
	public EiffelEditor() {
		super();
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
		setDocumentProvider(new EiffelDocumentProvider());
	}
	
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
	}
}
