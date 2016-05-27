package org.libertyeiffel.eclipse.wizards;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.libertyeiffel.eclipse.Activator;

public class WizardEiffelNewFileCreationPage extends WizardNewFileCreationPage {
	
	public WizardEiffelNewFileCreationPage(IStructuredSelection selection) {
		super("Eiffel Class File Wizard", selection);
		
		setTitle("Eiffel Class File");
		setDescription("Create a New Class File");
		setFileExtension("e");
	}
	
	@Override
	protected InputStream getInitialContents() {
		String templateFilePath = "/templates/class-template.xml";
		InputStream inputStream = null;
		try {
			inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		return inputStream;
	}
}
