package Front;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class MainFrame extends JFrame{
	
	private TopPanel myTopPanel;
	private RightPanel myRightPanel;
	private LowPanel myLowPanel;
	
	private boolean [][] matriz;
	

	public MainFrame(){
		setTitle("LightsOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setSize(700,700);
		setLayout(new BorderLayout());
		
		myTopPanel= new TopPanel(this);
		add(myTopPanel, BorderLayout.NORTH);

		myLowPanel= new LowPanel(this);
		add(myLowPanel, BorderLayout.SOUTH);
		
		myRightPanel = new RightPanel(this);
		add(myRightPanel, BorderLayout.EAST);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		//TODO
}
	public LowPanel getLowPanel(){
		return this.myLowPanel;
	}
}
