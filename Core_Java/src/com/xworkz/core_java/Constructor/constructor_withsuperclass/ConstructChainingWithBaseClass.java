package com.xworkz.core_java.Constructor.constructor_withsuperclass;

public class ConstructChainingWithBaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TataMotors tatamotors = new TataMotors("Niranjan");
		TataMotors tatamotors = new TataMotors();
		TataGroups tatagroups = new TataGroups();
		System.out.println("Chairman: "+tatamotors.chairman);
		System.out.println("Wealth: "+tatamotors.wealth);
	}

}
