package com.xworkz.core_java.exception.custom_exception;

public class AtmMachine {

	void draw(int amount) throws AtmException {
		if(amount < 100 || amount > 50000 || amount%100 != 0) {
			AtmException atmExp = new AtmException();
			throw atmExp;
		}
	}
}
