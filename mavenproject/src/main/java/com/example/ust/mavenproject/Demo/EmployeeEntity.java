package com.example.ust.mavenproject.Demo;

public class EmployeeEntity {

	private String eId;

	private String name;

	private String location;

//	public void seteId(String eId) {
//		this.eId = eId;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
	public EmployeeEntity(String eId, String name, String location) {
		super();
		this.eId = eId;
		this.name = name;
		this.location = location;
	}
	

	public void display() {
		System.out.println("i am in EmployeeEnity display method!!!");
		System.out.println("EmployeeEntity [eId=" + eId + ", name=" + name + ", location=" + location + "]");
	}



}
