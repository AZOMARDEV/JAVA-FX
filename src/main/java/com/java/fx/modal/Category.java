package com.java.fx.modal;

public class Category {

	private Long _id;
	private String name;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(Long _id, String name) {
		this._id = _id;
		this.name = name;
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

}
