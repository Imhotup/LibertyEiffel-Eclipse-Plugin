package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	
	public EiffelEditor() {
		super();
		
		setDocumentProvider(new EiffelDocumentProvider());
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new EiffelSourceViewer(parent, ruler, getOverviewRuler(),
				isOverviewRulerVisible(), styles, this);
		
		//ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		
		//more custom stuff
		
		return viewer;
	}
	
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
	}
}
