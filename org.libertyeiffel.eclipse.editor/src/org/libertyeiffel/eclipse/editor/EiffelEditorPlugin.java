package org.libertyeiffel.eclipse.editor;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EiffelEditorPlugin extends AbstractUIPlugin {
	public final static String MY_PARTITIONING = "___my__partitioning____";
	
	private static EiffelPartitionScanner eiffelPartitionScanner;
	
	public static EiffelPartitionScanner getMyPartitionScanner() {
		if (eiffelPartitionScanner == null) {
			eiffelPartitionScanner = new EiffelPartitionScanner();
		}
		
		return eiffelPartitionScanner;
	}
}
