package com.xworkz.bar.constants;

public enum MysqlProperties {
	URL("jdbc:mysql://Localhost:3306/bars"),
	USERNAME("root"),
	SECRET("Mysql@981");
	
	private String value;
	
	private MysqlProperties(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
