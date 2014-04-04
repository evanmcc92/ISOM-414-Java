import javax.swing.*;
import java.awt.*;
// summer average temperature in Boston
public class tempex extends JApplet{
	public void init()
	{
		// Declare
		
		double maytemp;
		double juntemp;
		double jultemp;
		double augtemp;
		double sumtemp;
		
		double avertemp;
		
		// Assign value to variable using JOptionPane
		maytemp =Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in mayen"));
		juntemp =Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in jun"));
		jultemp =Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in jul"));
		augtemp =Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in Aug"));
		
		// Math model
		
		sumtemp = maytemp+juntemp+jultemp+augtemp;
		avertemp = sumtemp/4;
		
		// Display output using JOptionPane
		
		JOptionPane.showMessageDialog(null,"Calculating the summer temperature" + "\n_______________________"
				+"\nMay temperature:" + maytemp + "\nJun temperature:" + "\t" + juntemp + "\nJul temperature:" + jultemp
				+jultemp+"\nAug temperature:\t"+augtemp+"\n_______________________");
		System.exit(0);	
	}
}
