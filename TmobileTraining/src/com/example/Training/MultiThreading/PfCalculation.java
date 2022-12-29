package com.example.Training.MultiThreading;

import java.util.ArrayList;
import java.util.List;

import com.example.Training.Employee;

public class PfCalculation {
	
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("101", "arun", "85000", "chennai"));
		employee.add(new Employee("102", "ashok", "25000", "hyd"));
		employee.add(new Employee("103", "balu", "50000", "pune"));
		employee.add(new Employee("104", "ram", "10000", "kochi"));
		employee.add(new Employee("105", "kumar", "30000", "trivnd"));
		employee.add(new Employee("106", "ramesh", "75000", "chennai"));
		employee.add(new Employee("107", "suresh", "100000", "chennai"));
		employee.add(new Employee("108", "rajesh", "98000", "kolkata"));
		employee.add(new Employee("109", "prabhu", "67000", "kochin"));
		employee.add(new Employee("110", "sugumar", "74000", "chennai"));
		
		List<EmployeePfCalculation> empList=new ArrayList<>();
		for(Employee data:employee) {
			int salary=Integer.parseInt(data.getSalary());
			if(salary<=25000) {
				int pfAmount=salary*5/100;
				int fixedAmount=salary-pfAmount;
				
				EmployeePfCalculation dto= new EmployeePfCalculation();
				dto.setId(data.getId());
				dto.setName(data.getName());
				dto.setLocation(data.getLocation());
				dto.setPfAmount(pfAmount);
				dto.setFixedSalary(fixedAmount);
				
				empList.add(dto);
			}
			else if(salary>25000 && salary<=50000){
				int pfAmount=salary*7/100;
				int fixedAmount=salary-pfAmount;
				
				EmployeePfCalculation dto= new EmployeePfCalculation();
				dto.setId(data.getId());
				dto.setName(data.getName());
				dto.setLocation(data.getLocation());
				dto.setPfAmount(pfAmount);
				dto.setFixedSalary(fixedAmount);
				
				empList.add(dto);
			}
			else if(salary>50000 && salary<=80000){
				int pfAmount=salary*12/100;
				int fixedAmount=salary-pfAmount;
				
				EmployeePfCalculation dto= new EmployeePfCalculation();
				dto.setId(data.getId());
				dto.setName(data.getName());
				dto.setLocation(data.getLocation());
				dto.setPfAmount(pfAmount);
				dto.setFixedSalary(fixedAmount);
				
				empList.add(dto);
			}
			
			else if(salary>=80000){
				int pfAmount=salary*18/100;
				int fixedAmount=salary-pfAmount;
				
				EmployeePfCalculation dto= new EmployeePfCalculation();
				dto.setId(data.getId());
				dto.setName(data.getName());
				dto.setLocation(data.getLocation());
				dto.setPfAmount(pfAmount);
				dto.setFixedSalary(fixedAmount);
				
				empList.add(dto);
			}
			
		}
		System.out.println(empList);
		
	}

}
