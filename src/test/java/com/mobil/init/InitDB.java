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

		cliente.setNome("Lucas Marques");
		cliente.setEmail("lucasmarquesds@gmail.com");
		
		imovel.setPreco(500);

		try {
			clienteService.adiciona(cliente);
			imovelService.adiciona(imovel);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
