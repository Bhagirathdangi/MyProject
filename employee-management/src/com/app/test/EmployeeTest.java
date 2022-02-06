package com.app.test;

import com.app.entity.Address;
import com.app.entity.Department;
import com.app.entity.Employee;
import com.app.service.AddressService;
import com.app.service.DepartmentService;
import com.app.service.EmployeeService;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Department department1= DepartmentService.createDepartment(10, "CSE", 1);
		
		Address address1 = AddressService.createAddress(101, "ward no-2","ujjain", "465449", "MP", "india",  12);
		
	 Employee employee1 = EmployeeService.createEmployee(101,"Bhagirath", "dangi", "Teacher", department1.getId());
	
	 address1.setEmmp_id(employee1.getId());
	 
		System.out.println(employee1.toString());
		
		System.out.println(department1.toString());
		
		System.out.println(address1.toString());
	}

}
