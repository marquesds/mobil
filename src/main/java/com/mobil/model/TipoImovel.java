package com.mobil.model;

public enum TipoImovel {
	CASA("Casa"), APARTAMENTO("Apartamento"), SALAO("Salão");

	private String value;

	private TipoImovel(String theValue) {
		this.value = theValue;
	}

	public String getValue() {
		return this.value;
	}
}
