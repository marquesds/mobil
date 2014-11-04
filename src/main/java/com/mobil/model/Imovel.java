package com.mobil.model;

import java.io.Serializable;

public class Imovel implements Serializable {

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoImovel getTipo() {
		return tipo;
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo;
	}

	public CategoriaImovel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaImovel categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public double getAreaUtil() {
		return areaUtil;
	}

	public void setAreaUtil(double areaUtil) {
		this.areaUtil = areaUtil;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public int getQtdeDormitorio() {
		return qtdeDormitorio;
	}

	public void setQtdeDormitorio(int qtdeDormitorio) {
		this.qtdeDormitorio = qtdeDormitorio;
	}

	public int getQtdeSala() {
		return qtdeSala;
	}

	public void setQtdeSala(int qtdeSala) {
		this.qtdeSala = qtdeSala;
	}

	public int getQtdeBanheiro() {
		return qtdeBanheiro;
	}

	public void setQtdeBanheiro(int qtdeBanheiro) {
		this.qtdeBanheiro = qtdeBanheiro;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
