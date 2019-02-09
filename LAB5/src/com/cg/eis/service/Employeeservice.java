package com.cg.eis.service;
import com.cg.eis.bean.Employee;

public interface Employeeservice {
	public  Employee setDetails(int id,String name,int salary,String des);
	public void insurancescheme(int salary,String designation);
    public void getDetails();
}
