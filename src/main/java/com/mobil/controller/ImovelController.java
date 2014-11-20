package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ImovelController {

	@RequestMapping("/admin/imovel/cadastro")
	public String cadastrar() {
		return "/admin/imovel/cadastro-imovel";
	}

	@RequestMapping("/venda")
	public String venda() {
		return "venda";
	}
	
}
