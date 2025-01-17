import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OneHundredButtonsManning {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel name = new JLabel("Erica Manning");
		panel.add(name);
		

		for(int i = 1; i<=100; i++) {
			String buttonLabel = String.valueOf(i);
			JButton button = new JButton(buttonLabel);
			panel.add(button);

		}
		
		frame.add(panel);
		
		final int FRAME_WIDTH = 700;
		final int FRAME_HEIGHT = 700;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
	}
	
}
