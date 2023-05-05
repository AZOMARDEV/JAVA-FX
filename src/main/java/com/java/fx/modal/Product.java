package com.java.fx.modal;

public class Product {

	private Long _id;
	private String name;
	private String reference;
	private double price;
	private Category category;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String reference, double price, Category category) {
		this.name = name;
		this.reference = reference;
		this.price = price;
		this.category = category;
	}

	public Product(Long _id, String name, String reference, double price) {
		this._id = _id;
		this.name = name;
		this.reference = reference;
		this.price = price;
	}

	public Product(Long _id, String name, String reference, double price, Category category) {
		this._id = _id;
		this.name = name;
		this.reference = reference;
		this.price = price;
		this.category = category;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
