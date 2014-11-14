package com.mobil.service.impl;

import javax.persistence.EntityManager;

import com.mobil.dao.DAO;
import com.mobil.model.Imovel;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ImovelService implements IService<Imovel> {

	private EntityManager manager = EntityManagerProvider.getInstance()
			.getEntityManager();
	private DAO<Imovel> dao = new DAO<Imovel>(Imovel.class);

	@Override
	public Imovel adiciona(Imovel imovel) {
		try {
			manager.getTransaction().begin();
			if (imovel.getId() == null) {
				dao.adiciona(imovel);
				imovel = new Imovel();
			} else {
				dao.atualiza(imovel);
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

		return imovel;
	}

	@Override
	public void remove(Imovel entidade) {
	}

}
