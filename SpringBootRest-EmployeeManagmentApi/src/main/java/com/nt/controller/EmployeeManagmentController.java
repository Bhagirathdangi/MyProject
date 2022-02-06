package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Address;
import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.service.AddressServiceInt;
import com.nt.service.DepartmentServiceInt;
import com.nt.service.EmployeeServiceInt;

@RestController
@RequestMapping("/employee")
public class EmployeeManagmentController {

	@Autowired
	private DepartmentServiceInt deptService;
	
	@Autowired
	private EmployeeServiceInt empService;
	
	@Autowired
	private AddressServiceInt addService;
	
	
	@PostMapping("/saveDepartmentData")
	public ResponseEntity<String> saveDataDatabase( @RequestBody Department department){
		ResponseEntity<String> respo = null;
		//System.out.println(student.toString());
		try {
			
			deptService.saveDepartment(department);
			String messege = "Data is Inseted";
			respo = new ResponseEntity<String>(messege,HttpStatus.CREATED);
		}catch(Exception e) {
			respo = new ResponseEntity<String>("Record not Inserterd",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		
		return respo;
	}
	
	
	@PostMapping("/saveEmployeeData")
	public ResponseEntity<String> saveDataDatabase( @RequestBody Employee employee){
		ResponseEntity<String> respo = null;
		
		try {
			
			empService.saveEmployee(employee);
			String messege = "Data is Inseted";
			respo = new ResponseEntity<String>(messege,HttpStatus.CREATED);
		}catch(Exception e) {
			respo = new ResponseEntity<String>("Record not Inserterd",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		
		return respo;
	}
	
	
	@PostMapping("/saveAddressData")
	public ResponseEntity<String> saveDataDatabase( @RequestBody Address address){
		ResponseEntity<String> respo = null;
		
		try {
			
			addService.saveAddress(address);
			String messege = "Data is Inseted";
			respo = new ResponseEntity<String>(messege,HttpStatus.CREATED);
		}catch(Exception e) {
			respo = new ResponseEntity<String>("Record not Inserterd",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		
		return respo;
	}
	
}
