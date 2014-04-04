
import java.awt.*;

import javax.swing.*;

public class Salesman extends JApplet {
	String starget, sbonus;
	String output = "";
	int ntarget;
	double bonus;
	
	
	public void init() {

		starget = JOptionPane.showInputDialog("Enter sales volume");
		ntarget = Integer.parseInt(starget);
		

		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		
		if (ntarget >= 100000 ) {
			bonus = 100 + 0.01 * (ntarget-100000);
			sbonus = Double.toString(bonus);
			output="Satisfactory bonus is " + sbonus;
			outputArea.setText(output);
		} else   {
			bonus = 0;
			sbonus = Double.toString(bonus);
			output="Satisfactory bonus is " + sbonus;
			outputArea.setText(output);
		}
	}
}