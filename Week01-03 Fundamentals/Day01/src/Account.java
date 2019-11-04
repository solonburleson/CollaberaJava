
public class Account {
	private String ownerName;
	private double balance;
	
	public Account() {
		ownerName = "Unassigned";
		balance = 0;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	public void setInitialBalance(double deposit) {
		balance = deposit;
	}
}
