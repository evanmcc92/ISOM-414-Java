import javax.swing.*;
import java.text.DecimalFormat;


public class Interest extends JApplet{
	public static void main (String args[]){
		double amount, prinicpal, rate;
		
		DecimalFormat precisionTwo = new DecimalFormat("0.00");
		
		JTextArea outputTextArea = new JTextArea(11,20);
		
		int clientval = Integer.parseInt(JOptionPane.showInputDialog("Enter number of clients"));
		
		for(int client = 1; client<=clientval;client++){
			prinicpal = Double.parseDouble(JOptionPane.showInputDialog("Enter Principal for client "+client));
			rate = Double.parseDouble(JOptionPane.showInputDialog("Enter Rate for client "+client));
			
			outputTextArea.append("\nClient "+client+"\nYear\tAmount on deposit\n");
			
			
			for(int year=1; year<=10;year++){
				amount = prinicpal *Math.pow(1 + rate, year);
				outputTextArea.append(year+"\t"+precisionTwo.format(amount)+"\n");
			}
			
			
		}
		JOptionPane.showMessageDialog(null,outputTextArea);
		System.exit(0);
	}
}