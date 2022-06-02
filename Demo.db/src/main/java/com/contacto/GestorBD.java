package com.contacto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;




public class GestorBD {

	private static final String DB_URL = "jdbc:h2:~/test3";
	private static final String USERNAME = "sa";
	private static final String PASSWORD ="";
	private Stack<Contacto> pila;
	
	private static GestorBD miBD= new GestorBD();
	
	private GestorBD() {
		pila =new Stack<Contacto>();
	}
	
	public static GestorBD getMiBD() {
	       return miBD;
	}
	

	public void crearContacto(Contacto c1) { 
		Connection connection  = getConnection();
		String INSERT_SQL = "INSERT INTO contacto(nombre, email, telefono) VALUES(?,?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL);
			preparedStatement.setString(1, c1.getNombre());
			preparedStatement.setString(2, c1.getEmail());
			preparedStatement.setInt(3, c1.getTelefono());
			preparedStatement.execute();
			
			pila.push(c1);
			
			Agenda.getMiAgenda().addContacto(c1);
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
	}

	public void getUsuarios() {		
		Connection connection = getConnection();
		String READ_USER = "SELECT * from contacto;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(READ_USER);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String email = rs.getString("email");
				int telefono = rs.getInt("telefono");
				Agenda.getMiAgenda().addContacto(new Contacto(id,nombre,email,telefono));
				
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void updateContacto(Contacto c1) {
		String UPDATE_USER = "Update contacto SET nombre = '"+ c1.getNombre() +"' , email = '" + c1.getEmail() + "', telefono ='" +c1.getTelefono()+ "' where id = " +c1.getId()+ ";";
		updateQuery(UPDATE_USER);
		Agenda.getMiAgenda().addContacto(c1);
	}
	
	public void deleteContacto(int id) {
		String DELETE_USER = "DELETE FROM contacto WHERE id = " + id + ";";
		updateQuery(DELETE_USER);
		Agenda.getMiAgenda().deleteContacto(id);
		
	}
	
	public void crearTable() {
		String CREATE_TABLE_SQL ="CREATE TABLE contacto (id int  AUTO_INCREMENT, nombre VARCHAR(20),email VARCHAR(20) , telefono INT(20),PRIMARY KEY (`id`)) ;";
		updateQuery(CREATE_TABLE_SQL);
	}
	
	private void updateQuery(String query) {	
		Connection connection  = getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	private Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return connection;
	}
	
	
	

	
	
	
}
