package com.xworkz.freedowfighters.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.freedomfighters.entity.FreedomFighterEntity;
import com.xworkz.freedomfighters.util.FactoryDetails;

public class FreedomFightersDAOImpl implements FreedomFighterDAO {

	EntityManagerFactory factory = FactoryDetails.getDetails();
	
	@Override
	public Boolean save(List<FreedomFighterEntity> entity) {
		EntityManager manager = null;
		
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for(FreedomFighterEntity freedomFighterEntity: entity) {
				manager.persist(freedomFighterEntity);
			}
				tx.commit();
		}
		catch(PersistenceException p){
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

}
