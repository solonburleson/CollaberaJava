
public class SecondMain {

	public static void main(String[] args) {
		Bicycle bike;
		Account acct;
		
		String myName = "Solon Burleson";
		bike = new Bicycle();
		bike.setOwnerName(myName);
		
		acct = new Account();
		acct.setOwnerName(myName);
		acct.setInitialBalance(250.00);

		acct.deposit(25.00);
		acct.withdraw(50);
		
		System.out.println(bike.getOwnerName() + " owns a bicycle and");
		System.out.println("has $" + acct.getBalance() + " left in the bank");
	}

}
