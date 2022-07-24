package com.xworkz.core_java.collections.hashSetDtoDaoService.service;

import com.xworkz.core_java.collections.hashSetDtoDaoService.dao.TrainDao;
import com.xworkz.core_java.collections.hashSetDtoDaoService.dao.TrainDaoImpl;
import com.xworkz.core_java.collections.hashSetDtoDaoService.dto.TrainDto;

public class TrainServiceImpl implements TrainService{
	TrainDao dao=new TrainDaoImpl();

	
	public void save(TrainDto dto) {
		if(dto!=null) {
			long trainNumber=dto.getTrainNumber();
			if(trainNumber>0) {
				this.dao.save(dto);
				
			}
			else {
				System.out.println("Train details not saved");
			}
		}
		
	}

	
	public TrainDto getTrain(String destination) {
		return dao.getTrain(destination);
	}

	
	public void updateNameByTime(String nameToUpdate, String time) {
		if(nameToUpdate!=null && nameToUpdate.length()>3 && nameToUpdate.length()<30) {
			this.dao.updateNameByTime(nameToUpdate, time);
		}
		else {
			System.out.println("Entered invalid upated name");
		}
		
	}


	public void deleteSourceByTime(String sourceToDelete, String time) {
		if(sourceToDelete!=null && sourceToDelete.length() >3&& sourceToDelete.length()<30) {
			this.dao.deleteSourceByTime(sourceToDelete, time);
		}
		else {
			System.out.println("Entered invalid upated name");
		}
		
		
	}
}