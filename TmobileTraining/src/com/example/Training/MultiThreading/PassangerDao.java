package com.example.Training.MultiThreading;

public class PassangerDao {
	
private int pId;
	
	private String pName;
	
	private String source;
	
	private String destination;
	
	private int km;
	
	private int amount;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PassangerDao [pId=" + pId + ", pName=" + pName + ", source=" + source + ", destination=" + destination
				+ ", km=" + km + ", amount=" + amount + "]";
	}
	
	

}
