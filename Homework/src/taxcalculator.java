import javax.swing.*;

import java.awt.*;

public class taxcalculator extends JApplet{
	double grossincome, realestateincome, netinvestmentincome, totalincome, taxrate;
	double realestateexpense, lossoninvestments, totalexpenses, taxableincome, aftertaxincome, total;
	int y = 25;
	int z = 45;
	int counter1 = 1;
	int client;
	public void paint(Graphics g){
		client = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Clients"));
		
		while(counter1 <= client){
			grossincome = Double.parseDouble(JOptionPane.showInputDialog("Enter Gross Income"));
			realestateincome = Double.parseDouble(JOptionPane.showInputDialog("Enter real estate income"));
			netinvestmentincome = Double.parseDouble(JOptionPane.showInputDialog("Enter net investment income"));
			
			realestateexpense = Double.parseDouble(JOptionPane.showInputDialog("Enter real estate expense"));
			lossoninvestments = Double.parseDouble(JOptionPane.showInputDialog("Enter loss on investments"));

			totalincome = grossincome + realestateincome + netinvestmentincome;
			totalexpenses = realestateexpense + lossoninvestments;
			
			taxableincome = totalincome-totalexpenses;
			
			if(taxableincome >= 150000){
				taxrate = .33;
			} else if (taxableincome >= 100000){
				taxrate = .28;
			} else if (taxableincome >= 75000){
				taxrate = .23;
			} else if (taxableincome >= 40000){
				taxrate = .18;
			} else if (taxableincome >= 25000){
				taxrate = .15;
			} else if (taxableincome >= 15000){
				taxrate = .12;
			} else {
				taxrate = 0;
			}
			
			aftertaxincome = taxableincome-(taxableincome*taxrate);
			aftertaxincome = aftertaxincome*100;
			aftertaxincome = Math.round(aftertaxincome);
			aftertaxincome = aftertaxincome/100;
			
			total =+ aftertaxincome;

			g.drawString("Client: "+counter1, 25,y);
			g.drawString("Total After Tax: "+aftertaxincome, 25,z);
			
			counter1++;
			y = y + 45;
			z = z + 45;
		}
		JOptionPane.showMessageDialog(null, "Total is " +total);
	}
}
