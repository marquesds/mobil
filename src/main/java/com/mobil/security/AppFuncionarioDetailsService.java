package com.mobil.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mobil.model.Funcionario;
import com.mobil.model.Grupo;
import com.mobil.service.impl.FuncionarioService;

public class AppFuncionarioDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		FuncionarioService funcionarioService = new FuncionarioService();
		Funcionario funcionario = funcionarioService.buscaPorEmail(email);

		FuncionarioSistema user = null;

		if (funcionario != null) {
			user = new FuncionarioSistema(funcionario, getGrupos(funcionario));
		}

		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(
			Funcionario funcionario) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Grupo grupo : funcionario.getGrupos()) {
			authorities.add(new SimpleGrantedAuthority(grupo.getNome()
					.toUpperCase()));
		}

		return authorities;
	}

}
