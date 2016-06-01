package org.libertyeiffel.eclipse.popup.actionprovider;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.navigator.WizardActionGroup;

public class NewActionProvider extends CommonActionProvider {
	
	private static final String NEW_MENU_NAME = "common.new.menu";
	private ActionFactory.IWorkbenchAction showDlgAction;
	private WizardActionGroup newWizardActionGroup;
	private boolean contribute = false;

	@Override
	public void init(ICommonActionExtensionSite anExtensionSite) {
		if (anExtensionSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			IWorkbenchWindow window = ((ICommonViewerWorkbenchSite) anExtensionSite
					.getViewSite()).getWorkbenchWindow();
			showDlgAction = ActionFactory.NEW.create(window);
			
			newWizardActionGroup = new WizardActionGroup(window, PlatformUI.getWorkbench().getNewWizardRegistry(),
					WizardActionGroup.TYPE_NEW, anExtensionSite.getContentService());
			
			contribute = true;
		}
	}
	
	@Override
	public void fillContextMenu(IMenuManager menu) {
		IMenuManager subMenu = new MenuManager("New", NEW_MENU_NAME);
		if (!contribute) {
			return;
		}
		
		//Fill the menu from the commonWizard contributions
		newWizardActionGroup.setContext(getContext());
		newWizardActionGroup.fillContextMenu(subMenu);
		
		subMenu.add(new Separator(ICommonMenuConstants.GROUP_ADDITIONS));
		
		//Add other ..
		subMenu.add(new Separator());
		subMenu.add(showDlgAction);
		
		//append the submenu after the GROUP_NEW group
		menu.insertAfter(ICommonMenuConstants.GROUP_NEW, subMenu);
	}
	
	@Override
	public void dispose() {
		if (showDlgAction != null) {
			showDlgAction.dispose();
			showDlgAction = null;
		}
		super.dispose();
	}
}
