package com.xworkz.freedowfighters.dao;

import java.util.List;

import com.xworkz.freedomfighters.entity.FreedomFighterEntity;

public interface FreedomFighterDAO {
	//public Boolean insert(List<FreedomFighterEntity> entity);
	
	default  Boolean save(List<FreedomFighterEntity> entity) {
		return false;
		
	}
}
