package com.example.Training.MultiThreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.Training.Employee;

public class SumofSalary {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("101", "arun", "10000", "chennai"));
		employee.add(new Employee("102", "ashok", "10000", "chennai"));
		employee.add(new Employee("103", "balu", "5000", "pune"));
		employee.add(new Employee("104", "ram", "5000", "kochi"));
		employee.add(new Employee("105", "kumar", "10000", "chennai"));


		 HashMap<String, Integer> map = new HashMap<>();
//		List<String> dummy=employee.stream().map(m->m.getSalary()).collect(Collectors.toList());
		Map<Employee, String> finalcheck=employee.stream()
				.collect(Collectors.toMap(m->m, m->m.getSalary()));

	        for (Entry<Employee, String> t : finalcheck.entrySet()) {
	            if (map.containsKey(t.getValue())) {
	                map.put(t.getValue(), map.get(t.getValue()) + 1);

	            } else {
	                map.put(t.getValue(), 1);
	            }
	        }
	        System.out.println(map);
	        
	        Set<String> keys = map.keySet();
//	        finalcheck.entrySet().stream().map(m->m.getValue().getClass()
	        System.out.println(keys);
	        for (String key : keys) {
	          Integer count=  map.get(key);
	          Integer Amountvalue=Integer.parseInt(key);
	           Integer finalAmount= Amountvalue*(count);
	           System.out.println("FINAL AMOUNT"+finalAmount);
	            
	        }
		


	}

}
