package com.xworkz.core_java.Typecasting;

public class PrimitiveTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =10;
		short s = b;
		System.out.println("b:"+b);
		System.out.println("s:"+s);
		short s1 = 100;
		//byte b1 = s1; error
		byte b1 = (byte)s1;
		System.out.println("s1:"+s1);
		System.out.println("b1:"+b1);
		
	}

}
