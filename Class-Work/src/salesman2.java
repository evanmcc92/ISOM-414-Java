import javax.swing.*;
import java.awt.*;

public class salesman2 extends JApplet{
	//variables
	double nprice1, nprice2, nprice3, min;
	
	public void paint(Graphics g){
		
		nprice1 = Double.parseDouble(JOptionPane.showInputDialog("Enter oil price 1"));
		nprice2 = Double.parseDouble(JOptionPane.showInputDialog("Enter oil price 2"));
		nprice3 = Double.parseDouble(JOptionPane.showInputDialog("Enter oil price 3"));
		
		if (nprice1 < nprice3){
			min = nprice1;
		} else if (nprice2 < nprice3){
			min = nprice2;
		} else {
			min = nprice3;
		}
		
		g.drawString("Minimum oil price is $" + min, 25,25);
	}
}