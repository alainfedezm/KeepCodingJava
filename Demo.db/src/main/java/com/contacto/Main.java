package com.contacto;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//obtener todos los usuarios
		//GestorBD.dropTable("contacto");
		System.out.println("----------------------------------------------");
		System.out.println("Datos de la BD");
		GestorBD.getMiBD().getUsuarios();
		Agenda.getMiAgenda().imprimirContactos();
		System.out.println("----------------------------------------------");
		
		System.out.println("----------------------------------------------");
		//GestorBD.getMiBD().crearTable();
		
		System.out.println("Nuevo usuario a la BD");
		GestorBD.getMiBD().crearContacto(new Contacto("Diego", "diego@expleo.com",000000002));
		Agenda.getMiAgenda().imprimirContactos();
		System.out.println("----------------------------------------------");

		//Update usuario BD
		System.out.println("----------------------------------------------");
		System.out.println("Update usuario BD");
		GestorBD.getMiBD().updateContacto(new Contacto(0,"Diego", "",000000002));
		Agenda.getMiAgenda().imprimirContactos();
		System.out.println("----------------------------------------------");

		//Delete user
		System.out.println("----------------------------------------------");
		System.out.println("Delete User");
		GestorBD.getMiBD().deleteContacto(0);
		Agenda.getMiAgenda().imprimirContactos();
		System.out.println("----------------------------------------------");
		
		
	
	}

}
