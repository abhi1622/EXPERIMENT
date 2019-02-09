package com.cg.eis.lab5_3;

public abstract class ABSAccount {
	
    int min=500;
	private long acnum;
	int balance=0;
	String accountholder;
	abstract void deposit(int a);
	abstract void withdraw(int b);
	abstract void getBal();

}
