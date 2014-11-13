package com.mobil.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobil.dao.IDAO;

public abstract class DAO<T> implements IDAO<T> {

	@Autowired
	private EntityManager em;

	@Override
	public T salva(T entidade) {
		this.em.persist(entidade);
		return entidade;
	}

	@Override
	public T altera(T entidade) {
		this.em.merge(entidade);
		return entidade;
	}

	@Override
	public void remove(T entidade) {
		this.em.remove(entidade);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> listaTodos(String nomeTabela) {
		Query query = this.em.createQuery("select x from " + nomeTabela + " x");
		return query.getResultList();
	}

	public abstract T buscaPorId(Long id);

	public abstract T buscaPorNome(String nome);

}
