import javax.swing.*;

import java.awt.*;


public class quiz2 extends JApplet{

	public void init(){

		//initialize variables
		String output= "";
		double package_a_sold, package_b_sold, package_c_sold, package_a_quant, package_b_quant, package_c_quant;
		double total_quant, total_sale, discount, discount_rate, sale;

		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);

		//package prices
		package_a_sold = 99;
		package_b_sold = 199;
		package_c_sold = 299;
		
		//quantities
		package_a_quant = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of Package A"));
		package_b_quant = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of Package B"));
		package_c_quant = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of Package C"));
		
		//subtotal calculations
		sale = (package_a_sold*package_a_quant) + (package_b_sold*package_b_quant) + (package_c_sold*package_c_quant);
		total_quant = package_a_quant + package_b_quant + package_c_quant;
		
		//discount rate
		if (total_quant > 150){
			discount_rate = 0.5;
		} else if (total_quant > 99){
			discount_rate = 0.4;
		} else if (total_quant > 49){
			discount_rate = 0.3;
		} else if (total_quant > 19){
			discount_rate = 0.2;
		} else {
			discount_rate = 0;
		}
		
		//discount and total sales
		discount = sale * discount_rate;
		total_sale = sale - discount;
			
		//output
		output="Package A\n" +
				"\n" +
				"Price: \t$"+package_a_sold+"" +
				"\nQuantity: \t"+package_a_quant+"" +
				"\n--------------------\n" +
				"Package B\n" +
				"\n" +
				"Price: \t$"+package_b_sold+"" +
				"\nQuantity: \t"+package_b_quant+"" +
				"\n--------------------\n" +
				"Package C\n" +
				"\n" +
				"Price: \t$"+package_c_sold+"" +
				"\nQuantity: \t"+package_c_quant+"" +
				"\n" +
				"\n--------------------\n" +
				"--------------------\n\n" +
				"Subtotal: \t$"+sale+"" +
				"\nTotal Quantity: \t"+total_quant+"" +
				"\n--------------------\n" +
				"!!!!!!You qualify for a "+discount_rate+" discount!!!!!!" +
				"\n" +
				"\nDiscount: \t$"+discount+"" +
				"\n--------------------\n" +
				"Total Sale: \t$"+total_sale;
		
		outputArea.setText(output);
	}
}