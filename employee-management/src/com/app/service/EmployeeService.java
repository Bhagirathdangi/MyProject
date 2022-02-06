package com.app.service;

import com.app.entity.Employee;

public class EmployeeService {
	
	public static Employee createEmployee(	 int id, String  fname, String lname, String designation,  int dept_id) {
	   
		Employee emp = new Employee();
		  emp.setId(id);
		   emp.setFname(fname);
		   emp.setLname(lname);
		   emp.setDesignation(designation);
	     emp.setDept_id(dept_id);
		
		return emp;
	}

}
