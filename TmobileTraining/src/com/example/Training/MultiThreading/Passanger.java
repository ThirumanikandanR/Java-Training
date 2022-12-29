package com.example.Training.MultiThreading;

public class Passanger {
	
	private int pId;
	
	private String pName;
	
	private String source;
	
	private String destination;
	
	private int km;

	public Passanger(int pId, String pName, String source, String destination, int km) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.source = source;
		this.destination = destination;
		this.km = km;
	}

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

	@Override
	public String toString() {
		return "Passanger [pId=" + pId + ", pName=" + pName + ", source=" + source + ", destination=" + destination
				+ ", km=" + km + "]";
	}
	
	
	

}
