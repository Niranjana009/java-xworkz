package com.xworkz.core_java.Assignments.interface_atm;

public class InterfaceAtmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmCardSlot atmcardslot = new AtmCardSlot();
		HDFC hdfc = new HDFC();
		SBI sbi = new SBI();
		
		atmcardslot.cardslot(hdfc);
	}

}
