package org.libertyeiffel.eclipse.launching.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LibertyEiffelTabGroup extends AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new LibertyEiffelMainTab(),
				new LibertyEiffelArgTab(),
				new LibertyEiffelEnvTab(),
				new CommonTab()
		};
		
		setTabs(tabs);
	}

}
