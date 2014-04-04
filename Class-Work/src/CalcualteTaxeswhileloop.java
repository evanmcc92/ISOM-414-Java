import javax.swing.*;
import java.awt.*;

public class CalcualteTaxeswhileloop extends JApplet{
	double gross, cap, tax, total, ftotal, tax_wh;
	int client;
	int x = 1;
	int y = 45;
	int z = 85;
	int counter1 = 1;
	public void paint(Graphics g){
		
		client = Integer.parseInt(JOptionPane.showInputDialog("Enter Gross"));
		
		while(counter1 <= client){
			gross = Double.parseDouble(JOptionPane.showInputDialog("Enter Gross"));
			cap = Double.parseDouble(JOptionPane.showInputDialog("Enter Capital Gain"));
			tax_wh = Double.parseDouble(JOptionPane.showInputDialog("Enter Tax Withheld"));
			
			total = gross + cap;
			
			if(total >= 100000){
				tax = .28;
			} else if (total >= 70000){
				tax = .20;
			} else if (total >= 50000){
				tax = .15;
			} else if (total >= 25000){
				tax = .10;
			}
			
			ftotal = (total*tax)-tax_wh;
			ftotal = ftotal*100;
			ftotal = Math.round(ftotal);
			ftotal = ftotal/100;

			g.drawString("Client: "+counter1, 25,y);
			g.drawString("Total Tax: "+ftotal, 25,z);
			
			counter1++;
			y = y + 65;
			z = z + 65;
		}
	}
}