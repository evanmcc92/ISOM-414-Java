import java.awt.Container;
import javax.swing.*;
public class SquareInt extends JApplet {
	public void init(){
		String output = "";
		String sInputnumber;
		int nInputnumber;
		JTextArea outputArea = new JTextArea(10,20);
		Container c = getContentPane();
		c.add(outputArea);
		int result;
		sInputnumber = JOptionPane.showInputDialog("Enter integer");
		nInputnumber = Integer.parseInt(sInputnumber);
		result = nInputnumber * nInputnumber;
		output="The square is " + result;
		outputArea.setText(output);
	}
}