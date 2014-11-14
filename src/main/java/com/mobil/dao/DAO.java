package com.mobil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DAO<T> {

	private EntityManager manager;

	public DAO(EntityManager manager) {
		this.manager = manager;
	}

	public T salva(T entidade) {
		this.manager.persist(entidade);
		return entidade;
	}

	public T altera(T entidade) {
		this.manager.merge(entidade);
		return entidade;
	}

	public void remove(T entidade) {
		this.manager.remove(entidade);
	}

	@SuppressWarnings("unchecked")
	public List<T> listaTodos(String nomeTabela) {
		Query query = this.manager.createQuery("select x from " + nomeTabela
				+ " x");
		return query.getResultList();
	}

}
