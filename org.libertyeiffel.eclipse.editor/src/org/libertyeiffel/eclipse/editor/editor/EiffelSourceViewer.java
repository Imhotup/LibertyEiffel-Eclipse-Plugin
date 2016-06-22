package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;

public class EiffelSourceViewer extends SourceViewer {
	@SuppressWarnings("unused")
	private EiffelEditor eiffelEditor = null;
	
	public EiffelSourceViewer(Composite parent, IVerticalRuler ruler, int styles, EiffelEditor editor) {
		super(parent, ruler, styles);
		eiffelEditor = editor;
	}

	public EiffelSourceViewer(Composite parent, IVerticalRuler ruler, IOverviewRuler overviewRuler,
			boolean showAnnotationOverview, int styles, EiffelEditor editor) {
		super(parent, ruler, overviewRuler, showAnnotationOverview, styles);
		eiffelEditor = editor;
	}

}
