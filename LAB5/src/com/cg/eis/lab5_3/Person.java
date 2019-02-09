package com.cg.eis.lab5_3;

public class Person extends ABSAccount {
	 void set_balance(int c)
	 {
		 balance=balance+c;
		 System.out.println(balance);
			                                     
	 }
	
	void deposit(int a)
	{
		balance=balance+a;
		
	}
    void withdraw(int b)
  {
	if(balance-b<min)
      System.out.println("not allowed");
	else
		balance=balance-b;

  }

@Override
  void getBal() {
	System.out.println(balance);
	
}

}
