package com.xworkz.core_java.collections.arraylist.dao;

import com.xworkz.core_java.collections.arraylist.dto.BikeDTO;

public interface Bike {
	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
