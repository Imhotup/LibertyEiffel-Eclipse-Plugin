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
package org.libertyeiffel.eclipse.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskService {
	
	private static TaskService taskService = new TaskService();
	private List<Task> tasks = new ArrayList<Task>();
	
	private TaskService() {
		Task task = new Task(0, "Fix Bugs", "Fix Eclipse Bug 123", false, new Date());
		tasks.add(task);
		task = new Task(1, "Write Tutorials", "Write project tutorials", true, new Date());
		tasks.add(task);
		
	}
	
	public static TaskService getInstance() {
	    return taskService;
	}
	
	public List<Task> getTasks() {
	    return tasks;
	}
	
	public Task getTaskById(long id) {
	    for (Task todo : tasks) {
	      if (todo.getId() == id) {
	        return todo;
	      }
	    }
	    
	    return null;
	}

}
