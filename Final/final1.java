import java.awt.*;
import javax.swing.*;

public class final1 extends JApplet{
	public void init(){
		String output= "";
		double sales = 0, subtotal = 0, discount = 0, total = 0, discountrate = 0;
		
		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		
		
		for(int counter = 1; counter <= 3; counter++){
			sales = Double.parseDouble(JOptionPane.showInputDialog("Enter Sale "+counter));	
			subtotal += sales;
		}
		
		if (subtotal>2000){
			discountrate = 0.07;
		} else if (subtotal>1000){
			discountrate = 0.05;
		} else if (subtotal>500){
			discountrate = 0.02;
		} else {
			discountrate = 0;
		}
		
		discount = subtotal*discountrate;
		total = subtotal-discount;
		
		output = "\nSubtotal: $"+subtotal+"\nDiscount Rate: "+discountrate+"\nDiscounted Total: $"+discount+"\nTotal After Discount: $"+total;
		outputArea.setText(output);
		
	}
}