package com.dia2.persona;

public class Hija extends Persona {

	public Hija(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String procesar() {return getNombre().replace("a", "u");}

	
	@Override
	void printNombre() {
		// TODO Auto-generated method stub
		System.out.println(getNombre());
		
	}

}
