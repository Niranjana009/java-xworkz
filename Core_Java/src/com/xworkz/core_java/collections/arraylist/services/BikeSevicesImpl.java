package com.xworkz.core_java.collections.arraylist.services;

import com.xworkz.core_java.collections.arraylist.dao.Bike;
import com.xworkz.core_java.collections.arraylist.dao.BikeImpl;
import com.xworkz.core_java.collections.arraylist.dto.BikeDTO;

public class BikeSevicesImpl implements BikeServices {

	//Bike bike = new BikeImpl();
	Bike bike = new BikeImpl();
	@Override
	public void addBike(BikeDTO dto) {
		// TODO Auto-generated method stub
		bike.addBike(dto);
	}

	@Override
	public BikeDTO getBike(String companyName) {
		// TODO Auto-generated method stub
		return bike.getBike(companyName);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		// TODO Auto-generated method stub
		bike.updateBike(dto);
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		// TODO Auto-generated method stub
		bike.deleteBike(dto);
	}

}
