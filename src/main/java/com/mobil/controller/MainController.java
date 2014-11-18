package com.mobil.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobil.model.Cliente;
import com.mobil.security.ClienteSistema;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(HttpSession session) {
		return "home";
	}

	@RequestMapping("/admin")
	public String admin() {
		ClienteSistema cliente = (ClienteSistema) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		System.out.println("Email: " + cliente.getCliente().getEmail());
		return "/admin/home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
