package simplePerspective2.api.view;

import simplePerspective2.ViewContainer;
import simplePerspective2.api.view.perspective.PerspectiveConstraint;

/**
 * This interface is intented to be used for those classes that are
 * going to host views.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/ViewAware.java
public interface ViewAware {
	
	/**
	 * Add a view to the current perspective 
	 * 
	 * @param view
	 */
	public void addView(ViewContainer view);
	public void addView(ViewContainer view,PerspectiveConstraint constraint);
	
	
}