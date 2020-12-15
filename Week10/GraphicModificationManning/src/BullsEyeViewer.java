import javax.swing.JComponent;
import javax.swing.JFrame;

public class BullsEyeViewer {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		
		frame.setSize(500,500);
		frame.setTitle("Bullseye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent circle = new BullsEyeComponent();
		frame.add(circle);
		
		frame.setVisible(true);
	}
}
