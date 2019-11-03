package panels;

import java.awt.Color;

import javax.swing.JPanel;

import gui.MainWindow;

public class GameInterface extends JPanel{
	public GameInterface(){
		initPanel();
	}
	
	
	private void initPanel() {
		setLayout(null);
		setBounds(900, 0, MainWindow.WINDOW_WIDTH-MainWindow.GAME_WINDOW_WIDTH, MainWindow.WINDOW_HEIGHT);
		setBackground(new Color(255,55,164));
	}
}
