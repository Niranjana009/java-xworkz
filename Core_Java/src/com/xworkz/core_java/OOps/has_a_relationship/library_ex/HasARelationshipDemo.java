package com.xworkz.core_java.OOps.has_a_relationship.library_ex;

public class HasARelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		library.student = new Student();
		library.student.Id = "a01";
		library.student.name = "Rajkumar";
		library.student.branch = "EC";
		library.name = "Sharada";
		library.location = "Bengaluru";
		
		System.out.println("Library Name :"+library.name);
		System.out.println("Library Location :"+library.location);
		System.out.println("Student Id: "+library.student.Id);
		System.out.println("Student name: "+library.student.name);
		System.out.println("Student branch: "+library.student.branch);
	}

}
