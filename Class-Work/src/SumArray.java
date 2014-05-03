import javax.swing.*;

import java.awt.*;

public class SumArray extends JApplet{
	public void init(){
		int Flash_Price[] = {23,22,33,54,26,66,47,28,29,99};
		int total = 0;
		
		for (int i = 0; i<Flash_Price.length; i++){
			total =+ Flash_Price[i];
		}
		JOptionPane.showMessageDialog(null, "Total Array Elements = "+total);
		System.exit(0);
	}
}