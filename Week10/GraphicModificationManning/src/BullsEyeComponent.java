import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class BullsEyeComponent extends JComponent {
	public void paintComponent(Graphics g) {
		
		g.fillOval(155, 155, 190, 190);
		
		g.setColor(Color.WHITE);
		g.fillOval(175, 175, 150, 150);
		
		g.setColor(Color.BLACK);
		g.fillOval(195, 195, 110, 110);
		
		g.setColor(Color.WHITE);
		g.fillOval(215, 215, 70, 70);
		
		
		g.setColor(Color.BLACK);
		g.fillOval(235, 235, 30, 30);
		
		
		
		
		
	}
}
