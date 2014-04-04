import javax.swing.*;

import java.awt.*;

public class softwareinc extends JApplet{
	public void init(){

		
		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		
		
		String empname, empid, output;
		double sales, statetax, commission, netincome;
		

		empid = JOptionPane.showInputDialog("Enter Employee ID");
		empname = JOptionPane.showInputDialog("Enter Employee Name");
		sales = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Sales"));
		statetax = Double.parseDouble(JOptionPane.showInputDialog("Enter State Tax Rate"));
		
		
		if (sales >= 10000.01){
			commission = .10;
		} else if (sales >= 5000.01){
			commission = .075;
		} else if (sales >= 1){
			commission = .05;
		} else {
			commission = 0;
		}
		
		
		netincome = 2000+(sales*commission);
		netincome = netincome-(statetax * netincome);
		
		
		output = "ID\tEmployee Name\tTotal Sale\tCommission\tState Tax\tNet Income\n"
				+ empid+"\t" +empname+"\t"+sales+"\t"+commission+"\t"+statetax+"\t"+netincome;
		
		
		JOptionPane.showMessageDialog(null, output);
		outputArea.setText(output);
	}
}