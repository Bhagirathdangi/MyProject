package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.reposetry.EmployeeRepo;

@Service
public class impEmployeeService implements EmployeeService{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public void saveEmployee(Employee employee) {


		empRepo.save(employee);
		
	}

}
