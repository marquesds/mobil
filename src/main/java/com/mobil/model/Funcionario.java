package com.mobil.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Usuario {

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
