package com.xworkz.core_java.OOps.Inheritance.hierarchical_inheritance.EngineeringEx;

public class HierarchicalInheritanceDemo {
    
	public static void main(String[] args) {
		
		Engineering engineering = new Engineering();
		ComputerScienceEngineering cse = new ComputerScienceEngineering();
		CivilEngineering cv = new CivilEngineering();
		MechanicalEngineering me = new MechanicalEngineering();
		
		cse.branchName = "ComputerScience";
		cse.university = "VTU";
		cv.branchName = "Civil";
		cv.university = "VTU";
		me.branchName = "Mechanical";
		me.university = "VTU";
		
		System.out.println("Details Of Enginerring Brnaches :");
		System.out.println("Branch Name : " +cse.branchName);
		System.out.println("University : " + cse.university);
		System.out.println("Function :");		
          cse.developSoftware();
  		System.out.println("Branch Name : " +cv.branchName);
  		System.out.println("University : " + cv.university);
  		System.out.println("Function :");		
            cv.construction();
      		System.out.println("Branch Name : " +me.branchName);
      		System.out.println("University : " + me.university);
      		System.out.println("Function :");		
                me.assembleMachines();


		
	}
}
