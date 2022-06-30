package com.xworkz.core_java.Assignments.array;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] az = new char[26];  
		char alp = 'A';
		for (int i=0; i< az.length; i++) {
			 az[i] = alp;
			 alp++;
			 System.out.println(az[i]);
			
		}
	}

}
