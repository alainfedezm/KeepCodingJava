package com.lm2a;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class H2CreateTable {
	
	public static final String CREATE_TABLE_SQL ="CREATE TABLE users (id IDENTITY, name VARCHAR(20),username VARCHAR(20) , email VARCHAR(20), country VARCHAR(20), password VARCHAR(20) );";


	public static void main(String[] args) { 
		Connection connection  = H2connectionUtil.getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute(CREATE_TABLE_SQL);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
