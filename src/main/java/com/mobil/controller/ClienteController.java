package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobil.model.Cliente;
import com.mobil.service.impl.ClienteService;

@Controller
public class ClienteController {

	@RequestMapping("/admin/cliente")
	public String adminHome() {
		return "/admin/cliente/home";
	}

	@RequestMapping("/cadastro")
	public String cadastro() {
		return "/cliente/cadastro-cliente";
	}

	@RequestMapping("/adicionaCliente")
	public String cadastrarCliente(Cliente cliente) {
		ClienteService cs = new ClienteService();
		cs.adiciona(cliente);
		return "redirect:login";
	}
}
