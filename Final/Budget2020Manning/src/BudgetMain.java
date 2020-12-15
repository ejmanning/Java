import javax.swing.JFrame;
import javax.swing.JPanel;

import graphics.BudgetPanel;

//Erica Manning
//This class shows the frame and panel (the display)
public class BudgetMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new BudgetPanel();
		
		frame.add(panel);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
