package com.mobil.service.impl;

import java.util.List;

import javax.persistence.NoResultException;

import com.mobil.dao.DAO;
import com.mobil.model.Cliente;
import com.mobil.model.Imovel;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ClienteService implements IService<Cliente> {

	public DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);

	@Override
	public void adiciona(Cliente cliente) {
		try {
			if (cliente.getId() == null) {
				dao.adiciona(cliente);
				cliente = new Cliente();
			} else {
				dao.atualiza(cliente);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Cliente cliente) {
		try {
			if (cliente.getId() != null) {
				dao.remove(cliente);
			} else {
				throw new Exception();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void adicionaImovelFavorito(Cliente cliente, Imovel imovel) {
		cliente.getImoveisFavoritos().add(imovel);

		try {
			dao.atualiza(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void removeImovelFavorito(Cliente cliente, Imovel imovel) {

		List<Imovel> imoveis = cliente.getImoveisFavoritos();

		for (Imovel i : imoveis) {
			if (i.getId() == imovel.getId()) {
				imovel = i;
			}
		}

		cliente.getImoveisFavoritos().remove(imovel);

		try {
			dao.atualiza(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Cliente buscaPorEmail(String email) {
		Cliente cliente = null;

		try {
			cliente = EntityManagerProvider
					.getInstance()
					.getEntityManager()
					.createQuery("from Cliente where lower(email) = :email",
							Cliente.class)
					.setParameter("email", email.toLowerCase())
					.getSingleResult();
		} catch (NoResultException ex) {
			ex.printStackTrace();
		}

		return cliente;
	}

}
