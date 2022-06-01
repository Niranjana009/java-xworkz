package com.xworkz.core_java.OOps.Polymorphism.overriding.bank_ex;

public class methodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		sbi.intrest();
		hdfc.intrest();
		rbi.intrest();
		
		
		
	}

}
