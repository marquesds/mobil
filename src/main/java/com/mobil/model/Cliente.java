package com.mobil.model;

import java.util.List;

public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	private List<Imovel> imoveisFavoritos;

	public List<Imovel> getImoveisFavoritos() {
		return imoveisFavoritos;
	}

	public void setImoveisFavoritos(List<Imovel> imoveisFavoritos) {
		this.imoveisFavoritos = imoveisFavoritos;
	}

}
