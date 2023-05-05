package com.java.fx.dao;

import java.util.List;

public interface DAO<T, U> {

	T findByID(U id);

	List<T> findAll();

	T save(T object);

	T update(T object);

	void delete(U id);

}
