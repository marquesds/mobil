package com.mobil.service.impl;

import com.mobil.dao.DAO;
import com.mobil.model.Imovel;
import com.mobil.service.IService;

public class ImovelService implements IService<Imovel> {

	private DAO<Imovel> dao = new DAO<Imovel>(Imovel.class);

	@Override
	public void adiciona(Imovel imovel) {
		try {
			if (imovel.getId() == null) {
				dao.adiciona(imovel);
				imovel = new Imovel();
			} else {
				dao.atualiza(imovel);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void remove(Imovel entidade) {
	}

}
