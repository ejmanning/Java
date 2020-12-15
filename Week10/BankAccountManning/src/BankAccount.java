
public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double a) {
		balance += a;
	}
	
	public void withdraw(double a) {
		balance -= a;
	}
	
	
	
	
}
