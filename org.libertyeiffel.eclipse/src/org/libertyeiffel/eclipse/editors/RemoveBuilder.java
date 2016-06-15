package org.libertyeiffel.eclipse.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.libertyeiffel.eclipse.wizards.EiffelProjectBuilder;

public class RemoveBuilder extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = AddBuilder.getProject(event);
		
		if (project != null) {
			try {
				IProjectDescription description = project.getDescription();
				List<ICommand> commands = new ArrayList<ICommand>();
				commands.addAll(Arrays.asList(description.getBuildSpec()));
				
				for (ICommand buildSpec : description.getBuildSpec()) {
					if (EiffelProjectBuilder.BUILDER_ID.equals(buildSpec.getBuilderName())) {
						//remove builder
						commands.remove(buildSpec);
					}
				}
				
				description.setBuildSpec(commands.toArray(new ICommand[commands.size()]));
				project.setDescription(description, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
