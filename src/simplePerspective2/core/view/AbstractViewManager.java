package simplePerspective2.core.view;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JRootPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simplePerspective2.ViewContainer;
import simplePerspective2.ViewManager;
import simplePerspective2.api.view.perspective.PerspectiveConstraint;

public abstract class AbstractViewManager implements ViewManager
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractViewManager.class);
	private JFrame frame;
	
	public JFrame getFrame() {
		return frame;
	}
public AbstractViewManager(JFrame frame){
	this.frame=frame;
}
	public void addView	(ViewContainer view,PerspectiveConstraint constraint)  
	{
		Container content = view.getContentPane();
		if(null != content) {
			logger.info("is not null");
		}else {
			logger.info("is null");
		}
		JRootPane pane = view.getRootPane();
		if(null != pane) {
			logger.info("is not null");
		}else {
			logger.info("is null");
		}
		
	
	//	Component 	component 		= view.getRootPane();
		//content.add(component);
		//view.getRootPane().getContentPane().add(component);
		//pane.add(component);
		//view.getRootPane().getContentPane().add(component);
		this.getPerspective().addView(view,constraint);
		//JFrame frame = this.getFrame();
		frame.add(this.getPerspective().getComponent());
		
	}
	public void addView(ViewContainer view)  {
		this.addView(view,null);
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
