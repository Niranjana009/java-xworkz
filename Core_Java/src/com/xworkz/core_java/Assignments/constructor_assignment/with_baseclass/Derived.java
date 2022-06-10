package com.xworkz.core_java.Assignments.constructor_assignment.with_baseclass;

public class Derived extends Base {
	Derived()
    {
        System.out.println("No-argument constructor " +
                           "of derived");
    }
 
    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                           "constructor of derived");
    }
}
