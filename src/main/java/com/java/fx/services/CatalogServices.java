package com.java.fx.services;

import java.util.List;

import com.java.fx.modal.Category;
import com.java.fx.modal.Product;

public interface CatalogServices {

	Product addProduct(Product p);

	Product updateProduct(Product p);

	List<Product> findAllProducts();

	List<Product> findProductBy(String search);

	void deleteProduct(Long _id);

	Category addCategory(Category c);

	Category updateCategory(Category c);

	List<Category> findAllCategory();

	void deleteCategory(Long _id);
}
