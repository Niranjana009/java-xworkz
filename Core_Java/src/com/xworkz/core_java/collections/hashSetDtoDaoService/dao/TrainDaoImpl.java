package com.xworkz.core_java.collections.hashSetDtoDaoService.dao;

import java.util.ArrayList;
import java.util.HashSet;

import com.xworkz.core_java.collections.hashSetDtoDaoService.dto.TrainDto;

public class TrainDaoImpl implements TrainDao {
	
	HashSet<ArrayList>set=new HashSet<ArrayList>();
	ArrayList<TrainDto>train=new ArrayList<TrainDto>();
	

	
	public void save(TrainDto dto) {
		train.add(dto);
		System.out.println("Train added:"+dto);
	
		
	}

	
	public TrainDto getTrain(String destination) {
		for(int i=0;i<train.size();i++) {
			if(train.get(i).getDestination()==destination) {
				return train.get(i);
				
			}
		}
     
		return null;
	}

	
	public void updateNameByTime(String nameToUpdate, String time) {
		for(int i=0;i<train.size();i++) {
		TrainDto dto=train.get(i);
		if(dto.getTime()==time);
		dto.setName(nameToUpdate);
		System.out.println("Updated name :"+train.get(i));
		}
		
	}

	@Override
	public void deleteSourceByTime(String sourceToDelete, String time) {
	for(int i=0;i<train.size();i++) {
		TrainDto dto=train.get(i);
		if(dto.getTime()==time) {
			dto.setSource(sourceToDelete);
			System.out.println("Deleted name :"+ sourceToDelete);
		}
	}
		
	}
}
