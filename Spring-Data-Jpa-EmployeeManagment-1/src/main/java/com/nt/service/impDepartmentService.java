package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.reposetry.DepartmentRepo;

@Service
public class impDepartmentService implements DepartmentService{

	@Autowired
	private DepartmentRepo deptRepo;
	
	@Override
	public void saveDepartment(Department department) {
		
		deptRepo.save(department);
		
	}

}
