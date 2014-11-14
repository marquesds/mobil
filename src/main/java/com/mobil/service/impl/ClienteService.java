package com.mobil.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mobil.dao.DAO;
import com.mobil.model.Cliente;
import com.mobil.model.Imovel;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ClienteService implements IService<Cliente> {

	private EntityManager manager = EntityManagerProvider.getEntityManager();
	private DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);

	@Override
	public Cliente salva(Cliente cliente) {
		try {
			manager.getTransaction().begin();
			if (cliente.getId() == null) {
				dao.adiciona(cliente);
			} else {
				dao.atualiza(cliente);
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
	@SuppressWarnings("unchecked")
	public List<Cliente> listaTodos() {
		Query query = this.manager.createQuery("select x from cliente x");
		return query.getResultList();
	}

	public Cliente buscaPorId(Long id) {
		return manager.find(Cliente.class, id);
	}
	
	public Cliente adicionaFavorito(Long clienteId, Imovel imovel) {
		Cliente cliente = buscaPorId(clienteId);
		cliente.getImoveisFavoritos().add(imovel);
		try {
			manager.getTransaction().begin();
			dao.atualiza(cliente);
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			manager.close();
		}

		return cliente;
	}

}
