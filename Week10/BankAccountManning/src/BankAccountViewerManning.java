import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccountViewerManning {
	//Erica Manning
	public static void main(String[] args) {
	
		BankAccount bankAccount = new BankAccount(500);
		JPanel panel = new BankAccountPanel(bankAccount);
		
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Bank Account");
		
		
	}

}
