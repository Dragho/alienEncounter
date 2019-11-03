package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import panels.GamePanel;

public class Alien extends JLabel{
	private int xPosition;
	private int yPosition;
	private int size = 100;
	
	private int xSpeed;
	private int ySpeed;
	private int speed;
	
	private int hp=3;
	
	
	private ImageIcon imageIcon = new ImageIcon("C:/Users/bartm/git/Tents-and-trees/TreeGame/images/drzewo.png");
	
	
	public Alien(int xPosition, int yPosition, int xSpeed, int ySpeed, int speed) {
		//this.setSize(new Dimension(size,size));
		System.out.println("Alien has been created xPosition = "+ xPosition +
				" yPosition = " + yPosition + " xSpeed = " + xSpeed +
				" ySpeed = " + ySpeed + " speed = " + speed );
		this.setIcon(imageIcon);
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.speed = speed;
		move();
		repaint();
	}
	
	private void grow() {
		//this.setSize(size, size);
		this.setBounds(xPosition, yPosition, size, size);
		this.setIcon(imageIcon);
		System.out.println(GamePanel.alienNr(this) +" has been MOVED xPosition = "+ xPosition +
				" yPosition = " + yPosition + " size = " + size);
	}

	public void move() {
		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				xPosition+=xSpeed;
				yPosition+=ySpeed;
				size+=speed;
				grow();
			}
			
		};
		Timer timer = new Timer(100,actionListener);
		timer.start();
	}
	
	public void dmgTaken(int dmgNumber) {
		hp-=dmgNumber;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
