package simplePerspective2;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRootPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simplePerspective2.api.view.perspective.Perspective;
import simplePerspective2.api.view.perspective.PerspectiveConstraint;
import simplePerspective2.core.view.AbstractViewContainer;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/api/src/main/java/org/viewaframework/view/ViewManager.java
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/core/src/main/java/org/viewaframework/view/AbstractViewManager.java
public interface ViewManager 
{
	public static final String ROOT_VIEW_ID = "rootViewId";	
	public JFrame getFrame();
	public void setFrame(JFrame frame);
	public void addView	(ViewContainer view);  	
	public void addView	(ViewContainer view,PerspectiveConstraint constraint);
	/**
	 * @return
	 */
	public Perspective getPerspective();
	/**
	 * @param viewLayout
	 */
	public void setPerspective(Perspective perspective);
}
