import java.awt.Container;

import javax.swing.*;
public class SquareIntV2 extends JApplet {
	public void init(){
		
		
		String output = "";
		String spcprice,
		slaptopprice;
		double npcprice,
		nlaptopprice;
		double sum;
		double difference;
		double product;
		double quotient;
		
		
		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		
		
		spcprice = JOptionPane.showInputDialog("Enter first floating-point value, PC Price");
		slaptopprice = JOptionPane.showInputDialog("Enter first floating-point value, Laptop Price");
		npcprice = Double.parseDouble(spcprice);
		nlaptopprice = Double.parseDouble(slaptopprice);
		
		sum = npcprice + nlaptopprice;
		difference = npcprice - nlaptopprice;
		product = npcprice * nlaptopprice;
		quotient = npcprice / nlaptopprice;
		sum=Math.round(sum);
		difference=Math.round(difference);
		product=Math.round(product);
		quotient=Math.round(quotient);
		
		output="Evan McCullough\n\nThe rounded sum is " + sum + ".\nThe rounded difference is " +difference+".\nThe rounded product is " +product+".\nThe rounded quotient is " +quotient;
		outputArea.setText(output);
	}
}