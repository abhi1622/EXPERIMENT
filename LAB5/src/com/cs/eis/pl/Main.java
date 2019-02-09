package com.cs.eis.pl;
import java.util.Scanner;
 import com.cg.eis.service.Service;
import com.cg.eis.bean.*;
public class Main {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		
		Service s=new Service();
		
		System.out.println("enter details,Id,Name,Salary and Designation");
		Employee e=s.setDetails(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
		s.insurancescheme(e.getSalary(),e.getDesignation());
		s.getDetails();
	

	}

}
