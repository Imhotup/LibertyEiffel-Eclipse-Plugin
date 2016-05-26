package org.libertyeiffel.eclipse.navigator;

import org.eclipse.ui.navigator.CommonNavigator;

public class LENavigator extends CommonNavigator {

	@Override
	protected Object getInitialInput() {
		return new LEProjectWorkbenchRoot();
	}

}
