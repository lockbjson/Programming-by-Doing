package input;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prog613 {

	public static void main(String[] args) {
		Frame613 f = new Frame613();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

class Frame613 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame613() {
		setTitle("613 rocks!");
		setSize(300, 200);
		setLocation(200, 300);;

		Panel613 panel = new Panel613();
		Container cp = getContentPane();
		cp.add(panel);
	}
}

class Panel613 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hiiiiiiiiiiiiiiiiii", 75, 100);
	}
}