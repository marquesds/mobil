package com.mobil.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.mobil.dao.DAO;
import com.mobil.model.Imovel;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ImovelService implements IService<Imovel> {

	private EntityManager manager = EntityManagerProvider.getEntityManager();
	private DAO<Imovel> dao = new DAO<Imovel>(Imovel.class);

	@Override
	public Imovel salva(Imovel imovel) {
		try {
			manager.getTransaction().begin();
			if (imovel.getId() == null) {
				dao.adiciona(imovel);
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
		// TODO Auto-generated method stub

	}

	@Override
	public List<Imovel> listaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
