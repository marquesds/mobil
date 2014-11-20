package com.mobil.service.impl;

import javax.persistence.NoResultException;

import com.mobil.dao.DAO;
import com.mobil.model.Usuario;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class UsuarioService implements IService<Usuario> {

	private DAO<Usuario> dao = new DAO<Usuario>(Usuario.class);

	@Override
	public void adiciona(Usuario usuario) {
		try {
			if (usuario.getId() != null) {
				this.getDao().remove(usuario);
			} else {
				throw new Exception();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Usuario usuario) {
		try {
			if (usuario.getId() != null) {
				this.getDao().remove(usuario);
			} else {
				throw new Exception();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Usuario buscaPorEmail(String email) {
		Usuario usuario = null;

		try {
			usuario = EntityManagerProvider
					.getInstance()
					.getEntityManager()
					.createQuery("from Usuario where lower(email) = :email",
							Usuario.class)
					.setParameter("email", email.toLowerCase())
					.getSingleResult();
		} catch (NoResultException ex) {
			ex.printStackTrace();
		}

		return usuario;
	}

	public DAO<Usuario> getDao() {
		return dao;
	}

}
