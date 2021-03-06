package com.mobil.service.impl;

import java.util.List;

import javax.persistence.NoResultException;

import com.mobil.dao.DAO;
import com.mobil.model.Cliente;
import com.mobil.model.Grupo;
import com.mobil.model.Imovel;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class ClienteService implements IService<Cliente> {

	public DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);

	@Override
	public void adiciona(Cliente cliente) {
		try {
			if (cliente.getId() == null) {
				// Adicionando um grupo default ao cliente
				GrupoService grupoService = new GrupoService();
				Grupo grupo = grupoService.getDao().buscaPorNome("comum");
				if (grupo.getId() == null) {
					grupo = new Grupo();
					grupo.setNome("comum");
					grupo.setDescricao("Grupo de Usuários Comuns do Sistema (Clientes)");
				}
				cliente.getGrupos().add(grupo);
				// Salvando o cliente
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
		imovel.addObserver(cliente);

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
		imovel.deleteObserver(cliente);

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
