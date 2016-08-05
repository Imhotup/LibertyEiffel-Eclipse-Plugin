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

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.ui.PlatformUI;
import org.libertyeiffel.eclipse.launching.launcher.util.Constants;

public class EiffelLaunchDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveAllEditors(true);
		
		List<String> commandList = new ArrayList<String>();
		
		//build a command like:
		//se compile hello_world.e -o hello_world
		//which means
		//se compile Eiffel program, 
		
		//se executable
		String se = configuration.getAttribute(Constants.ATTR_LEC_FULL_PATH, (String) null);
		if (se == null) {
			abort("se executable location undefined", null);
		}
		File exe = new File(se);
		if (!exe.exists()) {
			abort(MessageFormat.format("Specified se executable {0} does not exist."
					+ "check value of se.", new String[] {se}), null);
		}
		commandList.add(se);
		
		//Program name
		String program = configuration.getAttribute(Constants.ATTR_LE_PROGRAM, (String) null);
		if (program == null)
			abort("Eiffel program unspecified", null);
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(program));
		if (!file.exists())
			abort(MessageFormat.format("Eiffel program {0} does not exist.", 
					new String[] {file.getFullPath().toString() }), null);
		commandList.add("compile");
		commandList.add(file.getLocation().toOSString());
//		
				
//		IFile file = getSourceFile(configuration);
//		
//		if (file != null) {
//			ILaunchConfiguration[] configurations = getLaunchConfigurations(file);
//			if (configurations.length == 0) {
//				
//				//No configuration found, create new one
//				ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
//				ILaunchConfigurationType type = manager
//						.getLaunchConfigurationType(Constants.LAUNCH_CONFIGURATION_TYPE);
//				ILaunchConfigurationWorkingCopy workingConfig = type.newInstance(null, file.getName());
//				workingConfig.setAttribute(Constants.ATTR_PROJECT, file.getProject().getName());
//				workingConfig.setAttribute(Constants.ATTR_FILE_LOCATION, file.getProjectRelativePath()
//						.toPortableString());
//				
//				//Save and return new configuration
//				workingConfig.doSave();
//				
//				configurations = new ILaunchConfiguration[] {workingConfig  };
//			}
//			
//			// launch
//			configurations[0].launch(mode, new NullProgressMonitor());
//		}
//		
	}
	
	@SuppressWarnings("deprecation")
	private void abort(String message, Throwable e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, LaunchingPlugin.getDefault()
				.getDescriptor().getUniqueIdentifier(), 0, message, e));
	}
	
//	private ILaunchConfiguration[] getLaunchConfigurations(IFile file) throws CoreException {
//		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
//		ILaunchConfigurationType type = launchManager
//				.getLaunchConfigurationType(Constants.LAUNCH_CONFIGURATION_TYPE);
//		ILaunchConfiguration[] configurations = launchManager.getLaunchConfigurations(type);
//		
//		return configurations;
//	}
//
//	private IFile getSourceFile(ILaunchConfiguration configuration) {
//		IFile file = configuration.getFile();
//		
//		return file;
//	}
}
