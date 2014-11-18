package com.mobil.init;

import java.util.ArrayList;
import java.util.List;

import com.mobil.model.Cliente;
import com.mobil.model.Funcionario;
import com.mobil.model.Grupo;
import com.mobil.model.Imovel;
import com.mobil.service.impl.ClienteService;
import com.mobil.service.impl.FuncionarioService;
import com.mobil.service.impl.GrupoService;
import com.mobil.service.impl.ImovelService;

public class InitDB {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteService clienteService = new ClienteService();

		Funcionario funcionario = new Funcionario();
		FuncionarioService funcionarioService = new FuncionarioService();

		Imovel imovel = new Imovel();
		ImovelService imovelService = new ImovelService();

		Grupo grupo = new Grupo();
		GrupoService grupoService = new GrupoService();

		// Cliente cliente = clienteService.dao.buscaPorId(2L);

		imovel.setPreco(2500);
		cliente.setNome("Lucas Marques");
		cliente.setEmail("lucasmarquesds@gmail.com");

		funcionario.setNome("João Marcos da Silva");
		funcionario.setEmail("jmarcos@gmail.com");

		grupo.setNome("vendedor");
		grupo.setDescricao("Grupo de Vendedores do Sistema");

		List<Grupo> grupos = new ArrayList<Grupo>();

		try {
			grupoService.adiciona(grupo);
			grupos.add(grupo);
			funcionario.setGrupos(grupos);
			funcionarioService.adiciona(funcionario);
			// clienteService.adiciona(cliente);
			// imovelService.adiciona(imovel);
			// clienteService.remove(cliente);
			// clienteService.adicionaImovelFavorito(clienteService.dao.buscaPorId(1L),
			// imovelService.dao.buscaPorId(10L));
			// clienteService.removeImovelFavorito(clienteService.dao.buscaPorId(1L),
			// imovelService.dao.buscaPorId(10L));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
