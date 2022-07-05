package com.xworkz.core_java.Assignments.array;

public class PrintEvenOddEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6]; 
		System.out.println("Given Array elements are:");
		for (int i=0; i< arr.length; i++) {
			 arr[i] = i;
			 System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		System.out.println("Even index of elements are:");
		for (int i=0; i< arr.length; i++) {
			
			if (i%2 == 0) {
			 arr[i] = i;
			 System.out.print(" "+arr[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Odd index of elements are:");
		for (int i=0; i< arr.length; i++) {
			
			if (i%2 != 0) {
			 arr[i] = i;
			 System.out.print(" "+arr[i]+" ");
			}
		}
		System.out.println();
		
		
	}

}
