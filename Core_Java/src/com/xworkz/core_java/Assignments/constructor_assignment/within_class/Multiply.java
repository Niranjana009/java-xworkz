package com.xworkz.core_java.Assignments.constructor_assignment.within_class;

public class Multiply {
	Multiply()
    {
        System.out.println("default");
    }
 
    // parameterized constructor 2
	Multiply(int x)
    {
        // invokes default constructor
        this();
        System.out.println(x);
    }
 
    // parameterized constructor 3
	Multiply(int x, int y)
    {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }
}
