/**
 * Copyright (C) 2016 Liberty Eiffel
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA
 */
package org.libertyeiffel.eclipse.launching.launcher;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.ui.PlatformUI;
import org.libertyeiffel.eclipse.launching.launcher.util.Constants;

public class EiffelLaunchDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveAllEditors(true);
		
		IFile file = getSourceFile(configuration);
		
		if (file != null) {
			ILaunchConfiguration[] configurations = getLaunchConfigurations(file);
			if (configurations.length == 0) {
				//No configuration found, create new one
				ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
				ILaunchConfigurationType type = manager
						.getLaunchConfigurationType(Constants.LAUNCH_CONFIGURATION_TYPE);
				ILaunchConfigurationWorkingCopy workingConfig = type.newInstance(null, file.getName());
				workingConfig.setAttribute(Constants.ATTR_PROJECT, file.getProject().getName());
				workingConfig.setAttribute(Constants.ATTR_FILE_LOCATION, file.getProjectRelativePath()
						.toPortableString());
				
				//Save and return new configuration
				workingConfig.doSave();
				
				configurations = new ILaunchConfiguration[] {workingConfig  };
			}
			
			// launch
			configurations[0].launch(mode, new NullProgressMonitor());
		}
		
	}
	
	private ILaunchConfiguration[] getLaunchConfigurations(IFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	private IFile getSourceFile(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		return null;
	}
}
