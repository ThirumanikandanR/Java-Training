package com.example.Training.MultiThreading;

public class EmployeePfCalculation {
	
	private String id;
	private String name;
	private String location;
	private int pfAmount;
	private int fixedSalary;
		
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPfAmount() {
		return pfAmount;
	}
	public void setPfAmount(int pfAmount) {
		this.pfAmount = pfAmount;
	}
	public int getFixedSalary() {
		return fixedSalary;
	}
	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public String toString() {
		return "Employee Salary with PfAmount [id=" + id + ", name=" + name + ", location=" + location + ", pfAmount="
				+ pfAmount + ", fixedSalary=" + fixedSalary + "]";
	}
	
	
	

}
