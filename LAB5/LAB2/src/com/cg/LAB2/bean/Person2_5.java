package com.cg.LAB2.bean;

enum Gender{
	M,F;
}

class Person2{
	 
	 String F;
	 String L;
	 Gender G;
	 int N;
	
	Person2(String Firstname,String Lastname,Gender g)
	{
		
		 F=Firstname;
		L=Lastname;
		G= g;
	}

	public void getnumber(int n)
	{
		N=n;
	}
	void display()
	{
		
		
		System.out.println("Firstname:"+F);
		System.out.println("Lastname:"+L);
		System.out.println("Gender:"+G);
		System.out.println("phone number:"+N);
	}
	
	
	
	
}
public class Person2_5{

	public static void main(String[] args) {
		Person2 p=new Person2("Ram","Singh",Gender.M);
		p.getnumber(123);
		p.display();

	}

}

