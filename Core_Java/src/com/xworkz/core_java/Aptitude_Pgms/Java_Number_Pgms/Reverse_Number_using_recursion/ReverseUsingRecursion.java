package com.xworkz.core_java.Aptitude_Pgms.Java_Number_Pgms.Reverse_Number_using_recursion;

import java.util.Scanner;

public class ReverseUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse of the given number is: ");  
		//method calling  
		ReverseNumber reversenum = new ReverseNumber();
		reversenum.reverseNumber(num);
	}

}
