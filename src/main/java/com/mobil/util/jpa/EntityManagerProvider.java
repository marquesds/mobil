package com.mobil.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

	private static final EntityManagerProvider instance = new EntityManagerProvider();

	private EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("mobil");

	public static synchronized EntityManagerProvider getInstance() {
		return instance;
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
