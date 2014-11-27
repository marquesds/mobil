package com.mobil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobil.model.TipoImovel;

@Controller
public class ImovelController {

	@RequestMapping("/admin/imovel")
	public String adminHome() {
		return "/admin/imovel/home";
	}

	@RequestMapping("/admin/imovel/cadastro")
	public String cadastrar(ModelMap model) {
		model.put("tipoImovel", TipoImovel.values());
		return "/admin/imovel/cadastro-imovel";
	}

	@RequestMapping("/venda")
	public String venda() {
		return "venda";
	}

	@RequestMapping("/locacao")
	public String locacao() {
		return "locacao";
	}

	@RequestMapping("/imoveis-proximos")
	public String imoveisProximos() {
		return "imoveis-proximos";
	}

}
