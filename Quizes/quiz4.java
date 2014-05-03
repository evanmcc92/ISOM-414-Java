import javax.swing.*;


public class quiz4 extends JApplet{
	public static void main (String args[]){
		//declare variables
		int monthtemp = 0, total = 0, average = 0;
		String region = "";
		
		//enter region name
		region = JOptionPane.showInputDialog("Enter Region Name");
		
		//initialize output
		JTextArea outputTextArea = new JTextArea(11,20);
		//first two lines of output
		outputTextArea.append("Region: "+region+"\n\nMonth\tTemperature\n");
		
		//start for loop
		for(int counter = 1; counter <= 12; counter++){
			//enter month's temperature
			monthtemp = Integer.parseInt(JOptionPane.showInputDialog("Enter Month "+counter+"'s Temperature"));

			//outputs each month's temperature
			outputTextArea.append(counter+"\t"+monthtemp+"\n");
			
			//adds all temps together
			total += monthtemp;
			
		}//end for loop
		
		//finds average of all temps
		average = total / 12;
		
		//outputs average temperature for the year
		outputTextArea.append("\nYear's Average Temperature: "+average);
		
		//shows output in message box
		JOptionPane.showMessageDialog(null,outputTextArea);
		
		//closes program
		System.exit(0);
	}
}