package com.nt.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
