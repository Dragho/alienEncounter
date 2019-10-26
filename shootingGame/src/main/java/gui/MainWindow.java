package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class MainWindow extends Window{
	JButton bPlay;
	JLabel lMenu;
	
	public MainWindow() throws ClassNotFoundException{
		super();
		initWindow();
		createExitButton(this);
		gameInterface = createGameInterface(this);
		gamePanel = createGamePanel(this);
	}

	private void initWindow() {
		bPlay = new JButton("PLAY");
		bPlay.setBounds(160, 220, 180, 100);
		bPlay.setFont(new Font("SansSerif", Font.BOLD, 25));
		bPlay.setForeground(Color.black);
		add(bPlay);
		bPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					new Level().setLocationRelativeTo(null);
			}
		});
		
		lMenu = new JLabel("MAIN MENU");
		lMenu.setBounds(140, 20, 250, 50);
		lMenu.setFont(new Font("SansSerif", Font.BOLD, 20));
		add(lMenu);
	}
}
