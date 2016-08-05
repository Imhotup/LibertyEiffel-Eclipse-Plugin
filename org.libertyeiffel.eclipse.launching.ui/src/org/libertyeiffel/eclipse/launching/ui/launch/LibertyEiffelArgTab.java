package org.libertyeiffel.eclipse.launching.ui.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class LibertyEiffelArgTab extends AbstractLaunchConfigurationTab {
	
	private Text nameText;

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Group(parent, SWT.BORDER);
		setControl(composite);
		
		GridLayoutFactory.swtDefaults().numColumns(3).applyTo(composite);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Eiffel Compiler");
		GridDataFactory.swtDefaults().applyTo(label);
		
		nameText = new Text(composite, SWT.BORDER);
		nameText.setMessage("Console Text");
		GridDataFactory.fillDefaults().grab(true, false).applyTo(nameText);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		
	}

	@Override
	public String getName() {
		return "Arguments";
	}

}
