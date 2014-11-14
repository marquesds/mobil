package com.mobil.init;

import com.mobil.model.Imovel;
import com.mobil.service.impl.ImovelService;

public class InitDB {

	public static void main(String[] args) {

		Imovel imovel = new Imovel();
		ImovelService imovelService = new ImovelService();

		imovel.setPreco(500);

		try {
			System.out.println("salvando imovel!!!!!!!!!!");
			imovelService.salva(imovel);
			System.out.println("imovel salvo!!!!!!!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
