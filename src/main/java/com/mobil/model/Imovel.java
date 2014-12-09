package com.mobil.model;

import java.io.Serializable;
import java.util.Observable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "imovel")
public class Imovel extends Observable implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Endereco endereco;
	private TipoImovel tipo;
	private CategoriaImovel categoria;
	private double preco;
	private boolean disponivel;
	private double areaUtil;
	private double areaTotal;
	private int qtdeDormitorio;
	private int qtdeSala;
	private int qtdeBanheiro;
	private String observacao;

	public void atualizaImovel() {
		this.setChanged();
		this.notifyAll();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		this.atualizaImovel();
	}

	public TipoImovel getTipo() {
		return tipo;
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo;
		this.atualizaImovel();
	}

	public CategoriaImovel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaImovel categoria) {
		this.categoria = categoria;
		this.atualizaImovel();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
		this.atualizaImovel();
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		this.atualizaImovel();
	}

	public double getAreaUtil() {
		return areaUtil;
	}

	public void setAreaUtil(double areaUtil) {
		this.areaUtil = areaUtil;
		this.atualizaImovel();
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
		this.atualizaImovel();
	}

	public int getQtdeDormitorio() {
		return qtdeDormitorio;
	}

	public void setQtdeDormitorio(int qtdeDormitorio) {
		this.qtdeDormitorio = qtdeDormitorio;
		this.atualizaImovel();
	}

	public int getQtdeSala() {
		return qtdeSala;
	}

	public void setQtdeSala(int qtdeSala) {
		this.qtdeSala = qtdeSala;
		this.atualizaImovel();
	}

	public int getQtdeBanheiro() {
		return qtdeBanheiro;
	}

	public void setQtdeBanheiro(int qtdeBanheiro) {
		this.qtdeBanheiro = qtdeBanheiro;
		this.atualizaImovel();
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
		this.atualizaImovel();
	}

}
