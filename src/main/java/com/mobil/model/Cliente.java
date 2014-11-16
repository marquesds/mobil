package com.mobil.model;

import java.util.Date;
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

	private Date dataNascimento;
	private String sexo;
	@Autowired
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Imovel> imoveisFavoritos;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Imovel> getImoveisFavoritos() {
		return imoveisFavoritos;
	}

	public void setImoveisFavoritos(List<Imovel> imoveisFavoritos) {
		this.imoveisFavoritos = imoveisFavoritos;
	}

}
