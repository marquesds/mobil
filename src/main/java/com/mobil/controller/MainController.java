package com.mobil.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(HttpSession session) {
		return "home";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "/admin/home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
