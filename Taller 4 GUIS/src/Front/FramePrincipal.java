import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


import javax.swing.JFrame;


public class FramePrincipal extends JFrame{
	
	private PanelArriba myPanelArriba;
	private PanelDerecha myRightPanel;
	private PanelAbajo myPanelAbajo;
	
	

	public FramePrincipal(){
		setTitle("LightsOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(670,605);
		setLayout(new BorderLayout());
		
		myPanelArriba= new PanelArriba(this);
		add(myPanelArriba, BorderLayout.NORTH);

		myPanelAbajo= new PanelAbajo(this);
		add(myPanelAbajo, BorderLayout.SOUTH);
		
		myRightPanel = new PanelDerecha(this);
		add(myRightPanel, BorderLayout.EAST);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
}
	public PanelAbajo getPanelAbajo(){
		return this.myPanelAbajo;
	}

	public PanelArriba getPanelArriba() {
		return myPanelArriba;
	}
}
