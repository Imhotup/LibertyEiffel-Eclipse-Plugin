package org.libertyeiffel.eclipse.editor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class EiffelColorProvider {
	 public static final RGB MULTI_LINE_COMMENT= new RGB(128, 0, 0);
	    public static final RGB SINGLE_LINE_COMMENT= new RGB(128, 128, 0);
	    public static final RGB KEYWORD= new RGB(0, 0, 128);
	    public static final RGB TYPE= new RGB(0, 0, 128);
	    public static final RGB STRING= new RGB(0, 128, 0);
	    public static final RGB MULTI_LINE_STRING= new RGB(0, 128, 128);
	    public static final RGB DEFAULT= new RGB(128, 40, 0);

	    
		protected Map<RGB, Color> colorTable= new HashMap<RGB, Color>(10);
	    
	    public void dispose() {
	        Iterator<Color> e= colorTable.values().iterator();
	        while (e.hasNext())
	            ((Color) e.next()).dispose();
	    }


	    public Color getColor(RGB rgb) {
	        Color color= (Color) colorTable.get(rgb);
	        if (color == null) {
	            color= new Color(Display.getCurrent(), rgb);
	            colorTable.put(rgb, color);
	        }
	        return color;
	    }
	
}
