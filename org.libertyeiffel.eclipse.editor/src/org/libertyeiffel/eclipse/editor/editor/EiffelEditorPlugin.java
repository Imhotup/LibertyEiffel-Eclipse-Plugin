package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.libertyeiffel.eclipse.editor.editor.EiffelPartitionScanner;

public class EiffelEditorPlugin extends AbstractUIPlugin {
	public final static String MY_PARTITIONING = "___my__partitioning____";
	
	private static EiffelEditorPlugin editorPlugin;
	
	private static EiffelPartitionScanner eiffelPartitionScanner;
	
	public EiffelEditorPlugin() {
		editorPlugin = this;
	}
	
	public static EiffelEditorPlugin getDefault() {
		return editorPlugin;
	}
	
	public static EiffelPartitionScanner getPartitionScanner() {
		if (eiffelPartitionScanner == null)
			eiffelPartitionScanner = new EiffelPartitionScanner();
		return eiffelPartitionScanner;
	}
}
