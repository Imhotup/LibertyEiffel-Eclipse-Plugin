package org.libertyeiffel.eclipse.editor.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.libertyeiffel.eclipse.editor.EiffelEditorPlugin;

public class EiffelDocumentProvider extends TextFileDocumentProvider {
	
	public EiffelDocumentProvider() {
		
	}
	
	@Override
	protected FileInfo createFileInfo(Object element) throws CoreException{
		FileInfo info = super.createFileInfo(element);
		
		if (info == null) {
			info = createEmptyFileInfo();
		}
		
		IDocument document = info.fTextFileBuffer.getDocument();
		
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner(EiffelEditorPlugin
					.getDefault().getPartitionScanner(), EiffelPartitionScanner.PARTITION_TYPE);
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		
		return info;
	}
}
