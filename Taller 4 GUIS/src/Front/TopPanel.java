package Front;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class TopPanel extends JPanel implements ActionListener{
	
	private JLabel TamanioTxt= new JLabel("Tamaño: ");
	private JComboBox<String> tamanioComboBox;
	
	private JLabel DificultadTxt=new JLabel("Dificultad: ");
	JRadioButton facil =new JRadioButton("Fácil");
	JRadioButton medio =new JRadioButton("Medio");
	JRadioButton dificil =new JRadioButton("Difícil");
	ButtonGroup grupoDificultad;

	private Board myBoard;
	
	
	public TopPanel (MainFrame myMainFrame) {
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setBackground(new Color(0xABDEE6));
		
		TamanioTxt.setOpaque(false);
		DificultadTxt.setOpaque(false);

		myBoard= new Board(myMainFrame);
		
		grupoDificultad= new ButtonGroup();
		grupoDificultad.add(facil);
		facil.setOpaque(false);
		grupoDificultad.add(medio);
		medio.setOpaque(false);
		grupoDificultad.add(dificil);
		dificil.setOpaque(false);

		
		String[] tamaniosTablero= {"5x5", "6x6", "7x7", "8x8"};
		tamanioComboBox= new JComboBox<String>(tamaniosTablero);
		tamanioComboBox.setOpaque(false);
		tamanioComboBox.setPreferredSize(new Dimension(150,30));
		tamanioComboBox.addActionListener(this);
		
		add(TamanioTxt);
		add(tamanioComboBox);
		add(DificultadTxt);
		add(facil);
		add(medio);
		add(dificil);
		myMainFrame.add(myBoard, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String seleccionados = (String)tamanioComboBox.getSelectedItem();
		String tam = seleccionados.substring(0,1);
		myBoard.setTamanioTablero(Integer.parseInt(tam));
		myBoard.repaint();
		
	}
	
}
