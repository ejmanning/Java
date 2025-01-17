package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

//Erica Manning
//This class draws and fills in the percentage bar
public class BudgetDrawing extends JComponent {
	
	private int x = 0;
	private int y = 0;
	private int totalLength = 250;
	private int height = 40;
	private int fillForFirstSection = 250;
	
	Color changeColor = Color.darkGray;
	
	/**
	 * 
	 */
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.darkGray);
		g.fillRect(x, y, totalLength, height);
		
		g.setColor(changeColor);
		g.fillRect(x, y, fillForFirstSection, height);

	}

	public void adjustFill(double fillAmount) {
		double fill = totalLength * fillAmount;
		fillForFirstSection = (int)fill;
		
		if(fillAmount >= 1) {
			changeColor = Color.red;
		}
		else if(fillAmount < 0.7) {
			changeColor = Color.green;
		}
		else {
			changeColor = Color.blue;
		}
		
		repaint();
		
	}
	
	public void clear() {
		changeColor = Color.darkGray;
	}
	
}
