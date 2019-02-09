package com.cg.eis.service;

import com.cg.eis.bean.*;
import com.cg.eis.service.Employeeservice;

public class Service implements Employeeservice {
	Employee e;
	
	@Override

	public Employee setDetails(int id, String name, int salary, String des) {
		e=new Employee(id,name,salary,des);
		return e;
	}

	@Override
	public void insurancescheme(int salary, String designation) {
		if(designation.equals("System Associate")&&(salary>5000 && salary<20000))
	            e.setInsuranceScheme("C");
		
		else if(designation.equals("Programmer")&&(salary>=20000 && salary<40000))
	             e.setInsuranceScheme("B");
		else if(designation.equals("Manager")&&(salary>=40000))
	             e.setInsuranceScheme("A");
		else if(designation.equals("Clerk")&&(salary<5000))
	            e.setInsuranceScheme("No");
	}
	
public void getDetails() {
		
		System.out.println("employee id is"+e.getId()+"\n name is"+e.getName()+e.getDesignation()+e.getInsuranceScheme());
		
	}

}



