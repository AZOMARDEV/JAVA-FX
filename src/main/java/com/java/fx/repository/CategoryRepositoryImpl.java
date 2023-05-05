package com.java.fx.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.fx.modal.Category;
import com.java.fx.settings.db.ConnectDB;

public class CategoryRepositoryImpl implements CategoryRepository {

	@Override
	public Category findByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		Connection connection = ConnectDB.getConnectionDBJDBC();
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		String sqlQuery = "SELECT * FROM CATEGORY";
		List<Category> categories = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				categories.add(new Category(resultSet.getLong("categoryId"), resultSet.getString("name")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return categories;
	}

	@Override
	public Category save(Category object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(Category object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
