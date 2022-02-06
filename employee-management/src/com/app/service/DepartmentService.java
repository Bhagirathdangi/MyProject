package com.app.service;

import com.app.entity.Department;

public class DepartmentService {

	public static Department createDepartment(int id, String name, int parent_dept_id) {

		Department dept=new Department();
		dept.setId(id);
       dept.setName(name);
       dept.setParent_dept_id(parent_dept_id);
		return dept;
	}
}
