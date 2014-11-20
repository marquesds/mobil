package com.mobil.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mobil.model.Grupo;
import com.mobil.model.Usuario;
import com.mobil.service.impl.UsuarioService;

public class UsuarioDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {

		UsuarioService usuarioService = new UsuarioService();
		Usuario usuario = usuarioService.buscaPorEmail(email);

		UsuarioSistema user = null;

		if (usuario != null) {
			user = new UsuarioSistema(usuario, getGrupos(usuario));
		}

		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(Usuario usuario) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Grupo grupo : usuario.getGrupos()) {
			authorities.add(new SimpleGrantedAuthority(grupo.getNome()
					.toUpperCase()));
		}

		return authorities;
	}

}
