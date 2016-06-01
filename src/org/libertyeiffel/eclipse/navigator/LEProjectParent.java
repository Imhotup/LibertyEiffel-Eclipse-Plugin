package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;

public class LEProjectParent extends ProjectElement {
	
	private IProject project;
	private static String imagePath = "icons/sample.gif";
	
	public LEProjectParent(IProject iproject) {
		super(null,  iproject.getName(), imagePath);
	}
	
	@Override
	public IProject getProject() {
		return project;
	}
	
	@Override
	protected ILEProjectElement[] initializeChildren(IProject project) {
		ILEProjectElement[] children = {
				new LEProjectBin(this),
				new LEProjectSrc(this)
		};
		
		return children;
	}

}
