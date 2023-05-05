package com.java.fx.repository;

import java.util.List;

import com.java.fx.dao.DAO;
import com.java.fx.modal.Product;

public interface ProductRepository extends DAO<Product, Long> {

	List<Product> findBy(String search);
	
}
