package org.libertyeiffel.eclipse.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

public class NewEiffelClassFile extends Wizard implements INewWizard {
	
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private WizardNewFileCreationPage page;

	public NewEiffelClassFile() {
		setWindowTitle("New Eiffel Class File");
	}

	@Override
	public void init(IWorkbench iWorkbench, IStructuredSelection iSelection) {
		workbench = iWorkbench;
		selection = iSelection;

	}
	
	@Override
	public void addPages() {
		super.addPages();
		
		page = new WizardEiffelNewFileCreationPage(selection);
		
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		boolean result = false;
		
		IFile file = page.createNewFile();
		result = file != null;
		
		if (result) {
			try {
				IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
			} catch (PartInitException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
