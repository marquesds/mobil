package com.mobil.service.impl;

import javax.persistence.NoResultException;

import com.mobil.dao.DAO;
import com.mobil.model.Funcionario;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class FuncionarioService implements IService<Funcionario> {

	public DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);

	@Override
	public void adiciona(Funcionario funcionario) {
		try {
			if (funcionario.getId() == null) {
				dao.adiciona(funcionario);
				funcionario = new Funcionario();
			} else {
				dao.atualiza(funcionario);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Funcionario funcionario) {
		try {
			if (funcionario.getId() != null) {
				dao.remove(funcionario);
			} else {
				throw new Exception();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Funcionario buscaPorEmail(String email) {
		Funcionario funcionario = null;

		try {
			funcionario = EntityManagerProvider
					.getInstance()
					.getEntityManager()
					.createQuery(
							"from Funcionario where lower(email) = :email",
							Funcionario.class)
					.setParameter("email", email.toLowerCase())
					.getSingleResult();
		} catch (NoResultException ex) {
			ex.printStackTrace();
		}

		return funcionario;
	}

}
