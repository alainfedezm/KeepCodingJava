package com.dia2.persona;

public class Main {
	
	enum Persona{
		MARTA, ALAIN, DIEGO;
	}
	public static void main(String[] args) {

		Persona persona = Persona.MARTA;

		switch(persona) {
			case MARTA:
				System.out.println("Hola MArta");
				break;
			case ALAIN: 
				System.out.println("Hola Alain");
				break;
			
		default:
			System.out.println("Bienvenido");
		}
			
			
	}
		
}
