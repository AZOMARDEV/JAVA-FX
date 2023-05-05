package com.java.fx.qtest;

import java.sql.Connection;

import com.java.fx.settings.db.ConnectDB;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = ConnectDB.getConnectionDBJDBC();
		try {
			if (con == null) {
				System.err.println("Error no Connection ");
			} else {
				System.out.println("Suuces");
			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
	}

}
