package LAB4;

public class Mainaccount {

	public static void main(String[] args) {
		Saving_account s1=new Saving_account();
		Current_account c1=new Current_account();
		s1.setBalance(2000.0);
		c1.setBalance(5000.0);
		s1.withdraw(500.0);
		c1.withdraw(10000);
		s1.getBalance();
		c1.getBalance();
		c1.withdraw(7000);
		c1.getBalance();
		c1.withdraw(700);
		c1.getBalance();
	}

}
