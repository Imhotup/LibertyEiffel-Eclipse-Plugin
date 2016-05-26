package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

public interface ILEProjectElement {

	public Image getImage();
	
	public Object[] getChildren();
	
	public String getText();
	
	public boolean hasChildren();
	
	public IProject getProject();
	
	public Object getParent();
}
