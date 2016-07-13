package org.libertyeiffel.eclipse.editor;

import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.libertyeiffel.eclipse.editor.editor.EiffelEditor;

public class EiffelSourceViewer extends SourceViewer {
	public EiffelSourceViewer(Composite parent, IVerticalRuler ruler, IOverviewRuler overviewRuler,
			boolean showAnnotationOverview, int styles, EiffelEditor editor) {
		super(parent, ruler, overviewRuler, showAnnotationOverview, styles);
	}

}
