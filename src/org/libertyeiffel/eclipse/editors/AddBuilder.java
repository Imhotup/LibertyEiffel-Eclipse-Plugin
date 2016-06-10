package org.libertyeiffel.eclipse.editors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.libertyeiffel.eclipse.wizards.EiffelProjectBuilder;

public class AddBuilder extends AbstractHandler implements IHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = getProject(event);
		
		if (project != null) {
			//verify already registered builders
			if (hasBuilder(project)) {
				//already enabled
				return null;
			}
			
			//add builder to project properties
			addBuilder(project, EiffelProjectBuilder.BUILDER_ID);
		}
		return null;
	}
	
	private void addBuilder(IProject project, String id) {
		IProjectDescription description;
		try {
			description = project.getDescription();
			ICommand[] commands = description.getBuildSpec();
			for (int i = 0; i < commands.length; i++) {
				if (commands[i].getBuilderName().equals(id))
					return;
			}
			ICommand command = description.newCommand();
			command.setBuilderName(id);
			ICommand[] nCommands = new ICommand[commands.length + 1];
			
			//Add it before other builders
			nCommands[0] = command;
			description.setBuildSpec(nCommands);
			project.setDescription(description, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static IProject getProject(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object element = ((IStructuredSelection)selection).getFirstElement();
			
			return (IProject) Platform.getAdapterManager()
					.getAdapter(element, IProject.class);
		}
		
		return null;
	}
	
	@SuppressWarnings("unused")
	public static boolean hasBuilder(IProject project) {
		try {
			for (ICommand buildSpec : project.getDescription().getBuildSpec()) {
				return true;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return false;
	}
}
