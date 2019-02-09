package com.cg.LAB2.bean;

public class mainclass {

	public static void main(String[] args) {
		student s1=new student(12,"ram",45.98f);
		/*
		s1.setStudrollno(07);
		s1.setStudmarks(78.00f);
		s1.setStudname("ram");
		*/
		System.out.println("Student roll is"+s1.getStudrollno());
		System.out.println(s1.getStudmarks());
		System.out.println(s1.getStudname());
     
        
	}

}
