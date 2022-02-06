package com.nt.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
