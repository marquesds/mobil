package com.mobil.service;

import java.util.List;

public interface IService<T> {

	public T salva(T entidade);

	public void remove(T entidade);

	public List<T> listaTodos();

}
