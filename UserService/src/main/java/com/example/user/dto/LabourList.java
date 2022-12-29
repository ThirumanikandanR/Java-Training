package com.example.user.dto;

import java.util.List;

public class LabourList {
	
	private List<LabourRestDto> labour;
	
	

	public LabourList(List<LabourRestDto> labour) {
		
		this.labour = labour;
	}

	public List<LabourRestDto> getLabour() {
		return labour;
	}

	public void setLabour(List<LabourRestDto> labour) {
		this.labour = labour;
	}
	

	
	
    
	
    


}
