package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import panels.GameEntryPanel;
import panels.GameInterface;
import panels.GamePanel;

public class MainWindow extends JFrame{
	public final static int WINDOW_WIDTH = 1280;
	public final static int WINDOW_HEIGHT = 720;
	public final static int GAME_WINDOW_WIDTH = 900;
	JPanel gameInterface, gamePanel,  gameEntryPanel;
	
	JButton bPlay;
	JLabel lMenu;
	
	
	public MainWindow() {
		initWindow();
		gameEntryPanel = createJPanel(this, new GameEntryPanel());
		gamePanel = createJPanel(this, new GamePanel());
		gameInterface = createJPanel(this, new GameInterface());
		gameEntryPanelComponents();
		repaint();
	}
	
	private void initWindow() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		createExitButton(this);

	}
	
	private void gameEntryPanelComponents() {
		lMenu = new JLabel("MAIN MENU");
		lMenu.setBounds(140, 20, 250, 50);
		lMenu.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		bPlay = new JButton("PLAY");
		bPlay.setFont(new Font("SansSerif", Font.BOLD, 25));
		bPlay.setForeground(Color.black);
		bPlay.setBounds(WINDOW_WIDTH/2-100, WINDOW_HEIGHT/2-40, 200,80);
		bPlay.setAlignmentY(CENTER_ALIGNMENT);
		bPlay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
					remove(gameEntryPanel);
					((GamePanel) gamePanel).startSpawning();
					repaint();
			}
		});
		
		gameEntryPanel.add(bPlay);
	}
	
	private JPanel createJPanel(MainWindow mainWindow, JPanel gameInter) {
		JPanel jPanel = gameInter;
		mainWindow.add(jPanel);
		return jPanel;
	}
	
	private static void createExitButton(JFrame jFrame) {
		JButton bExit = new JButton("Exit");
		bExit.setBounds(WINDOW_WIDTH-154, WINDOW_HEIGHT-87, 130, 40);
		bExit.setFont(new Font("SansSerif", Font.BOLD, 15));
		jFrame.add(bExit);
		bExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		EventQueue.invokeLater(() -> {
			new MainWindow().setLocationRelativeTo(null);
        });
		
	}
}
