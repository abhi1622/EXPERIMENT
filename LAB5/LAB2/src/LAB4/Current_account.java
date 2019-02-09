package LAB4;

class Current_account extends Accounts{
	

	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void withdraw(double e )
	    
	{    
	
		if(e>od_lim)
			System.out.println("can not deposit money");
		else {
			   balance=balance-e;
		}
		
	}
	
	 public  void getBalance(){
			System.out.println(balance);
		}
	
	
	
}