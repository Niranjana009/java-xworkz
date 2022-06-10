package com.xworkz.core_java.Constructor.constructor_chaining;

public class Tiger {
	String name;
	String color;
	String gender;
	
	Tiger(){
		this("Leo","White","Female");
	}
	
	Tiger(String name, String clr ){
		this.name = name;
		this.color = clr;
		System.out.println("Hello tiger had dinner");
	}
	
	Tiger(String name, String clr, String gender){
		this("Rio","Orange");
	}
	
	
	
	
	
}
