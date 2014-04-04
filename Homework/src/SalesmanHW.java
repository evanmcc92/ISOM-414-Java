
import java.awt.*;

import javax.swing.*;

public class SalesmanHW extends JApplet {
	String sprice, scost, scommissionrate, sname, saddress;
	double ncost, nprice, ncommission,ncommissionrate;
	String output = "";
	
	
	public void init() {

		sname = JOptionPane.showInputDialog("Enter name");
		saddress = JOptionPane.showInputDialog("Enter address");
		sprice = JOptionPane.showInputDialog("Enter total price");
		scost = JOptionPane.showInputDialog("Enter total cost");
		scommissionrate = JOptionPane.showInputDialog("Enter commission rate");
		
		ncost = Double.parseDouble(scost);
		nprice = Double.parseDouble(sprice);
		ncommissionrate = Double.parseDouble(scommissionrate);
		

		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);

		ncommission = ncommissionrate * (nprice - ncost);

		output="Name: "+sname+"\nAddress: "+saddress+"\nTotal Cost: $"+ncost+"\nTotal Price: $"+nprice+"\nTotal Commission: $" + ncommission;
		outputArea.setText(output);
	}
}