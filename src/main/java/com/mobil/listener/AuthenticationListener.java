package com.mobil.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.mobil.model.Cliente;
import com.mobil.security.ClienteSistema;

public class AuthenticationListener implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		Object usuario = SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();

		if (usuario instanceof ClienteSistema) {
			Cliente cliente = ((ClienteSistema) usuario).getCliente();

			HttpSession session = request.getSession();

			session.setAttribute("usuarioLogado", cliente);
		} else {
			System.out.println("Mutley, faça alguma coisa!!!");
		}

		response.sendRedirect("/mobil/");

	}

}
