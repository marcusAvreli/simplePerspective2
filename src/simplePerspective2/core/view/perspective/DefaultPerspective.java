package simplePerspective2.core.view.perspective;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import simplePerspective2.ViewContainer;
import simplePerspective2.api.view.perspective.Perspective;
import simplePerspective2.api.view.perspective.PerspectiveConstraint;

public class DefaultPerspective implements Perspective {
	public static final String DEFAULT_PERSPECTIVE_ID = "DefaultPerspectiveID";
	private String id;
	private JTabbedPane auxiliaryPanel = new JTabbedPane();
	private JTabbedPane editionPanel = new JTabbedPane();
	private JTabbedPane navigationPanel = new JTabbedPane();
	private JSplitPane rightToLeft = new JSplitPane();
	private JSplitPane topBottom = new JSplitPane();
	private javax.swing.JPanel leftRootView;
    private javax.swing.JPanel rightRootView;
    private javax.swing.JSplitPane splitPane;
	private Component component;
	
	public Component getComponent() {
		return splitPane;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void addView(ViewContainer view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Container arrange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addView(ViewContainer view, PerspectiveConstraint constraint) {
		// TODO Auto-generated method stub
			component = view.getComponent();
			
			  splitPane = new javax.swing.JSplitPane();
		        leftRootView = new javax.swing.JPanel();
		        rightRootView = new javax.swing.JPanel();

		     

		        splitPane.setDividerLocation(200);

		        leftRootView.setLayout(new java.awt.BorderLayout());
		        splitPane.setLeftComponent(leftRootView);

		        rightRootView.setLayout(new java.awt.BorderLayout());
		        splitPane.setRightComponent(rightRootView);
			
		        rightRootView.add(component);
			
	}
	
	public DefaultPerspective(){
		
		this.navigationPanel.setName(PerspectiveConstraint.LEFT.name());
		this.auxiliaryPanel.setName(PerspectiveConstraint.BOTTOM.name());
		this.editionPanel.setName(PerspectiveConstraint.RIGHT.name());		
		this.auxiliaryPanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		this.navigationPanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		this.editionPanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);	
		
		this.editionPanel.setPreferredSize(new Dimension(0,400));
		this.auxiliaryPanel.setPreferredSize(new Dimension(0,200));
		this.navigationPanel.setPreferredSize(new Dimension(200,0));
		this.auxiliaryPanel.setVisible(false);
		this.topBottom.setOrientation(JSplitPane.VERTICAL_SPLIT);
		this.topBottom.setOneTouchExpandable(true);
		this.topBottom.setTopComponent(editionPanel);
		this.topBottom.setBottomComponent(auxiliaryPanel);
		this.rightToLeft.setLeftComponent(navigationPanel);
		this.rightToLeft.setRightComponent(topBottom);
		this.rightToLeft.setOneTouchExpandable(true);
	}

}
