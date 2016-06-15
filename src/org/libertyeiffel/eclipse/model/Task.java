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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
	private PropertyChangeSupport changes = new PropertyChangeSupport(this);
	
	public static final String FIELD_ID = "id";
	public static final String FIELD_SUMMARY = "summary";
	public static final String FIELD_DESCRIPTION = "description";
	public static final String FIELD_DONE = "done";
	public static final String FIELD_DUEDATE = "dueDate";
	public static final String FIELD_DEPENDENTS = "dependents";
	
	private long id;
	private String summary;
	private String description;
	private boolean done;
	private Date dueDate;
	private List<Long> dependents = new ArrayList<>();
	
	public Task(long i) {
		id = i;
	}
	
	public Task(long i, String summary, String description, boolean b, Date date) {
		this.id = i;
	    this.summary = summary;
	    this.description = description;
	    this.done = b;
	    this.dueDate = date; 
	}
	
	public long getId() {
		return id;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		changes.firePropertyChange(FIELD_SUMMARY, this.summary, this.summary = summary);
	}
	
	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
		changes.firePropertyChange(FIELD_DESCRIPTION, this.description, this.description = description);
	}

	public boolean isDone() {
	    return done;
    }

	public void setDone(boolean isDone) {
	    changes.firePropertyChange(FIELD_DONE, this.done, this.done = isDone);
	}

	public Date getDueDate() {
	    return dueDate;
	}

	public void setDueDate(Date dueDate) {
	    changes.firePropertyChange(FIELD_DUEDATE, this.dueDate, this.dueDate = dueDate);
	}
	  
	public List<Long> getDependentTasks() {
	    return dependents;
	}
	  
	public void setDependentTasks(List<Long> dependents) {
		    this.dependents = dependents;
	}
	  
    @Override
	public int hashCode() {
    	final int prime = 31;
    	int result = 1;
	    result = prime * result + (int) (id ^ (id >>> 32));

	    return result;
	}
	
    @Override
	public boolean equals(Object obj) {
    	if (this == obj)
    		return true;
		if (obj == null)
		    return false;
		if (getClass() != obj.getClass())
		    return false;
		
		Task other = (Task) obj;
		if (id != other.id)
			return false;
		
		return true;
	}
    
    @Override
    public String toString() {
      return "Todo [id=" + id + ", summary=" + summary + "]";
    }
    
    public Task copy() {
        return new Task(id, summary, description, done, dueDate);
      }
    
    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
      }
    
    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
      }
}
