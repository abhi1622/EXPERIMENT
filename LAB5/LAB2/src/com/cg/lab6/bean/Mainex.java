package com.cg.lab6.bean;
import java.util.Scanner;
 class NameEx extends Exception {
	NameEx(String msg){
	super(msg);
	}
	

}
 


 class Mainex {

	public static void main(String[] args) {
		try {System.out.println("enter fname lname");
			 String fname;
			  String lname;
			  Scanner s=new Scanner(System.in);
			fname=s.nextLine();
			lname=s.nextLine();
			if(( fname=="") && (lname==""
					+ ""
					+ " "))
			{
				throw new NameEx("blank not possible");
			}
		}
		catch(NameEx e) {
			
			System.out.println( e.getMessage());
			
			
		}
		System.out.println("exception completed");
			
		
		}
			
			
			
		}



