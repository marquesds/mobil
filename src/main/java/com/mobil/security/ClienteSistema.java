package com.mobil.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.mobil.model.Cliente;

public class ClienteSistema extends User {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;

	public ClienteSistema(Cliente cliente,
			Collection<? extends GrantedAuthority> authorities) {
		super(cliente.getEmail(), cliente.getSenha(), authorities);

		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
