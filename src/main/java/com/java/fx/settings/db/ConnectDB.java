package com.java.fx.settings.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	private static Connection connection;

	public static Connection getConnectionDBJDBC() {
		DBBean dbConnect = ConnectDBInstance.getConnectDB();

		String host = dbConnect.getHost();
		String port = dbConnect.getPort();
		String dbname = dbConnect.getDbname();
		String userdb = dbConnect.getUserdb();
		String pwddb = dbConnect.getPwddb();

		try {
			if (connection == null || connection.isClosed()) {

//				String driverLocation = "com.mysql.jdbc.Driver";
				String driverLocation = "com.mysql.cj.jdbc.Driver";

				Class.forName(driverLocation);
				String connetionString = "jdbc:mysql://" + host + ":" + port + "/" + dbname
						+ "?allowPublicKeyRetrieval=true&useSSL=false";

				connection = DriverManager.getConnection(connetionString, userdb, pwddb);
				System.out.println("-------- MySQL JDBC Connection ------------");

			}

			return connection;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Connection Failed! Check output console");
			System.err.println(e.getMessage());
			return null;
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			System.err.println(e.getMessage());
			return null;
		}

	}// End public static Connection getConnectionDBJDBC ()

}
