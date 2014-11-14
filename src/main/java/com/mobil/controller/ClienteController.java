package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

	@RequestMapping("/cliente/cadastro")
	public String cadastrar() {
		return "/cliente/cadastro-cliente";
	}

}
