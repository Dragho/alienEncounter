package panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import gui.Alien;
import gui.MainWindow;

public class GamePanel extends JPanel{
	private static ArrayList<Alien> aliens;
	private final static int alienNrLimit = 1;
	
	public GamePanel() {
		initPanel();
		aliens = new ArrayList<Alien>();

	}
	
	public static String alienNr(Alien alien) {
		for(int i=0;i<aliens.size();i++) {
			if(alien==aliens.get(i))return "alien nr " + (i+1);
		}
		return null;
	}
	
	private void addAlien(Alien alien) {
		this.add(alien);
	}
	
	public void startSpawning() {
		ActionListener newEnemies = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(aliens.size()<alienNrLimit) {
					Alien alien = new Alien((int)Math.random()*(MainWindow.GAME_WINDOW_WIDTH-100),0,2,2,2);
					aliens.add(alien);
					addAlien(alien);
				}
			}
		};
		
		final Timer timer = new Timer(2000,newEnemies);
		timer.start();
	}
	
	
	private void initPanel() {
		setLayout(null);
		setSize(MainWindow.GAME_WINDOW_WIDTH, MainWindow.WINDOW_HEIGHT);
		setAlignmentX(LEFT_ALIGNMENT);
		//setAlignmentY(TOP_ALIGNMENT);
		setBackground(new Color(0,255,64));
	}
}
