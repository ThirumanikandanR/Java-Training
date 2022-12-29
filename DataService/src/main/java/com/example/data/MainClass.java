package com.example.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(8,7,2,3,5,3,1);
		
		int n=10;
		for(Integer i:list) {
					
//	int list1=list.stream().reduce(0,(c,e)->(c+e)).compareTo(4);
	
		Map<Integer,Integer> values = new HashMap<>();	     
	 list.stream().reduce(i, (a, b) -> {
		
	      if ((a+b)==10 ) {
	    	  values.put(b, a);
	      }
		 
		return a; 
	  });
	System.out.println(values);
	
	}
	}

}
