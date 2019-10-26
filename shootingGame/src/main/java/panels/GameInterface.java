package panels;

import java.awt.Color;

import gui.Window;

public class GameInterface extends Panel{
	public GameInterface(){
		super();
		setBounds(900, 0, Window.WINDOW_WIDTH-Window.GAME_WINDOW_WIDTH, Window.WINDOW_HEIGHT);
		setBackground(new Color(255,55,164));
	}
}
