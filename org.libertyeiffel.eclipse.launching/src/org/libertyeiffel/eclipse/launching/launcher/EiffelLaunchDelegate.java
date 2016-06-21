package org.libertyeiffel.eclipse.launching.launcher;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.core.model.IProcess;

public class EiffelLaunchDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		List<String> commandList = new ArrayList<>();
		
		//cleanup the old markers first
		int depth = IResource.DEPTH_INFINITE;
		try {
			ResourcesPlugin.getWorkspace().getRoot().deleteMarkers(IMarker.PROBLEM, true, depth);
		} catch (CoreException e) {
			System.out.println("Could not delete markers:" + e);
		}
		
		String le = configuration.getAttribute("full path", (String)null);
		if (le == null) {
			abort("le executable location undefined. Check value of ${Liberty Eiffel Executable}.",
					null);
		}
		
		File exe = new File(le);
		if (!exe.exists()) {
			abort(MessageFormat.format("Specified liberty eiffel executable {0}. Check value of le.",
					new String[] {le}), null);
		}
		commandList.add(le);
		
		//Program name
		String program = configuration.getAttribute("Eiffel Program", (String)null);
		if (program == null) {
			abort("Liberty Eiffel compiler unspecified.", null);
		}
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(program));
		if (!file.exists()) {
			abort(MessageFormat.format("Liberty Eiffel Compiler {0} does not exist.", 
					new String[] {file.getFullPath().toString()}), null);
		}
		
		commandList.add("-n");
		commandList.add(file.getLocation().toOSString());
		
		//for the IDE we always buffer in memory after reading the path from disk
		commandList.add("-b");
		commandList.add("true");
		
		String[] commandLine = (String[]) commandList
				.toArray(new String[commandList.size()]);
		System.out.println("commandList=" + commandList);
		Process process = DebugPlugin.exec(commandLine, null);
		IProcess process2 = DebugPlugin.newProcess(launch, process, le);
	}

	@SuppressWarnings("deprecation")
	private void abort(String message, Throwable e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, DebugPlugin.getDefault().getDescriptor()
				.getUniqueIdentifier(), 0, message, e));
	}
}
