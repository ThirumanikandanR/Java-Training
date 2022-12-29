package com.example.Training.MapvsFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MapandFlatMap {
	
	public static void main(String[] args) {
		
       List<EmployeeMap> employee = new ArrayList<>();
		
//		employee.add(new EmployeeMap("101","arun",10000,"chennai",Arrays.asList("7890576891","987654110")));
//		employee.add(new EmployeeMap("102","ashok",20000,"chennai",Arrays.asList("7890576891","987654110")));
//		employee.add(new EmployeeMap("103","balu",5000,"pune",Arrays.asList("7890576891","987654110")));
//		employee.add(new EmployeeMap("104","ram",30000,"kochi",Arrays.asList("7890576891","987654110")));
//		employee.add(new EmployeeMap("105","kumar",800000,"chennai",Arrays.asList("7890576891","987654110")));
		
		//map Example
	List<List<String>> map=employee.stream().map(e->e.getMobileNum()).collect(Collectors.toList());
	List<Integer> length=employee.stream().map(map1->map1.getName().length()).collect(Collectors.toList());
	System.out.println(length);
	System.out.println(map);
	
	//flatMap Example
	
	List<String> flatMap=employee.stream().flatMap(f->f.getMobileNum().stream()).collect(Collectors.toList());
	
	System.out.println(flatMap);
	
	
//	Optional<List<EmployeeMap>> optional= Optional.ofNullable(Optional.ofNullable(employee).orElse( ));
	
	
	}
		
	}

