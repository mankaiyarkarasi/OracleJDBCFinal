package oracle.main;

import java.sql.Connection;

import oracle.dao.DbConnection;

public class OracleConnection {

	static Connection connection = null;

	public static void main(String[] args) {

		DbConnection dbConnection = new DbConnection();
		connection = dbConnection.getConnection();

		String sql = "SELECT *  FROM EMPLOYEE";
		dbConnection.executeQuery(sql);

	}

}