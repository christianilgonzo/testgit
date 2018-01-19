package grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import dati.pedina;

public class pannellogioco extends JPanel {

	private Graphics2D g;
	/**
	 * Create the panel.
	 */
	public pedina p;
	public boolean interrupt = false;
	public int direction = -1;
	public static int upmove = 0;
	public static int downmove = 1;
	public static int leftmove = 2;
	public static int rightmove = 3;

	public pannellogioco() {
		setBackground(Color.WHITE);
		p = new pedina(0, 0);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;

		g2d.drawRect(p.getX(), p.getY(), p.width, p.height);


	}

}