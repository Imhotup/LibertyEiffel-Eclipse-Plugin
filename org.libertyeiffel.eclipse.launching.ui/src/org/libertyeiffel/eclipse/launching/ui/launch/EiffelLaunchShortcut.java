package org.libertyeiffel.eclipse.launching.ui.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class EiffelLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IFile file = (IFile) ((IStructuredSelection)selection).getFirstElement();
			
			//Check for an existing launch config for Eiffel file
			String path = file.getFullPath().toString();
			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(
					"eiffel.launchType");
			try {
				ILaunchConfiguration[] configurations = launchManager.getLaunchConfigurations(type);
				for (int i = 0; i < configurations.length; i++) {
					ILaunchConfiguration configuration = configurations[i];
					String attribute = configuration.getAttribute("Eiffel program", (String)null);
					if (path.equals(attribute)) {
						DebugUITools.launch(configuration, mode);
						return;
					}
				}
			} catch (CoreException e) {
				return;
			}
			
			try { 
				//Create a new Launch for the eiffel file
				ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null,
						file.getName());
				workingCopy.setAttribute("Eiffel program", path);
				workingCopy.setMappedResources(new IResource[]{file});
				ILaunchConfiguration configuration = workingCopy.doSave();
				DebugUITools.launch(configuration, mode);
			} catch (CoreException e) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		//IEditorInput input = editor.getEditorInput();
	}

}
