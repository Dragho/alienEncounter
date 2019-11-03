package panels;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.MainWindow;


public class GameEntryPanel extends JPanel{
	JLabel lMenu;
	JButton bPlay;
	
	public GameEntryPanel() {
		initPanel();
	}
	
	private void initPanel() {
		setLayout(null);
		setBounds(0,0,MainWindow.WINDOW_WIDTH, MainWindow.WINDOW_HEIGHT);
		setBackground(new Color(0,0,0));
	}
	
	
}
