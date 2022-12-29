package com.example.Training.MapvsFlatMap;

import java.util.List;

public class EmployeeMap {
	
	private String id;
	private String name;
	private int salary;
	private String location;
	private List<String> mobileNum;
	private String panNum;
	
	
	
	
	
	public EmployeeMap(String id, String name, int salary, String location, List<String> mobileNum, String panNum) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
		this.mobileNum = mobileNum;
		this.panNum = panNum;
	}
//	public EmployeeMap(String id2, String name2, int salary2, String location2, List<String> asList, String panNum2) {
//		// TODO Auto-generated constructor stub
//	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(List<String> mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	@Override
	public String toString() {
		return "EmployeeMap [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location
				+ ", mobileNum=" + mobileNum + ", panNum=" + panNum + "]";
	}
	
	
	
	
	

}
