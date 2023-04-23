package Front;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PanelDerecho extends JPanel implements ActionListener{

    private Board myBoard;

    public RightPanel(MainFrame myMainFrame){
        setPreferredSize(new Dimension(150, getPreferredSize().height));
		setBackground(new Color(0xC5C6D0));
        setLayout(new BoxLayout( this, BoxLayout.Y_AXIS));

        myBoard= new Board(myMainFrame);

        JButton button1 = new JButton("Nuevo");
        JButton button2 = new JButton("Reiniciar");
        JButton button3 = new JButton("TOP-10");
        JButton button4 = new JButton("Cambiar Jugador");

        add(Box.createVerticalGlue());add(Box.createVerticalGlue());
        add(button1, BorderLayout.CENTER);
        button1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(button2, BorderLayout.CENTER);
        button2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(button3, BorderLayout.CENTER);
        button3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(button4, BorderLayout.CENTER);
        button4.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());add(Box.createVerticalGlue());
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
