package LAB4;


public class Saving_account extends Accounts{
	 
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void withdraw(double d )
	{
		if(balance-d>=min_bal)
		{
			balance=balance-d;
			
			
		}
		else
			System.out.println("can not  do the transaction");
	}
	public void getBalance(){
		System.out.println(balance);
} 
}