package com.xworkz.core_java.Aptitude_Pgms.Java_Number_Pgms.Reverse_Number_using_recursion;

public class ReverseNumber {
	public static void reverseNumber(int number)   
	{  
	if (number < 10)   
	{  
	//prints the same number if the number is less than 10  
	System.out.println(number);  
	return;  
	}  
	else   
	{  
	System.out.print(number % 10);  
	reverseNumber(number/10);  
	}  
}
}