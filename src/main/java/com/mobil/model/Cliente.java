package com.mobil.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	private List<Imovel> imoveisFavoritos;

	@OneToMany
	public List<Imovel> getImoveisFavoritos() {
		return imoveisFavoritos;
	}

	public void setImoveisFavoritos(List<Imovel> imoveisFavoritos) {
		this.imoveisFavoritos = imoveisFavoritos;
	}

}
