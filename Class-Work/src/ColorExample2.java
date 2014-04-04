import java.awt.*;
import java.applet.*;

public class ColorExample2 extends Applet{
	public void paint(Graphics g){
		super.paint(g);
		//arc
		g.setColor(new Color(40,61,81));
		g.fillArc(25, 30, 200, 300, 0, 90);
		g.fillArc(25, 30, 200, 300, 90, 90);
		
		g.setColor(Color.pink);
		g.fillArc(25, 30, 200, 300, 180, 180);
		
		//words
		g.setColor(Color.white);
		g.setFont( new Font("San Serif", Font.BOLD, 12));
		g.drawString("My name is", 135, 135);
		g.drawString("Evan!", 135, 155);
		
		//
	}
}