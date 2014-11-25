package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionarioController {

	@RequestMapping("/admin/funcionario")
	public String adminHome() {
		return "/admin/funcionario/home";
	}

	@RequestMapping("/admin/funcionario/cadastro")
	public String cadastrarFuncionario() {
		return "/admin/funcionario/cadastro-funcionario";
	}

	@RequestMapping("/admin/cliente/cadastro")
	public String cadastrarCliente() {
		return "/admin/cliente/cadastro-cliente";
	}

}
