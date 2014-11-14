package com.mobil.service;


public interface IService<T> {

	public void adiciona(T entidade);

	public void remove(T entidade);

}
