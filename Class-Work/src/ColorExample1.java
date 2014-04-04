import java.awt.*;
import java.applet.*;

public class ColorExample1 extends Applet{
	public void paint(Graphics g){
		super.paint(g);
		//class part 1
		//oval
		g.setColor(new Color(255,255,0));
		g.fillOval(10, 28, 220, 55);
		g.fillOval(10, 108, 220, 55);
		g.fillRect(10, 58, 220, 75);
		
		//words
		g.setColor(Color.blue);
		g.setFont( new Font("San Serif", Font.BOLD, 18));
		g.drawString("My name is", 75, 95);
		g.drawString("Evan!", 95, 115);
	}
}