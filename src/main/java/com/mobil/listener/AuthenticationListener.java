package com.mobil.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.mobil.model.Grupo;
import com.mobil.model.Usuario;
import com.mobil.security.UsuarioSistema;
import com.mobil.service.impl.ClienteService;
import com.mobil.service.impl.FuncionarioService;

public class AuthenticationListener implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		Object user = SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();

		if (user instanceof UsuarioSistema) {
			Usuario usuario = ((UsuarioSistema) user).getUsuario();

			for (Grupo grupo : usuario.getGrupos()) {
				if (grupo.getNome().toLowerCase().equals("comum")) {
					usuario = new ClienteService().buscaPorEmail(usuario
							.getEmail());
				} else {
					usuario = new FuncionarioService().buscaPorEmail(usuario
							.getEmail());
				}
			}

			HttpSession session = request.getSession();

			session.setAttribute("usuarioLogado", usuario);
		}

		response.sendRedirect("/mobil/");

	}

}
