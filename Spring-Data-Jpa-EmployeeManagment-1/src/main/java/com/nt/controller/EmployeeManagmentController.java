package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.entity.Address;
import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.service.AddressService;
import com.nt.service.DepartmentService;
import com.nt.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeManagmentController {

	@Autowired
	private AddressService addService;
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/reqEmployeePage")
	public String saveEmployeeData() {
		
		return "employeePage";
	}
	
	@PostMapping("/empSaveData")
	public String saveDataInEmployeeTable(@ModelAttribute("employee")Employee employee) {
		
		empService.saveEmployee(employee);
		
		return "empSaveData";
	}
	
	@GetMapping("/reqDepartmentPage")
	public String saveDepartmentData() {
		return "DepartmentPage";
	}
	
	@PostMapping("/deptSevaData")
public String saveDataInDepartmentTable(@ModelAttribute("department")Department department) {
		
		deptService.saveDepartment(department);
		
		return "deptSaveData";
	}
	
	
	@GetMapping("/reqAddressPage")
	public String saveAddressData() {
		return "addressPage";
	}
	
	@PostMapping("/addSaveData")
	public String saveDataAddressTable(@ModelAttribute("address")Address address) {
		
		 addService.saveAddrerss(address);
		 return "addSaveData";
	}
}
