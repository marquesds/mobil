package com.mobil.service;


public interface IService<T> {

	public T adiciona(T entidade);

	public void remove(T entidade);

}
