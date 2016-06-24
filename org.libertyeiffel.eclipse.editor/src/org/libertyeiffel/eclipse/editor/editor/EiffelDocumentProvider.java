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

//	@Override
//	protected IDocument createDocument(Object element) throws CoreException {
//		IDocument document = super.createDocument(element);
//		
//		if (document instanceof IDocumentExtension3) {
//			IDocumentExtension3 extension3 = (IDocumentExtension3) document;
//			IDocumentPartitioner partitioner = new FastPartitioner(EiffelEditorPlugin
//					.getDefault().getPartitionScanner(), EiffelPartitionScanner.PARTITION_TYPE);
//			extension3.setDocumentPartitioner(EiffelEditorPlugin.MY_PARTITIONING, partitioner);
//			partitioner.connect(document);
//		}
//		
//		return document;
//	}
//	
//	@Override
//	protected IDocument createEmptyDocument() {
//		return new EiffelDocument();
//	}
}
