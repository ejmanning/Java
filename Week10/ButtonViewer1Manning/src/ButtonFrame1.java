import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame1 extends JFrame {
	
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 200;
	
	public ButtonFrame1() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents() {
		JButton button1 = new JButton("A");
		JButton button2 = new JButton("B");
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		add(panel);
		
		ActionListener listener = new ClickListener();
		button1.addActionListener(listener);
		
		ActionListener listener2 = new ClickListener();
		button2.addActionListener(listener2);
		
	}
}
