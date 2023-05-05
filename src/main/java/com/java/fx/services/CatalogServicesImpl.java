package com.java.fx.services;

import java.util.List;

import com.java.fx.modal.Category;
import com.java.fx.modal.Product;
import com.java.fx.repository.CategoryRepository;
import com.java.fx.repository.ProductRepository;

public class CatalogServicesImpl implements CatalogServices {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;

	public CatalogServicesImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return productRepository.update(p);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> findProductBy(String search) {
		// TODO Auto-generated method stub
		return productRepository.findBy(search);
	}

	@Override
	public void deleteProduct(Long _id) {
		// TODO Auto-generated method stub
		productRepository.delete(_id);
	}

	@Override
	public Category addCategory(Category c) {
		// TODO Auto-generated method stub
		return categoryRepository.save(c);
	}

	@Override
	public Category updateCategory(Category c) {
		// TODO Auto-generated method stub
		return categoryRepository.update(c);
	}

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public void deleteCategory(Long _id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(_id);
	}

}
