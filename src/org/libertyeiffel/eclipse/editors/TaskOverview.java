package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.libertyeiffel.eclipse.model.Task;
import org.libertyeiffel.eclipse.model.TaskService;

public class TaskOverview extends ViewPart {
	public static final String ID = "org.libertyeiffel.eclipse.taskoverview";
	
	private ListViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		viewer = new ListViewer(parent);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Task pTask = (Task) element;
				
				return pTask.getSummary();
			}
		});
		viewer.setInput(TaskService.getInstance().getTasks());
		getSite().setSelectionProvider(viewer);
		hookDoubleClickCommand();
	}

	private void hookDoubleClickCommand() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IHandlerService handlerService = getSite().getService(IHandlerService.class);
				try {
					handlerService.executeCommand("org.libertyeiffel.eclipse.openEditor", null);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

}
