package com.cg.lab6.bean;

import java.util.Scanner;

class AgeEx extends Exception {
	AgeEx(String msg){
	super(msg);
	}
	

}
class Age19
{

	public static void main(String[] args) {
		try {
			  System.out.println("enter age");
			  int age;
			  Scanner s=new Scanner(System.in);
			  age=s.nextInt();
			   if(age<15)
			   {
				throw new AgeEx("below 15 yr age  not possible");
			   }
		}
		catch(AgeEx e) {
			
			System.out.println( e.getMessage());
			
			
		}
		System.out.println("exception completed");
			
		
		}
			
			
			
		}



