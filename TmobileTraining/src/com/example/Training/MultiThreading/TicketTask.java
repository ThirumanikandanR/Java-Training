package com.example.Training.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TicketTask {
	public static void main(String[] args) {
		
		List<Passanger> passanger= new ArrayList<>();
		passanger.add(new Passanger(101,"Arun","chennai","kochin",500));
		passanger.add(new Passanger(102,"Arun","hyd","pune",200));
		passanger.add(new Passanger(103,"Arun","chennai","bangalore",400));
		passanger.add(new Passanger(104,"Arun","chennai","kolkata",800));
		passanger.add(new Passanger(105,"Arun","mysore","bangalore",100));
		
	List<PassangerDao> ticketDetails=	passanger.stream().map(m->{
		
		PassangerDao pasangerDao= new PassangerDao();
		
		int perKm=5;
		
		pasangerDao.setpId(m.getpId());
		pasangerDao.setpName(m.getpName());
		pasangerDao.setSource(m.getSource());
		pasangerDao.setDestination(m.getDestination());
		pasangerDao.setKm(m.getKm());
		pasangerDao.setAmount(m.getKm()*perKm);
		
		return pasangerDao;
			
		}).collect(Collectors.toList());
	
	System.out.println(ticketDetails);
		
	}
	
	

}
