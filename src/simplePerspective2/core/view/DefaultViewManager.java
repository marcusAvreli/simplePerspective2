package simplePerspective2.core.view;

import javax.swing.JFrame;

import simplePerspective2.api.view.perspective.Perspective;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/core/src/main/java/org/viewaframework/view/DefaultViewManager.java
public class DefaultViewManager extends AbstractViewManager
{
	private Perspective perspective;
	/**
	 * Default Constructor
	 */
	public DefaultViewManager(JFrame frame){
		super(frame);
	}
	
	public DefaultViewManager(JFrame frame,Perspective perspective){
		this(frame);
		
		
			this.setPerspective(perspective);
		
	}
	public void setPerspective(Perspective viewLayout) {
		if (this.getPerspective() == null){
			this.perspective = viewLayout;
		} else {
			this.getPerspective().clear();
			this.perspective = viewLayout;
		}
	}
	public Perspective getPerspective() {
		return this.perspective;
	}


}
