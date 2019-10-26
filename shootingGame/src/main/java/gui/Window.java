package gui;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import panels.GameInterface;
import panels.GamePanel;

public abstract class Window extends JFrame{
	public final static int WINDOW_WIDTH = 1280;
	public final static int WINDOW_HEIGHT = 720;
	public final static int GAME_WINDOW_WIDTH = 900;
	GameInterface gameInterface;
	GamePanel gamePanel;
	
	Window(){
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);		
	}
	GameInterface createGameInterface(JFrame jFrame) {
		gameInterface = new GameInterface();
		jFrame.add(gameInterface);
		//gameInterface = null;
		return gameInterface;
	}
	GamePanel createGamePanel(JFrame jFrame) {
		gamePanel = new GamePanel();
		jFrame.add(gamePanel);
		return gamePanel;
	}
	
	void createExitButton(JFrame jFrame) {
		JButton bExit = new JButton("Exit");
		bExit.setBounds(WINDOW_WIDTH-144, WINDOW_HEIGHT-77, 130, 40);
		bExit.setFont(new Font("SansSerif", Font.BOLD, 15));
		jFrame.add(bExit);
		bExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Object source = arg0.getSource();
					dispose();
				
			}
			
		});
	}
	
	
	
	
	
	
}
