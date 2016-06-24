package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	
	public EiffelEditor() {
		super();
		
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
		setDocumentProvider(new EiffelDocumentProvider());
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
}
