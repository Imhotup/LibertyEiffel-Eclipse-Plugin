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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

public class LibertyEiffelMainTab extends AbstractLaunchConfigurationTab {
	private Text prograText;
	private Button programButton;
	private Text eiffelFullPathText;
	private Button eiffelFileButton;

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
		programLabel.setText("Eiffel Program:");
		GridData gridData = new GridData(GridData.BEGINNING);
		programLabel.setLayoutData(gridData);
		programLabel.setFont(font);
		
		prograText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		prograText.setLayoutData(gridData);
		prograText.setFont(font);
		prograText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
				
			}
		});
		
		programButton = createPushButton(composite, "Browse", null);
		programButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				browsePDAFiles();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub				
			}
		});
		
		Label locationLabel = new Label(composite, SWT.NONE);
		locationLabel.setText("Open eiffel Full path");
		GridData locationGd = new GridData(GridData.BEGINNING);
		locationLabel.setLayoutData(locationGd);
		locationLabel.setFont(font);
		
		eiffelFullPathText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		locationGd = new GridData(GridData.FILL_HORIZONTAL);
		eiffelFullPathText.setLayoutData(locationGd);
		eiffelFullPathText.setFont(font);
		eiffelFullPathText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
				
			}
		});
		
		eiffelFileButton = createPushButton(composite, "Browse", null);
		eiffelFileButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				browsePDAFiles();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub				
			}
		});
	}
	
	//Open a resource chooser to select a PDA program
	protected void browsePDAFiles() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace()
				.getRoot(), IResource.FILE);
		dialog.setTitle("Eiffel Program");
		dialog.setMessage("Select Eiffel Program");
		if (dialog.open()== Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			prograText.setText(file.getFullPath().toOSString());
		}
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String program = null;
			program = configuration.getAttribute("Eiffel Program", (String)null);
			if (program != null) {
				prograText.setText(program);
			}
			
			String eiffelFullPath = null;
			eiffelFullPath = configuration.getAttribute("fullpath", (String)null);
			if (eiffelFullPath != null) {
				this.eiffelFullPathText.setText(eiffelFullPath);
			}
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		String program = prograText.getText().trim();
		if(program.length() == 0) {
			program = null;
		}
		configuration.setAttribute("Eiffel Program", program);
		
		String eiffelFullPath = this.eiffelFullPathText.getText().trim();
		configuration.setAttribute("full path", eiffelFullPath);
		
		IResource[] resources = null;
		if (program != null) {
			IPath path = new Path(program);
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			if (resource != null) {
				resources = new IResource[]{resource};
			}
		}
		configuration.setMappedResources(resources);
	}

	@Override
	public String getName() {
		return "File";
	}

}
