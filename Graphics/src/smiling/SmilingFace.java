package smiling;

import java.awt.*;
import java.awt.geom.QuadCurve2D;

import javax.swing.JFrame;

public class SmilingFace extends Canvas {
	public void paint(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(200, 150, 400, 400);

		g.setColor(Color.blue);
		g.fillOval(300, 250, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(450, 250, 50, 50);

		Graphics2D g2d = (Graphics2D) g.create();
		QuadCurve2D.Double curve = new QuadCurve2D.Double(300, 425, 400, 500, 500, 425);
		g2d.setColor(Color.red);
		g2d.draw(curve);

		// labels
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for (int X = 0; X < 800; X += 50)
			g.drawString(String.valueOf(X), X, 50);
		for (int Y = 100; Y < 600; Y += 50)
			g.drawString(String.valueOf(Y), 28, Y);
		// lines
		g.setColor(Color.lightGray);
		for (int X = 0; X < 800; X += 50)
			g.drawLine(X, 0, X, 599); // horizontal
		for (int Y = 0; Y < 600; Y += 50)
			g.drawLine(0, Y, 799, Y); // vertical
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Smiling Face");
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmilingFace s = new SmilingFace();
		f.add(s);
		f.setVisible(true);
	}
}
