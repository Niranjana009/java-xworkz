package com.xworkz.core_java.collections.arraylist.services;

import com.xworkz.core_java.collections.arraylist.dto.BikeDTO;

public interface BikeServices {
	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
