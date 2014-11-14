package com.mobil.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.mobil.dao.DAO;
import com.mobil.model.Funcionario;
import com.mobil.service.IService;
import com.mobil.util.jpa.EntityManagerProvider;

public class FuncionarioService implements IService<Funcionario> {

	private EntityManager manager = EntityManagerProvider.getEntityManager();
	private DAO<Funcionario> dao = new DAO<Funcionario>(manager);

	@Override
	public Funcionario salva(Funcionario funcionario) {
		try {
			manager.getTransaction().begin();
			if (funcionario.getId() == null) {
				dao.salva(funcionario);
			} else {
				dao.altera(funcionario);
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

		return funcionario;
	}

	@Override
	public void remove(Funcionario funcionario) {
		try {
			manager.getTransaction().begin();
			if (funcionario.getId() != null) {
				dao.remove(funcionario);
			} else {
				throw new Exception();
			}
			manager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}

	@Override
	public List<Funcionario> buscaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
