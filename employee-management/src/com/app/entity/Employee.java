package com.app.entity;

public class Employee {
	
	private  int id;
	private String  fname;
    private String lname;
    private String designation;
    private int dept_id;
	public Employee() {
		super();
	}
	public Employee(int id, String fname, String lname, String designation, int dept_id) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.designation = designation;
		this.dept_id = dept_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", designation=" + designation
				+ ", dept_id=" + dept_id + "]";
	}
	
	
    
    

}
