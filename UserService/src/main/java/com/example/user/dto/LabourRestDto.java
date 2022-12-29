package com.example.user.dto;

public class LabourRestDto {

	private String labId;
	private String labName;
	private String location;
	private String field;
	private String experience;
	private double amountPerDay;
	private int filedNum;
	private String mobileNum;
	
	
	
	
	public LabourRestDto(String labId, String labName, String location, String field, String experience,
			double amountPerDay, int filedNum, String mobileNum) {
		
		this.labId = labId;
		this.labName = labName;
		this.location = location;
		this.field = field;
		this.experience = experience;
		this.amountPerDay = amountPerDay;
		this.filedNum = filedNum;
		this.mobileNum = mobileNum;
	}

	public String getLabName() {
		return labName;
	}
	
	public String getLabId() {
		return labId;
	}

	public void setLabId(String labId) {
		this.labId = labId;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getAmountPerDay() {
		return amountPerDay;
	}
	public void setAmountPerDay(double amountPerDay) {
		this.amountPerDay = amountPerDay;
	}
	public int getFiledNum() {
		return filedNum;
	}
	public void setFiledNum(int filedNum) {
		this.filedNum = filedNum;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "LabourRestDto [labId=" + labId + ", labName=" + labName + ", location=" + location + ", field=" + field
				+ ", experience=" + experience + ", amountPerDay=" + amountPerDay + ", filedNum=" + filedNum
				+ ", mobileNum=" + mobileNum + "]";
	}

	
	
	
}
