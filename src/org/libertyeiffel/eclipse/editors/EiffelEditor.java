package org.libertyeiffel.eclipse.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class EiffelEditor extends TextEditor {
	public static final String ID = "org.libertyeiffel.eclipse.eiffeleditor";
	private ColorManager colorManager;
	
	public EiffelEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new EiffelConfiguration(colorManager));
	}

	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
}
