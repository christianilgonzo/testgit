package dati;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import grafica.pannellogioco;

public class keyinput implements KeyListener {

	pannellogioco pg;
	Timer timerup;
	Timer timerdown;
	Timer timerleft;
	Timer timerright;
	
	
	public keyinput(pannellogioco pg) {
		super();
		this.pg = pg;
		Timer timerup = new Timer(3000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
					int y = p.getY() - 1;
					p.setY(y);
				repaint();
				validate();
			}

		});

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		if (e.getKeyCode() == KeyEvent.VK_UP) {

			timer = new Timer(200, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					int y = pg.p.getY() - 1;
					pg.p.setY(y);

					pg.repaint();
					pg.validate();
				}

			});
			timer.stop();
			timer.start();

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			timer = new Timer(200, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					int y = pg.p.getY() + 1;
					pg.p.setY(y);

					pg.repaint();
					pg.validate();
				}

			});
			timer.stop();
			timer.start();

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			timer = new Timer(200, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					int y = pg.p.getX() - 1;
					pg.p.setX(y);

					pg.repaint();
					pg.validate();
				}

			});
			timer.stop();
			timer.start();

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			timer = new Timer(200, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					int y = pg.p.getX() + 1;
					pg.p.setX(y);

					pg.repaint();
					pg.validate();
				}

			});
			timer.stop();
			timer.start();

		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
