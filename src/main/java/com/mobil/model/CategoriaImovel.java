package com.mobil.model;

public enum CategoriaImovel {

	ALUGUEL("Aluguel"), VENDA("Venda");

	private String value;

	private CategoriaImovel(String theValue) {
		this.value = theValue;
	}

	public String getValue() {
		return this.value;
	}

}
