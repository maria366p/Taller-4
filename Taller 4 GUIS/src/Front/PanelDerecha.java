import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PanelDerecha extends JPanel implements ActionListener{

    private FramePrincipal miTableroPrinci;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public PanelDerecha(FramePrincipal miTableroPrinci){
        this.miTableroPrinci=miTableroPrinci;
        setPreferredSize(new Dimension(150, getPreferredSize().height));
		setBackground(new Color(0xC5C6D0));
        setLayout(new BoxLayout( this, BoxLayout.Y_AXIS));


        boton1 = new JButton("Nuevo");
        boton1.addActionListener(this);
        boton2 = new JButton("Reiniciar");
        boton2.addActionListener(this);
        boton3 = new JButton("TOP-10");
        boton3.addActionListener(this);
        boton4 = new JButton("Cambiar Jugador");
        boton4.addActionListener(this);

        add(Box.createVerticalGlue());add(Box.createVerticalGlue());
        add(boton1, BorderLayout.CENTER);
        boton1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(boton2, BorderLayout.CENTER);
        boton2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(boton3, BorderLayout.CENTER);
        boton3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(boton4, BorderLayout.CENTER);
        boton4.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());add(Box.createVerticalGlue());
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==boton2){
            miTableroPrinci.getPanelArriba().getMyTableroPrincipal().restartTablero();
            miTableroPrinci.getPanelAbajo().restartContadorClicks();
        }else if(e.getSource()==boton1){
            miTableroPrinci.getPanelArriba().getMyTableroPrincipal().playAgain();
        }
    }
    
}

