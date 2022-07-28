package com.xworkz.core_java.exception.custom_exception.checked;

public class AtmException extends Exception {

	@Override
	public String toString() {
		return "you crossed the daily limit";
	}
	
	//@override
	public String getMessage() {
		return "Invalid amount";
	}
	
		
}
