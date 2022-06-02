package com.lm2a;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Update {

	public static final String UPDATE_USER = "Update users SET username = ? where id = ?;";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection =  H2connectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
			preparedStatement.setString(1, "Alain");
			preparedStatement.setInt(2, 1);
			preparedStatement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
