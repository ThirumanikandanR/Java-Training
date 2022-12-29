package com.example.ust.mavenproject.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
//		Employee e1=(Employee) context.getBean("person");
//		e1.experience();
//		e1.name();
//		
		System.out.println("***************************************");
		
		EmployeeEntity EmployeeEntity=  (EmployeeEntity) context.getBean("employeeDetailsConstructor");
		EmployeeEntity.display();
	}

}
