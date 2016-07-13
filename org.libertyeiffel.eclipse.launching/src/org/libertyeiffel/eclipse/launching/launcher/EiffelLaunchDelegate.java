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
	
	public static String[] EIFFEL_ENV_VAR_SET = new String[]{"APPDATA","PATH","TEMP","TMP","SystemDrive"};

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
}
