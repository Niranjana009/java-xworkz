package com.xworkz.core_java.strings.stringmethods;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Niranjan";
		System.out.println("String:"+name);
		String up =name.toUpperCase();
		System.out.println("toUpperCase: "+up);
		String surname = "Revankar";
		String concat = name.concat(surname);
		System.out.println("Concated str: "+concat);
		System.out.println("Char name(1): "+name.charAt(1));
		System.out.println("Concated name end with (kar): "+concat.endsWith("kar"));
	}

}
