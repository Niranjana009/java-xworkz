package com.xworkz.core_java.exception.custom_exception.checked;

public class AtmMachine {
	void draw(int amount) throws AtmException{
		if (amount<100 || amount>50000 || amount%100 !=0) {
			AtmException atmExp = new AtmException();
			throw atmExp;
		}
		else {
			System.out.println("PLeaase collect the cash");
	}
}
}