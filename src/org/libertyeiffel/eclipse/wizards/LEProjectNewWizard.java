package org.libertyeiffel.eclipse.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.libertyeiffel.eclipse.natures.LEProjectSupport;

public class LEProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {
	private static final String PAGE_NAME = NewWizardMessages.LEProjectNewWizard_Plugin_Project;
	private static final String WIZARD_NAME = NewWizardMessages.LEProjectNewWizard_Plugin_Title;
	
	private WizardNewProjectCreationPage pageOne;
	private IConfigurationElement configurationElement;
	
	public LEProjectNewWizard() {
		setWindowTitle(WIZARD_NAME);
	}
	
	@Override
	public void addPages() {
		super.addPages();
		
		pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		pageOne.setTitle(WIZARD_NAME);
		pageOne.setDescription(NewWizardMessages.LEProjectNewWizard_Create_New);
		
		addPage(pageOne);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String name = pageOne.getProjectName();
		URI location = null;
		if (!pageOne.useDefaults()) {
			location = pageOne.getLocationURI();
		}//else location = null
		
		LEProjectSupport.createProject(name, location);
		BasicNewProjectResourceWizard.updatePerspective(configurationElement);
		
		return true;
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		configurationElement = config;
		
	}

}
