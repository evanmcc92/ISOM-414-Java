import javax.swing.*;


public class average2 {
	public static void main(String args[]){
		int total = 0, invoiceCounter, scannerValue, systemAverage; 
		
		invoiceCounter = 1;
		
		do {
			scannerValue = Integer.parseInt(JOptionPane.showInputDialog("Enter integer scanner price"));
			total = total + scannerValue; 
			invoiceCounter++;
		} while (invoiceCounter<=10);
		
		systemAverage = total/10;
		
		JOptionPane.showMessageDialog(null, "The system price average is "+ systemAverage, "The System Average", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}