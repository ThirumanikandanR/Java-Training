package com.example.ust.mavenproject.Demo;

public class Employee implements Person{

	@Override
	public void name() {
		System.out.println("i am in employee name method");
		
	}

	@Override
	public void experience() {
		
		System.out.println("i am in employee expereince method");
	}
	

}
