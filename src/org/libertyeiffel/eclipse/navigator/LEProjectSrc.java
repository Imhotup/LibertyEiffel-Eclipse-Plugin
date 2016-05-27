package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.libertyeiffel.eclipse.Activator;

public class LEProjectSrc implements ILEProjectElement {
	public static final String NAME = "src";
	
	private ILEProjectElement parent;
	private ILEProjectElement[] children;
	private Image image;

	public LEProjectSrc(ILEProjectElement iparent) {
		parent = iparent;
	}

	@Override
	public Image getImage() {
		if (image == null) {
			image = Activator.getImage("icons/sample.gif");
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
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IProject getProject() {
		
		return parent.getProject();
	}

	@Override
	public Object getParent() {
		
		return parent;
	}
	
	private ILEProjectElement[] initializeChildren(IProject iProject) {
		ILEProjectElement[] children = new ILEProjectElement[] {
		};
		
		return children;
	}
}
