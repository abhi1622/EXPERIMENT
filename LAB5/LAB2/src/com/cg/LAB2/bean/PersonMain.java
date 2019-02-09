
package com.cg.LAB2.bean;
 class Person{
	 
	 String F;
	 String L;
	 String G;
	 int N;
	Person(String Firstname,String Lastname,String Gender)
	{
		
		 F=Firstname;
		L=Lastname;
		G= Gender;
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
public class PersonMain {

	public static void main(String[] args) {
		Person p=new Person("Ram","Singh","Male");
		p.getnumber(123);
		p.display();

	}

}
