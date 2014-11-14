package com.mobil.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.mobil.dao.DAO;
import com.mobil.model.Cliente;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ClienteService implements IService<Cliente> {

	private EntityManager manager = EntityManagerProvider.getEntityManager();
	private DAO<Cliente> dao = new DAO<Cliente>(manager);

	@Override
	public Cliente salva(Cliente cliente) {
		try {
			manager.getTransaction().begin();
			if (cliente.getId() == null) {
				dao.salva(cliente);
			} else {
				dao.altera(cliente);
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

		return cliente;
	}

	@Override
	public void remove(Cliente cliente) {
		try {
			manager.getTransaction().begin();
			if (cliente.getId() != null) {
				dao.remove(cliente);
			} else {
				throw new Exception();
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}

	@Override
	public List<Cliente> buscaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
