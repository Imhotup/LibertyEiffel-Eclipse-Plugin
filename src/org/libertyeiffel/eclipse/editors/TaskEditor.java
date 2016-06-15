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
package org.libertyeiffel.eclipse.editors;

import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.libertyeiffel.eclipse.model.Task;
import org.libertyeiffel.eclipse.model.TaskService;

public class TaskEditor extends EditorPart {
	
	public static final String ID = "org.libertyeiffel.eclipse.editor.task";
	private Task todo;
	private TaskEditorInput input;
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (!(input instanceof TaskEditorInput)) {
			throw new RuntimeException("Wrong input");
		}
		
		this.input = (TaskEditorInput) input;
		setSite(site);
		setInput(input);
		todo = TaskService.getInstance().getTaskById(this.input.getId());
		setPartName("Todo ID: " + todo.getId());
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		parent.setLayout(layout);
		new Label(parent, SWT.NONE).setText("Summary");
		Text text = new Text(parent, SWT.BORDER);
		text.setText(todo.getSummary());
		text.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		
		new Label(parent, SWT.NONE).setText("Description");
	    Text lastName = new Text(parent, SWT.BORDER);
	    lastName.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    lastName.setText(todo.getDescription());
	    
	    new Label(parent, SWT.NONE).setText("Done");
	    Button doneBtn = new Button(parent, SWT.CHECK);
	    doneBtn.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    doneBtn.setSelection(todo.isDone());
	    
	    new Label(parent, SWT.NONE).setText("Due Date");
	    DateTime dueDate = new DateTime(parent, SWT.CHECK);
	    dueDate.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    Date date = todo.getDueDate();
	    dueDate.setDate(date.getYear(), date.getMonth(), date.getDay());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}



	@Override
	public void setFocus() {
	}

}
