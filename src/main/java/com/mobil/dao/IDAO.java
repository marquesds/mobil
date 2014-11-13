package com.mobil.dao;

import java.util.List;

public interface IDAO<T> {

	public T salva(T entidade);

	public T altera(T entidade);

	public void remove(T entidade);

	public List<T> listaTodos(String nomeTabela);

}
