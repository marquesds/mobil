package com.mobil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	private List<Imovel> imoveisFavoritos;

	@Autowired
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public List<Imovel> getImoveisFavoritos() {
		return imoveisFavoritos;
	}

	public void setImoveisFavoritos(List<Imovel> imoveisFavoritos) {
		this.imoveisFavoritos = imoveisFavoritos;
	}

}
