
import java.awt.*;

import javax.swing.*;

public class passfail extends JApplet {
	String sgrade;
	int ngrade;
	
	public void paint(Graphics g) {

		sgrade = JOptionPane.showInputDialog("Enter grade");
		ngrade = Integer.parseInt(sgrade);
		
		if (ngrade >= 90 ) {
			g.drawString("Your grade was " + ngrade + "%.", 25, 25);
			g.drawString("Pass with an A.", 25, 50);
		} else if (ngrade >= 80 ) {
			g.drawString("Your grade was " + ngrade + "%.", 25, 25);
			g.drawString("Pass with a B.", 25, 50);
		}else if (ngrade >= 70 ) {
			g.drawString("Your grade was " + ngrade + "%.", 25, 25);
			g.drawString("Pass with a C.", 25, 50);
		}else if (ngrade >= 60 ) {
			g.drawString("Your grade was " + ngrade + "%.", 25, 25);
			g.drawString("You failed.", 25, 50);
		}
	}
}