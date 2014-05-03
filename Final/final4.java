import java.awt.*;
import java.applet.*;

public class final4 extends Applet{

	public void paint(Graphics g){
		g.setColor(Color.cyan);
		g.fillRect(10,10,275,275);
		g.setColor(Color.RED);
		g.fillOval(0,0,300,300);
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("SansSerif",Font.BOLD,20));
		g.drawString("Evan McCullough", 70, 145);
		g.setFont(new Font("Serif",Font.ITALIC,20));
		g.drawString("Developer Extraordinary", 45, 170);
	}
}