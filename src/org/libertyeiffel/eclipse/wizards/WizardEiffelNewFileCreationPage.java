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
