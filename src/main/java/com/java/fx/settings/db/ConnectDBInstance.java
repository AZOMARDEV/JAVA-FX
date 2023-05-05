package com.java.fx.settings.db;

import com.java.fx.settings.constant.ConstantDB;

public class ConnectDBInstance {

	public static DBBean getConnectDB() {

		DBBean dbBean = new DBBean();

		dbBean.setDbname(ConstantDB.dbname);
		dbBean.setHost(ConstantDB.host);
		dbBean.setPort(ConstantDB.port);
		dbBean.setUserdb(ConstantDB.userdb);
		dbBean.setPwddb(ConstantDB.pwddb);
		return dbBean;
	}
}
