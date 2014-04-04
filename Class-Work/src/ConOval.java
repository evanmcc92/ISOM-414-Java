import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;

public class ConOval extends JApplet  {
	public void paint(Graphics g){
		super.paint(g);
		for (int counter=1; counter<=8; counter ++){
			g.setColor(new Color(255, 20, 60));
			g.drawOval(110-counter*10, 110-counter*10, counter*20, counter*20);
		}
	}
}