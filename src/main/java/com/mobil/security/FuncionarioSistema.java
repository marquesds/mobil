package com.mobil.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.mobil.model.Funcionario;

public class FuncionarioSistema extends User {

	private static final long serialVersionUID = 1L;

	private Funcionario funcionario;

	public FuncionarioSistema(Funcionario funcionario,
			Collection<? extends GrantedAuthority> authorities) {
		super(funcionario.getEmail(), funcionario.getSenha(), authorities);

		this.funcionario = funcionario;

	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
