package com.lm2a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Insert {

	public static final String INSERT_SQL = "INSERT INTO users(id, username, email, country, password) VALUES(?,?,?,?,?);";
	

	
	public static void main(String[] args) { 
		Connection connection =  H2connectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL);
			preparedStatement.setString(2, "Mario");
			preparedStatement.setString(3, "Mario@email.com");
			preparedStatement.setString(4, "Esp");
			preparedStatement.setString(5, "PwdSecret");
			preparedStatement.setInt(1, 1);
			System.out.println(preparedStatement);
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}

}
