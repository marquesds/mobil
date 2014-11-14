package com.mobil.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("mobil");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public static void close(EntityManager em) {
		em.close();
		emf.close();
	}

}
