package com.xworkz.freedomfighters;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighters.entity.FreedomFighterEntity;
import com.xworkz.freedowfighters.dao.FreedomFighterDAO;
import com.xworkz.freedowfighters.dao.FreedomFightersDAOImpl;

public class FfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreedomFighterEntity entity = new FreedomFighterEntity(1,"BhagatSingh",LocalDateTime.now(),"Mumbai","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFighterEntity entity1 = new FreedomFighterEntity(2,"Lal Bhadhur Shastri",LocalDateTime.now(),"Bihar","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFighterEntity entity2 = new FreedomFighterEntity(3,"Rani-Chanamma",LocalDateTime.now(),"Kittur","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now()); 
		
		List<FreedomFighterEntity> list = new ArrayList<FreedomFighterEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		FreedomFighterDAO dao = new FreedomFightersDAOImpl(); 
		
		boolean save = dao.save(list);
		System.out.println(save);
	}

}
