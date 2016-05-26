package org.libertyeiffel.eclipse.navigator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class LELabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		 System.out.println("LabelProvider.addListener: " + listener.getClass().getName());

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		System.out.println("LabelProvider.dispose");

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		 System.out.println("LabelProvider.isLabelProperty: " + element.getClass().getName());
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		System.out.println("LabelProvider.removeListener: " + listener.getClass().getName());

	}

	@Override
	public Image getImage(Object element) {
		 Image image = null;
		 
		 if (ILEProjectElement.class.isInstance(element)) {
			image = ((ILEProjectElement)element).getImage();
		}
		 
		return image;
	}

	@Override
	public String getText(Object element) {
		String text = "";
		if (ILEProjectElement.class.isInstance(element)) {
			text = ((ILEProjectElement)element).getText();
		}
		return text;
	}

}
