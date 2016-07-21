package org.libertyeiffel.eclipse.launching.launcher;

import org.eclipse.core.runtime.Plugin;

public class LaunchingPlugin extends Plugin {
	public static final String ID_PLUGIN= "org.libertyeiffel.eclipse.launch.EiffelConfigurationType";
			
	private static LaunchingPlugin eLaunchingPlugin;
	
	public LaunchingPlugin() {
		super();
		eLaunchingPlugin = this;
	}
	
	public static LaunchingPlugin getDefault() {
		if (eLaunchingPlugin == null) {
			eLaunchingPlugin = new LaunchingPlugin();
		}
		
		return eLaunchingPlugin;
	}
	
	public static String getUniqueIdentifier() {
		return ID_PLUGIN;
	}

}
