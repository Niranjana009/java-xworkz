package com.xworkz.core_java.collections.hashSetDtoDaoService.dao;

import com.xworkz.core_java.collections.hashSetDtoDaoService.dto.TrainDto;

public interface TrainDao {
	
	public void save(TrainDto dto);
	TrainDto getTrain(String destination );
	public void updateNameByTime(String nameToUpdate,String time);
	public void deleteSourceByTime(String sourceToDelete,String time);
}
