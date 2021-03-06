package org.libertyeiffel.eclipse.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.libertyeiffel.eclipse.editor.editor.EiffelDocument;
import org.libertyeiffel.eclipse.editor.editor.EiffelPartitionScanner;

public class EiffelDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 extension3 = (IDocumentExtension3) document;
			IDocumentPartitioner partitioner = new FastPartitioner(EiffelEditorPlugin
					.getPartitionScanner(), EiffelPartitionScanner.PARTITION_TYPE);
			extension3.setDocumentPartitioner(EiffelEditorPlugin.MY_PARTITIONING, partitioner);
			partitioner.connect(document);
		}
		
		return document;
	}
	
	@Override
	protected IDocument createEmptyDocument() {
		return new EiffelDocument();
	}
}
