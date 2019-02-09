package LAB4;

class  Accounts {
	double balance;
	final int min_bal=500;
	final double od_lim=10000;
	 public void getBalance() {
		System.out.println(balance);
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void   withdraw(double d )
	    
	    {
	    	System.out.println("In Account class withdraw method");
	    }
	  

}


	
	
