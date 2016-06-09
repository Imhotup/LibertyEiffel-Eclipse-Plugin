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
package org.libertyeiffel.eclipse.editors;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class EiffelConfiguration extends TextSourceViewerConfiguration{
	
	private ContentAssistant contentAssistant;
	
	public EiffelConfiguration() {
		this(null);
	}

	public EiffelConfiguration(IPreferenceStore preferenceStore) {
		super(preferenceStore);
		
		//Initialize ContentAssistant
		contentAssistant = new ContentAssistant();
		
		//Define a default ContentAssistProcessor
		contentAssistant.setContentAssistProcessor(new CompletionProcessor(), 
				IDocument.DEFAULT_CONTENT_TYPE);
		
		//Set a proper orientation for the content assist proposal
		contentAssistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		
		contentAssistant.setInformationControlCreator(getInformationControlCreator(sourceViewer));
		
		return contentAssistant;
	}
}
