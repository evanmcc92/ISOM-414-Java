import javax.swing.JOptionPane;

public class whileloop {
	public static void main(String args []){
		int total, invoiceCounter, PCValue, SystemAverage;
		
		total = 0;
		invoiceCounter = 1;
		
		while(invoiceCounter<=10){
			PCValue = Integer.parseInt(JOptionPane.showInputDialog("Enter PC Price"));
			total = total + PCValue;
			invoiceCounter = invoiceCounter+1;
		}
		SystemAverage = total/10;
		JOptionPane.showMessageDialog(null, "Average is " + SystemAverage);
		System.exit(0);
	}
}