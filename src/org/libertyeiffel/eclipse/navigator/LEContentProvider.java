package org.libertyeiffel.eclipse.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.libertyeiffel.eclipse.natures.ProjectNature;

public class LEContentProvider implements ITreeContentProvider, IResourceChangeListener {
	private Map<String, Object> wrapperCache = new HashMap<String, Object>();
	
	private static final Object[] NO_CHILDREN = {};
	private Viewer viewer;
	
	public LEContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	@Override
	public void inputChanged(Viewer iViewer, Object oldInput, Object newInput) {
		viewer = iViewer;
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object getParent(Object element) {
		Object parent = null;
		
		if (IProject.class.isInstance(element)) {
			parent = ((IProject)element).getWorkspace().getRoot();
		} else if (ILEProjectElement.class.isInstance(element)) {
			parent = ((ILEProjectElement)element).getParent();
		} //else parent = null if IWorkspaceRoot or anything else
		
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if (IWorkspaceRoot.class.isInstance(element)) {
			hasChildren = ((IWorkspaceRoot)element).getProjects().length > 0;
		} else if (ILEProjectElement.class.isInstance(element)) {
			hasChildren = ((ILEProjectElement)element).hasChildren();
		}
		
		return hasChildren;
	}
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if (IWorkspaceRoot.class.isInstance(parentElement)) {
			IProject[] projects = ((IWorkspaceRoot)parentElement).getProjects();
			children = createCustomProjectParents(projects);
			
		} else if (ILEProjectElement.class.isInstance(parentElement)) {
			children = ((ILEProjectElement) parentElement).getChildren();
		} else {
			children = NO_CHILDREN;
		}
		
		return children;
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		TreeViewer treeViewer = (TreeViewer) viewer;
		
		TreePath[] treePaths = treeViewer.getExpandedTreePaths();
		treeViewer.refresh();
		treeViewer.setExpandedTreePaths(treePaths);
		
	}
	
	private Object createCustomProjectParent(IProject parentElemet) {
		Object result = null;
		try {
			if (parentElemet.getNature(ProjectNature.NATURE_ID)!= null) {
				result = new LEProjectParent(parentElemet);
			}
		} catch (CoreException e) {
			// Go to the next IProject
		}
		
		return result;
	}
	
	private Object[] createCustomProjectParents(IProject[] projects) {
		Object[] result = null;
		
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < projects.length; i++) {
			Object customProjectParent = wrapperCache.get(projects[i].getName());
			if (customProjectParent == null) {
				customProjectParent = createCustomProjectParent(projects[i]);
				if (customProjectParent != null) {
					wrapperCache.put(projects[i].getName(), customProjectParent);
				}
			}
			
			if (customProjectParent != null) {
				list.add(customProjectParent);
			} //else ignore the project
		}
		
		result = new Object[list.size()];
		list.toArray(result);
		
		return result;
	}
}
