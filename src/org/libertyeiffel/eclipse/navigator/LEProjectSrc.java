package org.libertyeiffel.eclipse.navigator;

import org.eclipse.core.resources.IProject;

public class LEProjectSrc extends ProjectElement {
	public static final String NAME = "src";
	
	private static String imagePath = "icons/sample.gif";

	public LEProjectSrc(ILEProjectElement iparent) {
		super(iparent, NAME, imagePath);
	}
	
	@Override
	protected ILEProjectElement[] initializeChildren(IProject iProject) {
		ILEProjectElement[] children = new ILEProjectElement [0];
		
		return children;
	}
}
