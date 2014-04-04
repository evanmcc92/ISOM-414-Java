import java.awt.Container;

import javax.swing.*;

public class Average1 extends JApplet  {

	public void init(){
		

		float total = 0;
		float averageSale = 0;
		
		double nmonthlysales;
		String output = "";
		int counter = 0;
		double discount = 0;
		double totaldiscount = 0;
		
		
		
		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		
		
		while (counter < 12) {
			nmonthlysales = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Monthly Sales"));

			
			total+=nmonthlysales;
			
			if (nmonthlysales > 10000){
				discount = .02 * nmonthlysales;
			} else if (nmonthlysales > 40000) {
				discount = .03 * nmonthlysales;
			} else if (nmonthlysales > 70000) {
				discount = .05 * nmonthlysales;
			}
			
			totaldiscount+=discount;
			
			counter++;
		}
		averageSale = total/12;
		
		output="Yearly Sales\n$"+total+"\n\nAverage Sales\n$" + averageSale+"\n\nDiscount\n$" + totaldiscount ;
		
		outputArea.setText(output);
	}
}