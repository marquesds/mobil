package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionarioController {

	@RequestMapping("/admin/funcionario/cadastro")
	public String cadastrar() {
		return "/admin/funcionario/cadastro-funcionario";
	}
	
}
