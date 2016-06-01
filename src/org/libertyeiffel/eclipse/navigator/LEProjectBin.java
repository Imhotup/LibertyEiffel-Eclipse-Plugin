package org.libertyeiffel.eclipse.navigator;


import org.eclipse.core.resources.IProject;

public class LEProjectBin extends ProjectElement {
	
	public static final String NAME = "Bin";
	
	private static String imagePath = "icons/sample.gif";


	public LEProjectBin(ILEProjectElement iparent) {
		super(iparent, NAME, imagePath);
	}


	@Override
	protected ILEProjectElement[] initializeChildren(IProject iProject) {
		ILEProjectElement[] children = new ILEProjectElement [0];
		
		return children;
	}

}
