package com.mobil.model;

public class Funcionario extends Usuario {

	private static final long serialVersionUID = 1L;

	private TipoFuncionario tipo;
	private Endereco endereco;

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionario tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
