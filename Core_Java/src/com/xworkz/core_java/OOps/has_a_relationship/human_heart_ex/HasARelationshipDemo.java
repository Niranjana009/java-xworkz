package com.xworkz.core_java.OOps.has_a_relationship.human_heart_ex;

public class HasARelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Human human = new Human();
			human.heart = new Heart();
			human.heart.heartbitsperminutes = "60 to 100";
			human.heart.location = "Left side";
			human.noofhearts = "One";
			human.color = "Red";
			
			System.out.println("Human have: "+human.noofhearts+" heart");
			System.out.println("Heart color is: "+human.color);
			System.out.println("Which is located in: "+human.heart.location+" of the body");
			System.out.println("Total number of heart bits per minute is: "+human.heart.heartbitsperminutes);
			
}

}
