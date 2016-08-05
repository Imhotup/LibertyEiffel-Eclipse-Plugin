package org.libertyeiffel.eclipse.launching.ui.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.libertyeiffel.eclipse.launching.launcher.util.Constants;

public class LibertyEiffelMainTab extends AbstractLaunchConfigurationTab {
	
	private Text eiffelProgramText;
	private Button eiffelProgramButton;
	private Text seFullPathText;

	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		
		Composite composite = new Composite(parent, SWT.NONE);
		setControl(composite);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		topLayout.numColumns = 3;
		composite.setLayout(topLayout);
		composite.setFont(font);
		
		createVerticalSpacer(composite, 3);
		
		Label programLabel = new Label(composite, SWT.NONE);
		programLabel.setText("&Eiffel Program:");
		GridData gridData = new GridData(GridData.BEGINNING);
		programLabel.setLayoutData(gridData);
		programLabel.setFont(font);
		
		eiffelProgramText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		eiffelProgramText.setLayoutData(gridData);
		eiffelProgramText.setFont(font);
		eiffelProgramText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		eiffelProgramButton = createPushButton(composite, "&Browse...", null);
		eiffelProgramButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				browseEiffelFiles();
			}
		});
		
		Label seLocationLabel = new Label(composite, SWT.NONE);
		seLocationLabel.setText("&Open-se Full Path:");
		GridData seLocationGd = new GridData(GridData.BEGINNING);
		seLocationLabel.setLayoutData(seLocationGd);
		seLocationLabel.setFont(font);
		
		seFullPathText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		seLocationGd = new GridData(GridData.FILL_HORIZONTAL);
		seFullPathText.setLayoutData(seLocationGd);
		seFullPathText.setFont(font);
		seFullPathText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//TODO:
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String program = null;
			program = configuration.getAttribute(Constants.ATTR_LE_PROGRAM, (String) null);
			if (program != null)
				eiffelProgramText.setText(program);
			
			String seFullPath = null;
			seFullPath = configuration.getAttribute(Constants.ATTR_LEC_FULL_PATH, (String) null);
			if (seFullPath != null)
				this.seFullPathText.setText(seFullPath);
			
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		String program = eiffelProgramText.getText().trim();
		if (program.length() == 0)
			program = null;
		
		configuration.setAttribute(Constants.ATTR_LE_PROGRAM, program);
		
		String seFullPath = this.seFullPathText.getText().trim();
		configuration.setAttribute(Constants.ATTR_LEC_FULL_PATH, seFullPath);
		
		//perform resource mapping for contextual launch
		IResource[] resources = null;
		if (program != null) {
			IPath path = new Path(program);
			IResource res = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			if (res != null) {
				resources = new IResource[]{res};
			}
		}
		configuration.setMappedResources(resources);
	}

	@Override
	public String getName() {
		return "Main";
	}

	protected void browseEiffelFiles() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle("Eiffel Program");
		dialog.setMessage("Select Eiffel Program");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			eiffelProgramText.setText(file.getFullPath().toString());
		}
	}
}
