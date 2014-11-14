package com.mobil.service.impl;

import com.mobil.dao.DAO;
import com.mobil.model.Cliente;
import com.mobil.model.Imovel;
import com.mobil.service.IService;

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

	public void adicionaFavorito(Long clienteId, Imovel imovel) {
		Cliente cliente = dao.buscaPorId(clienteId);
		cliente.getImoveisFavoritos().add(imovel);
		try {
			dao.atualiza(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void removeFavorito(Long clienteId, Long imovelId) {
		Cliente cliente = dao.buscaPorId(clienteId);
		ImovelService imovelService = new ImovelService();
		Imovel imovel = imovelService.dao.buscaPorId(imovelId);
		
		System.out.println(cliente.getId());
		System.out.println(imovel.getId());

		cliente.getImoveisFavoritos().remove(imovel);
		
		System.out.println(cliente.getImoveisFavoritos());
		
		try {
			dao.atualiza(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
