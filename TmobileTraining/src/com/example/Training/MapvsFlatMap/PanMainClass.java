package com.example.Training.MapvsFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PanMainClass {
	
	public static void main(String[] args) {
		
		List<EmployeeMap> employee = new ArrayList<>();
		
		employee.add(new EmployeeMap("101","arun",10000,"chennai",Arrays.asList("7890576891","987654110"),"ABCDE1234Z"));
		employee.add(new EmployeeMap("102","ashok",20000,"chennai",Arrays.asList("7890576891","987654110"),"ABCDE1235Y"));
		employee.add(new EmployeeMap("103","balu",5000,"pune",Arrays.asList("7890576891","987654110"),"gaajh5678"));
		employee.add(new EmployeeMap("104","ram",30000,"kochi",Arrays.asList("7890576891","987654110"),"gthddjjdhc788"));
		employee.add(new EmployeeMap("105","kumar",800000,"chennai",Arrays.asList("7890576891","987654110"),"ujherfuhdhf986"));
		
		 
		
//		Map<String,String> validation = employee.stream().filter(m ->m.getPanNum().length()==10).map(m->{
//			
//		String Alpha = m.getPanNum().substring(0,4);
//		String numeric = m.getPanNum().substring(5,8);
//		String lstAlpha=m.getPanNum().substring(9);
//			char[] alphaVal=Alpha.toCharArray();
//			char[] numericvVal=numeric.toCharArray();
//			char[] lastAlpha=lstAlpha.toCharArray();
//			
//			for(char alphacharact:alphaVal) {
//				if (!Character.isUpperCase(alphacharact)) {
////					return new Pair<String,String>(m.getId(),"Invalid Pan");
//				}
//				
//			}
//			
//			for(char numericCharcact:numericvVal) {
//				if(!Character.isDigit(numericCharcact)) {
////					return new Pair<String,String>(m.getId(),"Invalid Pan");
//				}
//			}
//			for(char last:lastAlpha) {
//			if(!Character.isUpperCase(last)) {
////				return new Pair<String,String>(m.getId(),"Invalid Pan");
//			}
//			}
//				
//		
////			return new Pair<String,String>(m.getId(),"Invalid Pan");
//			
//			
//		}).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
			

	}

	
}
