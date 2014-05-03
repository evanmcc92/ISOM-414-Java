import javax.swing.*;

public class final3 extends JApplet{
	public void init(){
		int caseswitch;
		
		caseswitch = Integer.parseInt(JOptionPane.showInputDialog("Did the student complete the final, midterm, and project?\n(1 for yes, 2 for no)"));
		
		switch (caseswitch){
			case 1:
				grades();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Thats not good =(, come back when they have.");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong selection, try again.");
				init();
				break;
		}
	}
	public void grades(){
		double finalgrade = 0, midtermgrade = 0, projectgrade = 0, totalgrade = 0;
		
		finalgrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Final Exam Grade"));
		midtermgrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Midterm Exam Grade"));
		projectgrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Project Grade"));
		
		totalgrade = (finalgrade*0.40)+(midtermgrade*0.30)+(projectgrade*0.30);
		
		JOptionPane.showMessageDialog(null, "The students total grade is "+totalgrade);
		System.exit(0);
	}
}