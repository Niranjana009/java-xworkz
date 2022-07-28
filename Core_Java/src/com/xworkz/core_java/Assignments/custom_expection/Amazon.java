package com.xworkz.core_java.Assignments.custom_expection;

import com.xworkz.core_java.exception.custom_exception.checked.AtmException;

public class Amazon {
	void findItems(int amount) throws AmazonException{
		if (amount<100 || amount>50000 || amount%100 !=0) {
			AmazonException azExp = new AmazonException();
			throw azExp;
		}
		else {
			System.out.println("PLeaase collect the cash");
	}
}
}
