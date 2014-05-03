import javax.swing.*;

public class final2 extends JApplet{
	public void init(){
		String empname = "";
		double hours = 0, rate = 0,bonus = 0, salary = 0;
		JTextArea outputArea = new JTextArea(10,20);

		empname = JOptionPane.showInputDialog("Enter Employee's name");
		hours = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee's hours"));
		rate = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee's hourly rate"));
		bonus = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee's bonus"));
		
		salary = (hours * rate)+bonus;
		
		outputArea.append("Employee Name:\t"+empname+"\nEmployee Salary:\t"+salary+"\nEmployee Bonus:\t"+bonus);
		
		JOptionPane.showMessageDialog(null,outputArea);
		System.exit(0);
	}
}