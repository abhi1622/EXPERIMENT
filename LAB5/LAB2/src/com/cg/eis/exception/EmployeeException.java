package com.cg.eis.exception;

import java.util.Scanner;



class SalEx extends Exception {
	SalEx(String msg){
	super(msg);
	}
	

}

public class EmployeeException {

	public static void main(String[] args) {


	
			try {
				  System.out.println("enter salary");
				  int salary;
				  Scanner s=new Scanner(System.in);
				  salary=s.nextInt();
				   if(salary<30000)
				   {
					throw new SalEx("below 15 yr age  not possible");
				   }
			}
			catch(SalEx e) {
				
				System.out.println( e.getMessage());
				
				
			}
			System.out.println("exception completed");
				
			
			}
				
				
				
			





	}


