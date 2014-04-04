import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;

public class Applet2 extends Applet{

	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hello my name is", 25, 25);
		g.drawString("Evan", 25, 40);
		g.drawRect(25, 75, 150, 100);
		g.drawRect(35, 85, 130, 80);
		g.drawRect(45, 95, 110, 60);
		g.drawRect(55, 105, 90, 40);
		g.drawRect(65, 115, 70, 20);
		g.drawString("Stop", 85, 130);
		g.drawLine(175, 175, 250, 75);
		g.drawLine(325, 175, 250, 75);
		g.drawLine(325, 175, 175, 175);
		g.setColor(Color.orange);
		g.fillOval(125, 175, 550, 550);
		g.setColor(Color.yellow);
		g.fillOval(150, 200, 500, 500);
		g.setColor(Color.red);
		g.fillOval(200, 300, 50, 50);
		g.fillOval(250, 400, 50, 50);
		g.fillOval(400, 500, 50, 50);
		g.fillOval(300, 250, 50, 50);
		g.fillOval(500, 300, 50, 50);
		g.fillOval(550, 500, 50, 50);
		g.fillOval(250, 550, 50, 50);
		g.fillOval(600, 400, 50, 50);
		g.fillOval(300, 600, 50, 50);
		g.fillOval(400, 300, 50, 50);
		g.fillOval(400, 400, 50, 50);
		g.setColor(Color.black);
		g.fillArc(110, 175, 600, 600, 90, 45);
	}
}