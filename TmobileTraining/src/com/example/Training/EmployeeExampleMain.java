package com.example.Training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//class SortbySalary implements Comparator<Employee>
//{
//    // Used for sorting in ascending order of
//    // roll number
////    public int compare(Employee a, Employee b)
////    {
////        return a.getSalary() - b.getSalary();
////    }
//}



public class EmployeeExampleMain {
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee("101","arun","10000","chennai"));
		employee.add(new Employee("102","ashok","20000","chennai"));
		employee.add(new Employee("103","balu","5000","pune"));
		employee.add(new Employee("104","ram","30000","kochi"));
		employee.add(new Employee("105","kumar","800000","chennai"));
		
//		List<Employee>e1=employee.stream().sorted((o1,o2)->o1.getSalary().compareTo(o2.getSalary())).collect(Collectors.toList());
//		System.out.println(e1);
		
//		Collections.sort(employee, new SortbySalary());
//		  
//        
//        for (int i=0; i<employee.size(); i++)
//            System.out.println(employee.get(i));
		
		
	Map<String,String>e1=	employee.stream().filter(f->f.getLocation().equals("chennai")).collect(Collectors.toMap(s->s.getName(), s->s.getLocation()));
     
	Map<String,String>e2=employee.stream().filter(f->f.getLocation().equals("pune")).collect(Collectors.toMap(s->s.getName(), s->s.getLocation()));
	Map<String,String>e3=employee.stream().filter(f->f.getLocation().equals("kochi")).collect(Collectors.toMap(s->s.getName(), s->s.getLocation()));
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
		
		}

}
