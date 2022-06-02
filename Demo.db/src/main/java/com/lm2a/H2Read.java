package com.lm2a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2Read {

	public static final String READ_USER = "SELECT id, username, email, country, password from users where id = ?;";
	
	
	public static void main(String[] args) {
		
		Connection connection =  H2connectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(READ_USER);
			preparedStatement.setInt(1, 1);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				System.out.println(username + " " + id);
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
