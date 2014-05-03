import javax.swing.*;
import java.awt.*;


public class quiz1 extends JApplet{
	public void init(){
		
		
		//init variables
		double dcomp, dscan, dprint, dqcomp, dqscan, dqprint, total;
		String output ="";

		//input
		dcomp = Double.parseDouble(JOptionPane.showInputDialog("Enter Computer System Price"));
		dqcomp = Double.parseDouble(JOptionPane.showInputDialog("Enter Computer System Quantity"));
		dscan = Double.parseDouble(JOptionPane.showInputDialog("Enter Scanner Price"));
		dqscan = Double.parseDouble(JOptionPane.showInputDialog("Enter Scanner Quantity"));
		dprint = Double.parseDouble(JOptionPane.showInputDialog("Enter Printer Price"));
		dqprint = Double.parseDouble(JOptionPane.showInputDialog("Enter Printer Quantity"));
		
		//math
		total = (dcomp * dqcomp) + (dscan * dqscan) + (dprint * dqprint);
		
		//output
		
		//container
		//output
		output = "Invoice\n\n" +
			"--------------------------------------------\n" +
			"Computer System Price: $" + dcomp + "\nComputer System Quantity: " + dqcomp +
			"\n\nScanner Price: $" + dscan + "\nScanner Quantity: " + dqscan +
			"\n\nPrinter Price: $" + dprint + "\nPrinter Quantity: " + dqprint +
			"\n--------------------------------------------" +
			"\n\nTotal: $" + total;
			
		//put together
		
		//joption
//		JOptionPane.showMessageDialog(null,"Invoice\n\n" +
//				"--------------------------------------------\n" +
//				"Computer System Price: $" + dcomp + "\nComputer System Quantity: " + dqcomp +
//				"\n\nScanner Price: $" + dscan + "\nScanner Quantity: " + dqscan +
//				"\n\nPrinter Price: $" + dprint + "\nPrinter Quantity: " + dqprint +
//				"\n--------------------------------------------" +
//				"\n\nTotal: $" + total);
	}
}