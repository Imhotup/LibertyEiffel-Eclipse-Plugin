package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.libertyeiffel.eclipse.Activator;

public abstract class ProjectElement  implements ILEProjectElement {
	
	private Image image;
	private String name;
	private String imagePath;
	private ILEProjectElement parent;
	private ILEProjectElement[] children;
	
	public ProjectElement(ILEProjectElement iParent, String iName, String iImagePath) {
		parent = iParent;
		name = iName;
		imagePath = iImagePath;
	}

	@Override
	public Image getImage() {
		if (image == null) {
			image = Activator.getImage(imagePath);
		}
		
		return image;
	}

	@Override
	public ILEProjectElement[] getChildren() {
		if (children == null) {
			children = initializeChildren(getProject());
		}
		
		return children;
	}

	@Override
	public String getText() {
		return name;
	}

	@Override
	public boolean hasChildren() {
		if (children == null) {
			children = initializeChildren(getProject());
		}
		//else we have already initialized them
		
		return children.length > 0;
	}

	@Override
	public IProject getProject() {
		return getParent().getProject();
	}

	@Override
	public ILEProjectElement getParent() {
		return parent;
	}
	
	protected abstract ILEProjectElement[] initializeChildren(IProject project); 
}
