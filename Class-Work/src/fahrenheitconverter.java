
import java.awt.Graphics;

import javax.swing.*;

public class fahrenheitconverter extends JApplet {
	public void init() {
		String scel, sfahr;
		double ncel, nfahr;
		double sum, sum2;
		scel = JOptionPane.showInputDialog("Enter degrees in celcius");
		ncel = Double.parseDouble(scel);
		sfahr = JOptionPane.showInputDialog("Enter degrees in fahrenheit");
		nfahr = Double.parseDouble(sfahr);
		sum = ncel * (9/5) + 32;
		sum2 = nfahr - 32 * (5/9);
		JOptionPane.showMessageDialog(null, "The temp from celcius ("+ncel+") in fahrenheit is " + sum + ". And the temp from fahrenheit ("+nfahr+") in celcius is " + sum2, "addition calcuator", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

//c*(9/5)+32=f
//(f-32)*(5/9)=c