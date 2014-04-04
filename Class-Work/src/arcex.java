import java.awt.Graphics;
import java.awt.Color;
import java.applet.*;

public class arcex extends Applet{

	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		g.fillArc(110, 175, 600, 600, 90, 45);
		}
	};