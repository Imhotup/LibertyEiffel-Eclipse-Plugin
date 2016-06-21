/*******************************************************************************
 * Copyright notice below. Please read.
 *
 * Liberty Eiffel is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License,
 * as published by the Free Software Foundation; either version 2, or (at your option) any later version.
 * Liberty Eiffel is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have
 * received a copy of the GNU General Public License along with Liberty Eiffel; see the file COPYING. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Copyright (C) 2011-2016: Cyril ADRIAN, Paolo REDAELLI, Raphael MACK
 *
 * http://www.gnu.org/software/liberty-eiffel/
 *
 *
 * Liberty Eiffel is based on SmartEiffel (Copyrights below)
 *
 * Copyright(C) 1994-2002: INRIA - LORIA (INRIA Lorraine) - ESIAL U.H.P.       - University of Nancy 1 - FRANCE
 * Copyright(C) 2003-2006: INRIA - LORIA (INRIA Lorraine) - I.U.T. Charlemagne - University of Nancy 2 - FRANCE
 *
 * Authors: Dominique COLNET, Philippe RIBET, Cyril ADRIAN, Vincent CROIZIER, Frederic MERIZEN
 * 
 ******************************************************************************/
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
