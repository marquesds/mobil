package com.mobil.init;

import com.mobil.model.Cliente;
import com.mobil.model.Imovel;
import com.mobil.service.impl.ClienteService;
import com.mobil.service.impl.ImovelService;

public class InitDB {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteService clienteService = new ClienteService();

		Imovel imovel = new Imovel();
		ImovelService imovelService = new ImovelService();

		// Cliente cliente = clienteService.dao.buscaPorId(2L);

		imovel.setPreco(2500);
		cliente.setNome("Lucas Marques");
		cliente.setEmail("lucasmarquesds@gmail.com");

		try {
			// clienteService.adiciona(cliente);
			// imovelService.adiciona(imovel);
			// clienteService.remove(cliente);
			// clienteService.adicionaFavorito(clienteService.dao.buscaPorId(1L), imovelService.dao.buscaPorId(10L));
			clienteService.removeFavorito(clienteService.dao.buscaPorId(1L), imovelService.dao.buscaPorId(10L));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
