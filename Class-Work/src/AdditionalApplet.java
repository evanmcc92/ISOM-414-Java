import java.awt.Graphics;

import javax.swing.*;

public class AdditionalApplet extends JApplet {
	double sum;
	public void init() {
		String spcprice,
		slaptopprice;
		double npcprice,
		nlaptopprice;
		spcprice = JOptionPane.showInputDialog("Enter first floating-point value, PC Price");
		slaptopprice = JOptionPane.showInputDialog("Enter first floating-point value, Laptop Price");
		npcprice = Double.parseDouble(spcprice);
		nlaptopprice = Double.parseDouble(slaptopprice);
		sum = npcprice + nlaptopprice;
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "addition calcuator", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	public void paint(Graphics g ){
		g.drawRect(15, 10, 270, 45);
		g.drawString("The sum is " + sum, 25,25);
		sum=sum*100;
		sum=Math.round(sum);
		sum=sum/100;
		g.drawString("The sum after rounding is " + sum, 25, 45);
	}
}