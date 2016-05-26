package org.libertyeiffel.eclipse.navigator;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.libertyeiffel.eclipse.natures.ProjectNature;

public class LEContentProvider implements ITreeContentProvider {
	
	private static final Object[] NO_CHILDREN = {};
	private LEProjectParent[] customProjectParents;
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		System.out.println("ContentProvider.dispose");
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		System.out.println("ContentProvider.inputChanged: old: " + 
				oldInput.getClass().getName() + " new: " + newInput.getClass().getName());
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object getParent(Object element) {
		System.out.println("ContentProvider.getParent: " + element.getClass().getName());
		Object parent = null;
		if (ILEProjectElement.class.isInstance(element)) {
			parent = ((ILEProjectElement)element).getParent();
		}
		
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if (LEProjectWorkbenchRoot.class.isInstance(element)) {
			hasChildren = customProjectParents.length > 0;
		} else if (ILEProjectElement.class.isInstance(element)) {
			hasChildren = ((ILEProjectElement)element).hasChildren();
		}
		
		return hasChildren;
	}
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if (LEProjectWorkbenchRoot.class.isInstance(parentElement)) {
			if (customProjectParents == null) {
				customProjectParents = initializeParent(parentElement);
			}
			
			children = customProjectParents;
		} else if (ILEProjectElement.class.isInstance(parentElement)) {
			children = ((ILEProjectElement) parentElement).getChildren();
		} else {
			children = NO_CHILDREN;
		}
		
		return children;
	}

	private LEProjectParent[] initializeParent(Object parentElement) {
		IProject [] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		
		List<LEProjectParent> list = new Vector<LEProjectParent>();
		for (int i = 0; i < projects.length; i++) {
			try {
				if (projects[i].getNature(ProjectNature.NATURE_ID) != null) {
					list.add(new LEProjectParent(projects[i]));
				}
			} catch (CoreException e) {
				// TODO: handle exception
			}
		}
		
		LEProjectParent[] result = new LEProjectParent[list.size()];
		list.toArray(result);
		
		return result;
	}

	

}
