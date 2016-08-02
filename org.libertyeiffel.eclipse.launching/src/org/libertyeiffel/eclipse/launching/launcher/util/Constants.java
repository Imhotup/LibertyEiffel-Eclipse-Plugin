/**
 * Copyright (C) 2016 Liberty Eiffel
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA
 */
package org.libertyeiffel.eclipse.launching.launcher.util;

import org.libertyeiffel.eclipse.launching.launcher.LaunchingPlugin;

public class Constants {
	
	public static final String ID_DEBUG_MODEL = "debugModel";

	public static final String LAUNCH_CONFIGURATION_TYPE = 
			"org.libertyeiffel.eclipse.launch.EiffelConfigurationType";
	
	public static final String ATTR_ENVIRONMENT_VARIABLES = "ATTR_ENVIRONMENT_VARIABLES";
	
	public static final String ATTR_PROJECT = ID_DEBUG_MODEL + ".ATTR_PROJECT";
	
	public static final String ATTR_FILE_LOCATION = "ATTR_FILE_LOCATION";
	
	public static final String ATTR_WORKING_DIRECTORY = ID_DEBUG_MODEL + ".WORKING_DIRECTORY";
	
	public static final int ERR_WORKING_DIRECTORY_DOES_NOT_EXIST = 108;
	
}
