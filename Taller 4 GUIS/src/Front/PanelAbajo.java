package Front;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PanelAbajo extends JPanel{

    private JLabel JuegosLabel;
    private int contarMousePressed=0;

    public PanelAbajo(PanelPrincipal myMainFrame){
        setSize(500,500);
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);

        JuegosLabel = new JLabel("Click que se han hecho: " + contarMousePressed);

        this.add(JuegosLabel);
        this.setVisible(true);
    }
    public void aumentarContador(){
        this.contarMousePressed+=1;
        this.JuegosLabel.setText("Jugadas: " + contarMousePressed);
    }
}
