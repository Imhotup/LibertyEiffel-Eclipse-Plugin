package org.libertyeiffel.eclipse.wizards;

import org.eclipse.osgi.util.NLS;

public class NewWizardMessages extends NLS {
	private static final String BUNDLE_NAME = "org.libertyeiffel.eclipse.wizards.messages"; //$NON-NLS-1$
	public static String LEProjectNewWizard_Create_New;
	public static String LEProjectNewWizard_Plugin_Project;
	public static String LEProjectNewWizard_Plugin_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, NewWizardMessages.class);
	}

	private NewWizardMessages() {
	}
}
