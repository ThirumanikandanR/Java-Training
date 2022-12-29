//package com.example.Training.MultiThreading;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import com.example.Training.Employee;
//
//public class EmployeeIdSort {
//	
//	public static void main(String[] args) {
//
//		List<Employee> employee = new ArrayList<>();
//
//		employee.add(new Employee("104", "arun", "85000", "chennai"));
//		employee.add(new Employee("103", "ashok", "25000", "hyd"));
//		employee.add(new Employee("102", "balu", "50000", "pune"));
//		employee.add(new Employee("105", "ram", "10000", "kochi"));
//		employee.add(new Employee("101", "kumar", "30000", "trivnd"));
//		
////		HashMap<String,String> list=employee.stream().map(m->m.get).collect(Collectors.toMap(m->m, ));
//	Map<String, String>list=employee.stream().collect(Collectors.toMap(m->m.getId(), m->m.getName()));
//		
//		for(int i=0;i<employee.size();i++){
//
//		       for(int j=i+1;j<employee.size();j++){
//
//		           Integer tempI=employee[i];
//		           Integer tempJ=employee[j];
//
//		           if(tempI>tempJ){
//		             list[i]=tempJ;
//		             list[j]= tempI;
//
//		           }
//
//		           }
//		       }
//
//		   for(Integer a:list){
//		       System.out.println(""+a);
//		   }
//	
//	}
//
//}
