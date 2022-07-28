package com.xworkz.core_java.collections.arraylist.dao;

import java.util.ArrayList;

import com.xworkz.core_java.collections.arraylist.dto.BikeDTO;

public class BikeImpl implements Bike {
	ArrayList<BikeDTO> bikes = new ArrayList<BikeDTO>();

	
	public void addBike(BikeDTO dto) {
		bikes.add(dto);
		System.out.println("Added Bike is:" + dto);
		
	}

	public BikeDTO getBike(String companyName) {
		//for(Bike bike:bikes) {
		for(int i = 0; i<bikes.size();i++) {
			if(bikes.get(i).getCompanyName() == companyName) {
				System.out.println("The Bike Details are: " + bikes.get(i));
				return bikes.get(i);
			}
		}
		return null;
	}

	
	public void updateBike(BikeDTO dto) {
		int count = 0;
		for(int i = 0; i<bikes.size();i++) {
		if(bikes.get(i).getCompanyName() == dto.getCompanyName()) {
			count++;
			bikes.get(i).setCompanyName(dto.getCompanyName());
			System.out.println("Updated CompanyName is:" + bikes.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Invalid Search Details Entered");
		}
}

	
	public void deleteBike(BikeDTO dto) {
		
		int count = 0;
		for (int i=0; i< bikes.size(); i++) {
			if( bikes.get(i) != null && bikes.get(i).getCompanyName() == dto.getCompanyName()) {
				bikes.remove(i);
					count++;
				}
		
			}	
		if(count > 0) {
			System.out.println("The Mentioned CompanyName and Model Number Bike is " +dto.getCompanyName() +" " + dto.getModelNo() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("Invalid Input");
		}
		
	}
}
