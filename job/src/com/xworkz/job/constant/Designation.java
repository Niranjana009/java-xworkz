package com.xworkz.job.constant;

public enum Designation {
	SYSTEMENGINEER("SoftwareDeveloper"),
	TECHNICALSUPPORTENGINEER("TechnicalSupportEngineer"),
	NETWORKENGINEER("NetworkEngineer"),
	DEFAULT("NA");
	
	private String desigation;
	
	private Designation(String desigation) {
		this.desigation = desigation;
	}
	
	public String getDesigation() {
		return desigation;
	}
}
