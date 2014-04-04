import javax.swing.*;
import java.awt.*;


public class electricgenerators extends JApplet{
	public void init(){

		JTextArea outputArea = new JTextArea(11,30);
		double presentprod = Double.parseDouble(JOptionPane.showInputDialog("Enter Present Production Value"));
		double yearly_growth = 0;
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year"));
		double growth_rate = .03;
		double total_growth_rate = 0;
		double Total = 0;
		double forecast = 0;
		int Counter=1;
		outputArea.append("Year\tPresent Product\tForecast Production\tGrowth Rate");
		while (Counter<=5){
			total_growth_rate = growth_rate * Counter;
			yearly_growth = presentprod*total_growth_rate;
			forecast=presentprod+yearly_growth;
			outputArea.append("\n"+year+"\t"+presentprod+"\t"+forecast+"\t"+total_growth_rate);
			presentprod = presentprod+yearly_growth;
			Total = Total + yearly_growth;
			year = year + 1;
			Counter++;
		}
		outputArea.append("\n\nTotal Growth\t"+Total);
		JOptionPane.showMessageDialog(null, outputArea);
	}
}