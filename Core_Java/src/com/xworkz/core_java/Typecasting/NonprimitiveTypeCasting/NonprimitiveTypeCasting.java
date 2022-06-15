package com.xworkz.core_java.Typecasting.NonprimitiveTypeCasting;

public class NonprimitiveTypeCasting {
	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		// upcasting
		
		Animal animal = new Tiger();
		
		//Downcasting
		Tiger tiger = (Tiger) animal;
		System.out.println("Main Ended...");
	}
}
