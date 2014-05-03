import javax.swing.*;
import java.awt.*;

public class quiz3 extends JApplet{
	public void paint(Graphics g){
		
		//initialize variables
		int counter1 = 1;
		int client = 0;
		int a = 115;
		int v = 15;
		int w = 35;
		int x = 55;
		int y = 75;
		int z = 95;
		double carPrice, delivery, insurance, taxrate = 0.056, tax, subtotal, total, supertotal = 0;
		
		client = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of clients"));
		
		
		//will run until counter is greater than 6
		while(counter1 <= client){
			
			//input
			carPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter car price for customer "+counter1));
			delivery = Double.parseDouble(JOptionPane.showInputDialog("Enter delivery fee for customer "+counter1));
			insurance = Double.parseDouble(JOptionPane.showInputDialog("Enter insurance cost for customer "+counter1));
			
			
			//math
			subtotal = carPrice + delivery +insurance;
			tax = subtotal * taxrate;
			total = subtotal - tax;

			//output being printed for each order 
			g.drawString("Client: "+counter1, 25, v);
			g.drawString("Car Price: $"+carPrice, 25, w);
			g.drawString("Delivery Fees: $"+delivery, 25, x);
			g.drawString("Insurance Cost: $"+insurance, 25, y);
			g.drawString("Invoice: $"+total, 25, z);

			//if counter is between 1 and 4 it will add this line to the bottom of each invoice
			if(counter1 <= 4){
				g.drawString("-----------------------------", 25, a);
			}

			//output message box for each post
			JOptionPane.showMessageDialog(null, "Client: "+counter1+
					"\nCar Price: $"+carPrice+
					"\nDelivery Fees: $"+delivery+
					"\nInsurance Cost: $"+insurance+
					"\nInvoice: $"+total);

			//have counter progress
			counter1++;
			
			//add 115 so that each of the printed lines move down for the next order
			a = a + 115;
			v = v + 115;
			w = w + 115;
			y = y + 115;
			z = z + 115;
			x = x + 115;
			
			//add for grand total
			supertotal = total + supertotal;
		}
		
		//show total of all invoices
		JOptionPane.showMessageDialog(null, "Grand Total for " + client + " client(s): $" + supertotal);
		
		//exit program
		System.exit(0);
	}
}