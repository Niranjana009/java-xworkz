package com.xworkz.core_java.Assignments.array.lipstick;

public class LipstickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lipstick lakme = new Lipstick("Lakme", "black", 100);
		Lipstick mac = new Lipstick("Mac", "pink", 5);
		Lipstick myglamm = new Lipstick("myglamm", "green", 100);
		Lipstick sugar = new Lipstick("sugar", "green", 100);
		Lipstick maybelive = new Lipstick("maybelive", "green", 100);
		
		Lipstick[] lipsticks = {lakme, mac, myglamm, sugar, maybelive};
		
		for(int i=0; i<lipsticks.length; i++) {
			
			if(lipsticks[i].price<10.00) 
			System.out.println(lipsticks[i]);
		}
		
	
	}

}
