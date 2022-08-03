package com.xworkz.job.constant;

public enum MySqlProperties {
	URL("jdbc:mysql://Localhost:3306/job"),
	USERNAME("root"),
	SECRET("Mysql@981");
	
	private String value;
	
	private MySqlProperties(String value) {
		// TODO Auto-generated constructor stub
		
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
