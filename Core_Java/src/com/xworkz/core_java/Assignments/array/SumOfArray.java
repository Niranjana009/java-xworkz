package com.xworkz.core_java.Assignments.array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];  
		// arr = {1 ,2,3,4,5};
		int sum = 0;
		
		System.out.println("List of array elements are:");
		for (int i=0; i< arr.length; i++) {
			 arr[i] = i;
			 System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i< arr.length; i++) {
			
			sum = sum+arr[i];
			
		}
		System.out.println("Sum of the array: "+sum);
	}

}


