import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BankAccountPanel extends JPanel {

	BankAccount account;
	
	final int FIELD_WIDTH = 10;
	
	private JLabel amount = new JLabel("Amount: ");
	private JTextField insertAmount = new JTextField(FIELD_WIDTH);
	private JButton deposit = new JButton("Deposit");
	private JButton withdraw = new JButton("Withdraw");
	private JLabel balance = new JLabel("Balance: ");
	
	
	
	
	public class DepositClickListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = insertAmount.getText();
			try {
				double depositAmount = Double.parseDouble(a);
				account.deposit(depositAmount);
			}
			
			catch (Exception exception) {
				System.out.println("You are only allowed to enter numbers to deposit.");
			}
			balance.setText("Balance=$" + account.getBalance());
			
		}
		
	} 	
	
	public class WithdrawClickListener implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = insertAmount.getText();
			
			try {
				double withdrawAmount = Double.parseDouble(a);
				account.withdraw(withdrawAmount);
			}
			
			catch (Exception exception) {
				System.out.println("You are only allowed to enter numbers to withdraw.");
			}
			
			
			balance.setText("Balance=$" + account.getBalance());
		}
	}

	
	public BankAccountPanel(BankAccount b) {
		account = b;
		
		balance.setText("Balance = $" + account.getBalance());
		amount.setText("Amount: ");
		
		DepositClickListener d = new DepositClickListener();
		WithdrawClickListener w = new WithdrawClickListener();
		
		deposit.addActionListener(d);
		withdraw.addActionListener(w);
	
		add(amount);
		add(insertAmount);
		add(deposit);
		add(withdraw);
		add(balance);
		
	}


}

	
