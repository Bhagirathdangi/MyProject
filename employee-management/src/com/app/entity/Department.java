package com.app.entity;

public class Department {
	
	private int id;
   private String name;
   private int parent_dept_id;
   
   
public Department() {
	super();
}


public Department(int id, String name, int parent_dept_id) {
	super();
	this.id = id;
	this.name = name;
	this.parent_dept_id = parent_dept_id;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getParent_dept_id() {
	return parent_dept_id;
}


public void setParent_dept_id(int parent_dept_id) {
	this.parent_dept_id = parent_dept_id;
}


@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", parent_dept_id=" + parent_dept_id + "]";
}
   
   
}
