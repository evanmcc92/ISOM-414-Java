import javax.swing.*;

import java.awt.*;

public class taxcalculator2 extends JApplet{
	String empname="", empid="";
	double sales, statetax, commission, netincome;
	int counter1 = 1;
	int x = 1;
	int y = 25;
	int z = 45;
	int client =1;
	int var1;
	public void init(){
		client = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Clients"));
	}

	
	

	public void paint(Graphics g){
		
		setSize(500,500);
		g.drawString("ID\tEmployee Name\tTotal Sale\tCommission\tState Tax\tNet Income", 25,y);
		while(counter1 <= client){

			empid = JOptionPane.showInputDialog("Enter Employee ID");
			empname = JOptionPane.showInputDialog("Enter Employee Name");
			sales = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Sales"));
			statetax = Double.parseDouble(JOptionPane.showInputDialog("Enter State Tax Rate"));
			
			if (sales >= 10000.01){
				var1 = 1;
			} else if (sales >= 5000.01){
				var1 = 2;
			} else if (sales >= 1){
				var1 = 3;
			} else {
				var1 = 4;
			}
			
			switch (var1){
			case 1:
				commission = .10;
				break;
			case 2:
				commission = .075;
				break;
			case 3:
				commission = .05;
				break;
			case 4:
				commission = 0;
				break;
			default:
				commission = 0;
				break;
			}
			
			
			netincome = 2000+(sales*commission);
			netincome = netincome-(statetax * netincome);
			
			
			
			g.drawString(empid+"\t" +empname+"\t"+sales+"\t"+commission+"\t"+statetax+"\t"+netincome, 25,z);
			
			counter1++;
			y = y + 45;
			z = z + 45;
		}
	}
}