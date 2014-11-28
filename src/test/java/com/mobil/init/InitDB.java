package com.mobil.init;

import java.util.ArrayList;
import java.util.List;

import com.mobil.model.Funcionario;
import com.mobil.model.Grupo;
import com.mobil.service.impl.FuncionarioService;
import com.mobil.util.jpa.EntityManagerProvider;

public class InitDB {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		FuncionarioService funcionarioService = new FuncionarioService();

		funcionario.setNome("Lucas Marques");
		funcionario.setEmail("lucasmarquesds@gmail.com");
		funcionario.setSenha("1234");

		Grupo grupo = new Grupo();

		grupo.setNome("admin");
		grupo.setDescricao("Grupo de Administradores do Sistema");

		List<Grupo> grupos = new ArrayList<Grupo>();

		try {
			grupos.add(grupo);
			funcionario.setGrupos(grupos);
			funcionarioService.adiciona(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			EntityManagerProvider.getInstance().close();
		}

	}

}
