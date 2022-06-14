package com.xworkz.core_java.OOps.abstraction.interface_ex.multiple_inheritance;

public class TaxCalculator implements StateTax, CentralTax{

	@Override
	public void petrol() {
		// TODO Auto-generated method stub
		System.out.println("Petrol");
	}

	@Override
	public void electricity() {
		// TODO Auto-generated method stub
		System.out.println("Electricity");
	}

}
