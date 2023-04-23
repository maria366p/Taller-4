import java.awt.*;

import javax.swing.*;

public class PanelAbajo extends JPanel{

    private JLabel labelgame;
    private int contadorClicks=0;

    public PanelAbajo(FramePrincipal myMainFrame){
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);

        labelgame = new JLabel("Clicks: " + contadorClicks);

        this.add(labelgame);
        this.setVisible(true);
    }
    public void ContadorUp(){
        this.contadorClicks+=1;
        this.labelgame.setText("Jugadas: " + contadorClicks);
    }
    public void restartContadorClicks(){
        this.contadorClicks=0;
    }
}
