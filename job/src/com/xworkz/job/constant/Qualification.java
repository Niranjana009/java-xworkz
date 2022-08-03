package com.xworkz.job.constant;

public enum Qualification {

		BE("BE"),
		BCA("BCA"),
		BSC("BSC"),
		DEFAULT("DIPLOMA");
	
	private String education;
	
	private Qualification(String education) {
		this.education = education;
	}
	
	public String getEducation() {
		return education;
	}
	
}
