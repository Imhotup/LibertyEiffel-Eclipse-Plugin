package org.libertyeiffel.eclipse.sorter;

import java.text.Collator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.libertyeiffel.eclipse.navigator.ILEProjectElement;
import org.libertyeiffel.eclipse.navigator.LEProjectBin;
import org.libertyeiffel.eclipse.navigator.LEProjectSrc;

public class CategorySorter extends ViewerSorter {

	public CategorySorter() {
		// TODO Auto-generated constructor stub
	}

	public CategorySorter(Collator collator) {
		super(collator);
	}
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		String catName1 = ((ILEProjectElement)e1).getText();
		String catName2 = ((ILEProjectElement)e2).getText();
		
		int result = -1;
		if (catName1.equals(LEProjectBin.NAME)) {
			result = -1;
		} else if (catName2.equals(LEProjectSrc.NAME)) {
			result = -1;
		}
		
		return result;
	}

}
