package org.libertyeiffel.eclipse.launching.ui.launch;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class EiffelLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			searchAndLaunch(((IStructuredSelection)selection).toArray(), mode);
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		//IEditorInput input = editor.getEditorInput();
	}
	
	private void searchAndLaunch(Object[] array, String mode) {
		
	}

}
