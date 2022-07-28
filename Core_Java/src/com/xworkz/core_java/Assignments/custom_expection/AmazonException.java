package com.xworkz.core_java.Assignments.custom_expection;

public class AmazonException extends RunException {
	@Override
	public String toString() {
		return "you crossed the daily limit";
	}
	
	//@override
	public String getMessage() {
		return "Invalid amount";
	}
	
}
