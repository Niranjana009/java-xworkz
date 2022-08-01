package com.xworkz.bar.constants;

public enum BarType {
		WINE_STORE("wine store"), 
		MSIL("msil"),
		BAR_RESTAURANT("Bar Restaurant"),
		RESORT("resort"),
		DEFALUT("Bar Restaurant");
	
	private String name;
	
	private BarType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
