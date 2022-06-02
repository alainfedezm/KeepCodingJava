package com.lm2a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Delete {

	
	public static final String DELETE_USER = "DELETE FROM users WHERE id = ?;";
	
	
	public static void main(String[] args) {
		
		Connection connection =  H2connectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
			preparedStatement.setInt(1, 1);
			preparedStatement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
