import javax.swing.*;

public class final5 extends JApplet{
	public void init(){
		String printername = "", compname = "", scannername ="";
		double printerprice, compprice, scannerprice, looptotal = 0,subtotal = 0, discount, discountrate, total;
		int counter1 = 1;
		JTextArea outputArea = new JTextArea(10,20);
		
		
		do {
			printername = JOptionPane.showInputDialog("Enter Printer Model");
			printerprice = Double.parseDouble(JOptionPane.showInputDialog("Enter Printer Price"));
		
			compname = JOptionPane.showInputDialog("Enter Computer System Model");
			compprice = Double.parseDouble(JOptionPane.showInputDialog("Enter Computer System Price"));
		
			scannername = JOptionPane.showInputDialog("Enter Scanner Model");
			scannerprice = Double.parseDouble(JOptionPane.showInputDialog("Enter Scanner Price"));
			
			looptotal = printerprice+compprice+scannerprice;
			subtotal +=looptotal;
			
			outputArea.append("Printer Name:\t"+printername+"\nPrinter Price:\t"+printerprice+"\n\nComputer System Name:\t"+compname+"\nComputer System Price:\t"+compprice+"\n\nScanner Name:\t"+scannername+"\nScanner Price:\t"+scannerprice+"\n\n---------------------\n");
				
			counter1++;
		}while(counter1 <= 3);
		
		
		if (subtotal>1000){
			discountrate = 0.05;
		} else if (subtotal>500){
			discountrate = 0.02;
		} else {
			discountrate = 0;
		}
		
		discount = subtotal*discountrate;
		total = subtotal-discount;
		
		outputArea.append("Subtotal: $"+subtotal+"\nDiscount Rate: "+discountrate+"\nDiscounted Total: $"+discount+"\nTotal After Discount: $"+total);
		JOptionPane.showMessageDialog(null, outputArea);
		
		System.exit(0);
	}
}