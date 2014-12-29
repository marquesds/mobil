package com.mobil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;

import com.mobil.util.jpa.EntityManagerProvider;

public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}

	public void adiciona(T t) {

		// consegue a entity manager
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();

		em.getTransaction().begin();

		// persiste o objeto
		em.persist(t);

		em.getTransaction().commit();

		em.close();

	}

	public void remove(T t) {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();
		em.getTransaction().begin();

		em.remove(em.merge(t));

		em.getTransaction().commit();
		em.close();
	}

	public void atualiza(T t) {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();
		em.getTransaction().begin();

		em.merge(t);

		em.getTransaction().commit();
		em.close();
	}

	public List<T> listaTodos() {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).getResultList();

		em.close();
		return lista;
	}

	public T buscaPorId(Long id) {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();
		T instancia = em.find(classe, id);
		em.close();
		return instancia;
	}

	public T buscaPorNome(String nome) {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();

		T instancia = null;

		try {
			instancia = (T) em
					.createQuery(
							"from " + classe.getSimpleName()
									+ " where lower(nome) = :nome", classe)
					.setParameter("nome", nome.toLowerCase()).getSingleResult();
		} catch (NoResultException ex) {
			ex.printStackTrace();
		}

		em.close();
		return instancia;

	}

	public List<T> listaTodosPaginada(int firstResult, int maxResults) {
		EntityManager em = EntityManagerProvider.getInstance()
				.getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();

		em.close();
		return lista;
	}

}
