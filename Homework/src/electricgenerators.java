import javax.swing.*;

public class electricgenerators extends JApplet{
	public void init(){

		JTextArea outputArea = new JTextArea(11,30);
		
		double presentProd = Double.parseDouble(JOptionPane.showInputDialog("Enter Present Production Value")), growthRate = .03, totalGrowthRate = 0, Total = 0, forecast = 0, yearlyGrowth = 0;
		int Counter=1, years = Integer.parseInt(JOptionPane.showInputDialog("Enter total years for production")), year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year (ex: 2014)"));
		
		outputArea.append("Year\tPresent Product\tForecast Production\tGrowth Rate");
		
		while (Counter <= years){
			totalGrowthRate = growthRate * Counter;
			yearlyGrowth = presentProd * totalGrowthRate;
			forecast = presentProd + yearlyGrowth;
			
			outputArea.append("\n"+year+"\t"+presentProd+"\t\t"+forecast+"\t\t"+totalGrowthRate);
			
			presentProd = presentProd + yearlyGrowth;
			Total = Total + yearlyGrowth;
			
			year++;
			Counter++;
		}
		
		outputArea.append("\n\nTotal Growth Over "+years+" Years\t"+Total);
		JOptionPane.showMessageDialog(null, outputArea, "Electric Generator Output", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}