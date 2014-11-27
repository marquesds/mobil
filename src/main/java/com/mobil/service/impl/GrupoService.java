package com.mobil.service.impl;

import com.mobil.dao.DAO;
import com.mobil.model.Grupo;
import com.mobil.service.IService;

public class GrupoService implements IService<Grupo> {

	private DAO<Grupo> dao = new DAO<Grupo>(Grupo.class);

	@Override
	public void adiciona(Grupo grupo) {
		try {
			if (grupo.getId() == null) {
				dao.adiciona(grupo);
				grupo = new Grupo();
			} else {
				dao.atualiza(grupo);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Grupo entidade) {
		// TODO Auto-generated method stub

	}

	public DAO<Grupo> getDao() {
		return dao;
	}

	public void setDao(DAO<Grupo> dao) {
		this.dao = dao;
	}

}
