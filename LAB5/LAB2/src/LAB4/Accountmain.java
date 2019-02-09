package LAB4;

public class Accountmain {

	public static void main(String[] args) {
		Account ac1=new Account();
		Account ac2=new Account();
		ac1.setName("smith");
		ac1.setAge(25.12f);
		ac1.getName();
		ac1.getAge();
	    ac2.setName("kathi");
		ac1.setBalance(2000);
		ac2.setBalance(3000);
		ac1.getBalance();
		ac2.getbalance();
		ac1.deposit(2000.0);
		ac2.withdraw(2000.0);
		ac1.getBalance();
		ac2.getbalance();
		System.out.println(ac1);

	}

}
