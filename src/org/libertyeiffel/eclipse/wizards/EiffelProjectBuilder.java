package org.libertyeiffel.eclipse.wizards;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class EiffelProjectBuilder extends IncrementalProjectBuilder {
	
	public static final String BUILDER_ID = "org.libertyeiffel.eclipse.builder";
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		
		if (kind == IncrementalProjectBuilder.FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		
		return null;
	}

	private void fullBuild(IProgressMonitor monitor) {
		System.out.println("full build");
	}

	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
		try {
			delta.accept(new IResourceDeltaVisitor() {
				
				@Override
				public boolean visit(IResourceDelta delta) throws CoreException {
					return true;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
