package panels;

import java.awt.Color;

import gui.Window;

public class GamePanel extends Panel{
	public GamePanel() {
		super();
		setBounds(0,0,Window.GAME_WINDOW_WIDTH, Window.WINDOW_HEIGHT);
		setBackground(new Color(0,255,64));
	}
}
