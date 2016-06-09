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
