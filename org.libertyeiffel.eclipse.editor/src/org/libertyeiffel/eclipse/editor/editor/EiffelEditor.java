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

//	@Override
//	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
//		ISourceViewer viewer = new EiffelSourceViewer(parent, ruler, getOverviewRuler(),
//				isOverviewRulerVisible(), styles, this);
//		
//		//ensure decoration support has been created and configured.
//		getSourceViewerDecorationSupport(viewer);
//		
//		return viewer;
//	}
}
