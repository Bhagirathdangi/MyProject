package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.repositry.DepartmentRepo;
@Service
public class DepartmentService implements DepartmentServiceInt {

	@Autowired
	private DepartmentRepo deptRepo;
	
	@Override
	public void saveDepartment(Department department) {
		
		deptRepo.save(department);
		
	}

}
