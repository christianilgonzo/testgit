package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dati.keyinput;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class mainframe extends JFrame {

	private JPanel contentPane;
	private pannellogioco panel;

	/**
	 * Launch the application.
	 */
	


	/**
	 * Create the frame.
	 */
	public mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
				
		pannellogioco panel = new pannellogioco();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JButton btnposizionecasuale = new JButton("posizionecasuale");
		GridBagConstraints gbc_btnposizionecasuale = new GridBagConstraints();
		gbc_btnposizionecasuale.gridx = 0;
		gbc_btnposizionecasuale.gridy = 1;
		contentPane.add(btnposizionecasuale, gbc_btnposizionecasuale);
		
		
		btnposizionecasuale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				int x = r.nextInt((1024-0) + 1)+0;
				int y = r.nextInt((768-0) + 1)+0;
				panel.p.setX(x);
				panel.p.setY(y);
				panel.repaint();
				panel.validate();

			}
		});
		addKeyListener(new keyinput(panel));
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

}
