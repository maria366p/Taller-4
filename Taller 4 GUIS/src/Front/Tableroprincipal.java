package Front;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import uniandes.dpoo.taller4.modelo.Tablero;
public class Board extends JPanel implements MouseListener{
	
	private int TamanioTablero=5;
	private MainFrame myMainFrame;
	private Tablero tablero;
	//private int ultima_columna;
	//private int ultima_fila;
	//private int[][] cantidades;

	
	public Board(MainFrame inputMainFrame) {
		this.myMainFrame=inputMainFrame;
		addMouseListener(this);
		this.tablero= new Tablero(this.TamanioTablero);
	}
	
	public void setTamanioTablero(int inputTamanio) {
		this.TamanioTablero= inputTamanio;
		this.tablero= new Tablero(this.TamanioTablero);
	}
	
	public void paint(Graphics graphic) {
		Graphics2D graphic2D= (Graphics2D) graphic;
		int ancho = getWidth() / TamanioTablero;
		int alto = getHeight() / TamanioTablero;
		
		for (int i = 0; i < TamanioTablero; i++) 
		{
			for (int j = 0; j < TamanioTablero; j++) 
			{	
				Rectangle2D.Double rect = new Rectangle2D.Double(i*ancho,j*alto,ancho,alto);
				Color elColor= new Color(0xFFD200);

				if (tablero.darTablero()[i][j]){
					elColor= Color.BLACK;
				}else{
					elColor= new Color(0xFFD200);
				}
				
				graphic2D.setColor(elColor);
				graphic2D.fill(rect);
				Image image=Toolkit.getDefaultToolkit().getImage("Taller4_LightsOut_esqueleto/data/luz.png");
				graphic2D.drawImage(image, i*ancho+17,j*alto+17,ancho-35,alto-35, this);
				graphic2D.setColor(Color.GRAY);
				graphic2D.draw(rect);


			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int click_x = e.getX();
		int click_y = e.getY();
		int[] casilla = convertirCoordenadasACasilla(click_y, click_x);
		//cantidades[casilla[0]][casilla[1]]++;
		tablero.jugar(casilla[0], casilla[1]);

		//this.ultima_fila = casilla[0];
		//this.ultima_columna = casilla[1];
		repaint();
		
		myMainFrame.getLowPanel().aumentarContador();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	private int[] convertirCoordenadasACasilla(int x, int y){;
	int altoPanelTablero = getHeight();
	int anchoPanelTablero = getWidth();
	int altoCasilla = altoPanelTablero / TamanioTablero;
	int anchoCasilla = anchoPanelTablero / TamanioTablero;

	int fila = (int) (y / altoCasilla);
	int columna = (int) (x / anchoCasilla);

	return new int[] { fila, columna };
	}
}
