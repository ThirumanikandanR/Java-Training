package com.example.Training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListProgram {
	public static void main(String[] args) {
		
//		List<String> list1=Arrays.asList("saran","Sathish","Ram","naveen","arun");
//		
//		List<String>list2=list1.stream().filter(f->f.toUpperCase().startsWith("S")).collect(Collectors.toList());
//		System.out.println(list2);
//		
//		System.out.println("____________________________________________________________________");
//		for(String s1:list1) {
//			if(s1.toUpperCase().startsWith("S")) {
//				System.out.println(s1);
//			}
//			
//		}
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(101,"Arun");
		map.put(102, "sathish");
		map.put(103, "naveen");
		map.put(104, "Saran");
		
		List<?> list5=map.entrySet().stream().filter(f->f.getValue().toUpperCase().startsWith("S")).collect(Collectors.toList());
		//System.out.println(list5);
		
		map = map.entrySet().stream().filter(f->f.getValue().toUpperCase().startsWith("S")).collect(Collectors.toMap(s->s.getKey(),s->s.getValue()));
		
		System.out.println(map);
	}

}
