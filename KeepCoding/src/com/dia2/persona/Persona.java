package com.dia2.persona;

public abstract class Persona implements InterfacePersona {
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	
	abstract void printNombre();
	public String getNombre() {return nombre;}

	
}
