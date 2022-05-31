package com.xworkz.core_java.OOps.Inheritance.hierarchical_inheritance.TataEx;

public class HierarchicalInhertanceTata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tcs tcs = new Tcs();
		TataMotors tatamotors = new TataMotors();
		TataGroups tatagroups = new TataGroups();
		
		tcs.tataSubcidary = "Tata consutany services";
		tatamotors.tataSubcidary = "Tata Motors";
		
		tcs.groups();
		
		System.out.println("Details of Tata groups:");
		
		System.out.println(tcs.tataSubcidary);
		tcs.makeSoftwares();
		System.out.println(tatamotors.tataSubcidary);
		tatamotors.makeAutomobiles();
	
		
	}

}
