package com.example.user.dto;

import com.example.data.entity.User;


public class LabourDto {

	private User user;
	
	private Object labour;

	public LabourDto(User user, Object labour) {
		
		this.user = user;
		this.labour = labour;
	}
	public LabourDto() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Object getLabour() {
		return labour;
	}

	public void setLabour(Object labour) {
		this.labour = labour;
	}
	
	
	

	

	

	
	
	
	
}
