package com.xworkz.cartoon.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFutil {
	
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	
	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}
}
