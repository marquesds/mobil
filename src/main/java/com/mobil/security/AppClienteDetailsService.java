package com.mobil.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mobil.model.Cliente;
import com.mobil.model.Grupo;
import com.mobil.service.impl.ClienteService;

public class AppClienteDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		ClienteService clienteService = new ClienteService();
		Cliente cliente = clienteService.buscaPorEmail(email);

		ClienteSistema user = null;

		if (cliente != null) {
			user = new ClienteSistema(cliente, getGrupos(cliente));
		}

		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(Cliente cliente) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Grupo grupo : cliente.getGrupos()) {
			authorities.add(new SimpleGrantedAuthority(grupo.getNome()
					.toUpperCase()));
		}

		return authorities;
	}
}
