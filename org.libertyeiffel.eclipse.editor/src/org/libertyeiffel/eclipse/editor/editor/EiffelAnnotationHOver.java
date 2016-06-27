package org.libertyeiffel.eclipse.editor.editor;

import java.util.Iterator;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;

public class EiffelAnnotationHOver implements IAnnotationHover {

	@SuppressWarnings("rawtypes")
	@Override
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		IAnnotationModel model = sourceViewer.getAnnotationModel();
		Iterator iterator = model.getAnnotationIterator();
		while (iterator.hasNext()) {
			Annotation annotation = (Annotation) iterator.next();
			Position position = model.getPosition(annotation);
			try {
				int lineOfAnnotation = sourceViewer.getDocument().
						getLineOfOffset(position.getOffset());
				if (lineNumber == lineOfAnnotation) {
					return annotation.getText();
				}
			} catch (BadLocationException e) {
				// TODO: handle exception
			}
			
		}
		return null;
	}
}
