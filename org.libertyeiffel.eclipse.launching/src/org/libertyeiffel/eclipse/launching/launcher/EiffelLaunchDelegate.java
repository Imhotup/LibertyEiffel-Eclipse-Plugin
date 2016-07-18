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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.preference.IPreferenceStore;
import org.libertyeiffel.eclipse.launching.Activator;
import org.libertyeiffel.eclipse.launching.launcher.util.Constants;

public class EiffelLaunchDelegate implements ILaunchConfigurationDelegate {
	
	private boolean warned = false;
	
	public static String[] EIFFEL_ENV_VAR_SET = new String[]{"APPDATA","PATH","TEMP","TMP","SystemDrive"};

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		// Working directory
		File workingDir = verifyWorkingDirectory(configuration);
		String workingDirName = workingDir.getAbsolutePath();
		
		// Environment
		String[] envp = getEnvironment(configuration);
		
		// Classpath
		String[] classpath = getClasspath(configuration);
		
	}

	private String[] getEnvironment(ILaunchConfiguration configuration) throws CoreException {
		Map<String, String> envm = new HashMap<String, String>();
		envm = configuration.getAttribute(Constants.ATTR_ENVIRONMENT_VARIABLES, envm);
		
		int envmSizeDelta = EIFFEL_ENV_VAR_SET.length;
		Map<String, String> all = null;
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		boolean passAllEnvVars = preferenceStore.getBoolean("pass_all_environment_variables");
		if (passAllEnvVars) {
			all = System.getenv();
			envmSizeDelta = all.size();
		}
		
		String[] envp = new String[envm.size() + envmSizeDelta];
		int idx = 0;
		for (String key : envm.keySet()) {
			String value = envm.get(key);
			envp[idx++] = key + "=" + value;
		}
		
		if (passAllEnvVars) {
			for (Map.Entry<String, String> entry : all.entrySet()) {
				envp[idx++] = entry.getKey() + "=" + entry.getValue();
			}
		} else {
			for (String envVarName : EIFFEL_ENV_VAR_SET) {
				envp[idx++] = getEnvVariableEqualsString(envVarName);
			}
		}
		
		if (!warned) {
			StringBuilder sBuilder = new StringBuilder(100);
			for (int i = 0; i < envp.length; i++) {
				sBuilder.append(" ").append(envp[i]).append('\n');
			}
			warned = true;
		}
		
		return envp;
	}
	
	protected String getEnvVariableEqualsString(String envvarName){
		String envvarValue = System.getenv(envvarName);
		if (envvarValue==null) envvarValue = "";
		return envvarName + "=" + envvarValue;
}

	private String[] getClasspath(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		return null;
	}

	public File verifyWorkingDirectory(ILaunchConfiguration configuration) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}
	
//	
//	 /* Returns whether the contents of this launch configuration are
//	  *  equal to the contents of the given launch configuration.
//	  */
//	@Override
//	boolean	contentsEqual(ILaunchConfiguration configuration) {
//		// TODO
//		return false;
//	}
//	
//	/* Returns a copy of this launch configuration, as a working copy, with the specified name.
//	 */
//	@Override
//	ILaunchConfigurationWorkingCopy	copy(String name) {
//		//TODO
//		return null;
//	}
//
//	/* Deletes this launch configuration.
//	 */
//	@Override
//	void delete() {
//		//TODO
//	}
//
//	/* Returns whether this launch configuration's underlying storage exists. */
//	@Override
//	boolean	exists() {
//		//TODO
//		return false;
//	}
//
//	/* Returns the boolean-valued attribute with the given name. */
//	boolean	getAttribute(String attributeName, boolean defaultValue) {
//		//TODO
//		return false;
//	}
//
//	/* Returns the integer-valued attribute with the given name.*/
//	int	getAttribute(String attributeName, int defaultValue) {
//		//TODO
//		return false;
//	}
//
//	/* Returns the java.util.Map-valued attribute with the given name.*/
//	Map<String,String>	getAttribute(String attributeName, Map<String,String> defaultValue) {
//		//TODO
//		return null;
//	}
//
//	/* Returns this launch configuration's type's category, or null if unspecified. */
//	String	getCategory() {
//		//TODO
//		return null;
//	}
//
//	/* Returns the file this launch configuration is stored in, or null if this configuration is stored locally with the workspace. */
//	IFile	getFile() {
//		//TODO
//		return null;
//	}
//
//	/* Returns the resources this launch configuration is associated with or null if none. */
//	IResource[]	getMappedResources() {
//		//TODO
//		return null;
//	}
//
//	/* Returns a memento for this launch configuration, or null if unable to generate a memento for this configuration. */
//	String	getMemento() {
//		//TODO
//		return null;
//	}
//
//	/* Returns the launch modes that have been set on this configuration. */
//	Set<String>	getModes() {
//		//TODO
//		return null;
//	}
//	
//	/* Returns the name of this launch configuration. */
//	String	getName() {
//		//TODO
//		return null;
//	}
//	
//	/* Returns the preferred launch delegate that has been set on this configuration or null if one is not specified. */
//	ILaunchDelegate	getPreferredDelegate(Set<String> modes) {
//		//TODO
//		return null;
//	}
//
//	/* Returns the type of this launch configuration. */
//	ILaunchConfigurationType	getType() {
//		//TODO
//		return null;
//	}
//
//	/* Returns a working copy of this launch configuration. */
//	ILaunchConfigurationWorkingCopy	getWorkingCopy() {
//		//TODO
//		return null;
//	}
//	
//	/* Returns whether this configuration contains an attribute with the given name. */
//	boolean	hasAttribute(String attributeName) {
//		//TODO
//		return false;
//	}
//	
//	/* Returns whether this launch configuration is stored locally within the workspace. */
//	boolean	isLocal() {
//		//TODO
//		return false;
//	}
//
//	/* Returns whether this launch configuration is a candidate for migration. */
//	boolean	isMigrationCandidate() {
//		//TODO
//		return false;
//	}
//
//	/* Returns whether this launch configuration is read-only. */
//	boolean	isReadOnly() {
//		//TODO
//		return false;
//	}
//
//	/* Returns whether this launch configuration is a working copy. */
//	boolean	isWorkingCopy() {
//		//TODO
//		return false;
//	}
//
//	/* Migrates this launch configuration to be compatible with current tooling. */
//	void migrate() {
//		//TODO
//	}
//
//	/* Returns whether this launch configuration supports the specified mode. */
//	boolean	supportsMode(String mode) {
//		//TODO
//		return false;
//	}

}
