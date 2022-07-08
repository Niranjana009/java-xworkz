package com.xworkz.core_java.strings.cocncat_of_str;

public class ConcatStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		int num = 10;
		int num2 = 20;
		String concatIntStr = str1+num;
		String concatStrInt = num+str1;
		System.out.println(concatIntStr);
		System.out.println(concatStrInt);
	//String concatIntInt = num+num2;// error
	}

}
