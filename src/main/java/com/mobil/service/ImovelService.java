package com.mobil.service;

import javax.persistence.EntityManager;

import com.mobil.dao.DAO;
import com.mobil.model.Imovel;
import com.mobil.util.jpa.EntityManagerProvider;

public class ImovelService {

	private EntityManager manager = EntityManagerProvider.getEntityManager();
	private DAO<Imovel> dao = new DAO<Imovel>(manager);

	public Imovel salva(Imovel imovel) {
		try {
			manager.getTransaction().begin();
			if (imovel.getId() == null) {
				dao.salva(imovel);
			} else {
				dao.altera(imovel);
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
			manager.close();
		} finally {
			manager.close();
		}

		return imovel;
	}
}
