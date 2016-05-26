package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.libertyeiffel.eclipse.Activator;

public class LEProjectParent implements ILEProjectElement {
	
	private IProject project;
	private ILEProjectElement[] children;
	private Image image;
	
	public LEProjectParent(IProject iproject) {
		project = iproject;
	}

	
	public Image getImage() {
		if (image == null) {
			image = Activator.getImage("icons/sample.gif");
		}
		
		return image;
	}

	@Override
	public ILEProjectElement[] getChildren() {
		if (children == null) {
			children = initializeChildren(project);
		}
		
		return children;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return project.getName();
	}

	@Override
	public boolean hasChildren() {
		if (children == null) {
			children = initializeChildren(project);
		}
		
		return children.length > 0;
	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return project;
	}

	@Override
	public Object getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ILEProjectElement[] initializeChildren(IProject project) {
		ILEProjectElement[] children = {
				new LEProjectBin(this),
				new LEProjectSrc(this)
		};
		
		return children;
	}

}
