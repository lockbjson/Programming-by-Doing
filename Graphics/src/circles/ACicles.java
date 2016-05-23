package circles;

import java.awt.*;

import javax.swing.JFrame;

public class ACicles extends Canvas {

	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(45, 65, 100, 100);
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Circles");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ACicles a = new ACicles();
		win.add(a);
		win.setVisible(true);
	}

}
