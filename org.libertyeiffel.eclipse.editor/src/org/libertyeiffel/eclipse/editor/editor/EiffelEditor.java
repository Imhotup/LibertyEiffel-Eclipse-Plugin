package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	
	public EiffelEditor() {
		super();
		
		setSourceViewerConfiguration(new EiffelSourceViewerConfiguration());
		//setDocumentProvider(new EiffelDocumentProvider());
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new EiffelSourceViewer(parent, ruler, getOverviewRuler(),
				isOverviewRulerVisible(), styles, this);
		
		//ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		
		return viewer;
	}
	
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		// captured a file save, handle anything else
		System.out.println("saving file: " + this.getEditorInput().getName());
	}
	
	public void dispose() {
		super.dispose();
	}
}
