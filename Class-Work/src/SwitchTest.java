import javax.swing.*;

import java.awt.*;
public class SwitchTest extends JApplet{
	int choice;
	public void init(){
		String input;
		input = JOptionPane.showInputDialog("Enter 1 to draw lines\nEnter 2 to draw rectangles\nEnter 3 to draw ovals\n");
		choice = Integer.parseInt(input);
	}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.setFont(new Font("SansSerif",Font.BOLD,18));
		switch (choice){
		case 1:
			snowman(g);
			g.drawLine(10, 20, 100, 20);
			g.drawString("You chose 1", 10, 50);
			break;
		case 2:
			g.drawRect(10, 10, 50, 100);
			g.drawString("You chose 2", 15, 65);
			break;
		case 3:
			g.drawOval(10, 10, 50, 100);
			g.drawString("You chose 3", 15, 65);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid value entered");
		}
	}
	public void snowman(Graphics g){
		//copied from snowman.java
		
		
		
		super.paint(g);
		//background
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 500, 600);
		g.setColor(Color.gray);
		g.fillRect(0, 600, 500, 200);
		
		//sun
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 100, 100);
		g.setColor(Color.black);
		g.fillArc(35, 30, 25, 30, 180, 180);
		g.fillArc(60, 30, 25, 30, 180, 180);
		g.fillArc(35, 50, 50, 40, 180, 180);
		

		//shoes
		//right
		g.setColor(Color.black);
		g.fillRect(105, 575, 75, 100);
		g.fillRect(50, 625, 75, 50);
		g.fillArc(45, 562, 175, 175, 165, 30);
		//left
		g.fillRect(275, 575, 75, 100);
		g.fillRect(325, 625, 75, 50);
		g.fillArc(229, 562, 175, 175, 345, 30);
		
		//body
		g.setColor(Color.white);
		g.fillOval(150, 25, 150, 150);
		g.fillOval(75, 325, 300, 300);
		g.setColor(Color.lightGray);
		g.fillOval(110, 180, 230, 200);
		g.setColor(Color.white);
		g.fillOval(110, 175, 230, 200);
		
		//head stuff
		g.setColor(Color.black);
		//eyes
		g.fillOval(180, 75, 25, 25);
		g.fillOval(245, 75, 25, 25);
		//mouth
		g.fillOval(180, 125, 15, 15);
		g.fillOval(205, 135, 15, 15);
		g.fillOval(230, 135, 15, 15);
		g.fillOval(255, 125, 15, 15);
		//nose
		g.setColor(Color.orange);
		g.fillArc(160, 75, 70, 70, 340, 30);
		
		//hat
		g.setColor(Color.black);
		g.fillRect(163, 10, 125, 50);
		g.fillRect(125, 60, 200, 5);
		
		//body 2
		g.fillOval(218, 215, 15, 15);
		g.fillOval(218, 265, 15, 15);
		g.fillOval(218, 315, 15, 15);
		
		//body 3
		g.fillOval(218, 425, 15, 15);
		g.fillOval(218, 500, 15, 15);
		g.fillOval(218, 575, 15, 15);
		
		//arms
		g.setColor(Color.black);
		//right
		g.drawLine(108, 170, 80, 100);
		g.drawLine(108, 170, 50, 120);
		g.drawLine(150, 230, 60, 100);
		//left
		g.drawLine(335, 170, 350, 100);
		g.drawLine(335, 170, 320, 120);
		g.drawLine(380, 100, 300, 230);
		
		//scarf
		g.setColor(Color.red);
		g.fillArc(222, 137, 80, 80, 345, 30);
		g.fillArc(147, 137, 80, 80, 165, 30);
		g.fillRect(150, 165, 150, 25);
		g.fillArc(222, 187, 80, 80, 255, 30);
		g.fillRect(250, 165, 25, 100);

		
		//snow
		g.setColor(Color.white);
		g.fillOval(10, 10, 10, 10);
		g.fillOval(40, 20, 10, 10);
		g.fillOval(60, 200, 10, 10);
		g.fillOval(75, 40, 10, 10);
		g.fillOval(50, 430, 10, 10);
		g.fillOval(10, 289, 10, 10);
		g.fillOval(100, 175, 10, 10);
		g.fillOval(440, 600, 10, 10);
		g.fillOval(300, 500, 10, 10);
		g.fillOval(400, 379, 10, 10);
		g.fillOval(450, 450, 10, 10);
		g.fillOval(400, 60, 10, 10);
		g.fillOval(450, 100, 10, 10);
		g.fillOval(375, 260, 10, 10);
		g.fillOval(340, 720, 10, 10);
		g.fillOval(300, 180, 10, 10);
		g.fillOval(260, 10, 10, 10);
		g.fillOval(150, 400, 10, 10);
	}
}