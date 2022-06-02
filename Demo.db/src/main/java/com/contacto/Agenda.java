package com.contacto;


import java.util.Collection;
import java.util.HashMap;



public class Agenda {
	private static Agenda miAgenda= new Agenda(); 
	private HashMap<Integer, Contacto> contactos ;

	   
	private Agenda() {
		   contactos = new HashMap<Integer, Contacto>();
	}
	
	public static Agenda getMiAgenda() {
	       return miAgenda;
	}
	
	public void addContacto(Contacto c1) {
		contactos.put(c1.getId(), c1);
	}
	
	public void deleteContacto(int id) {
		contactos.remove(id);
	}
	
	public Contacto getContacto(int id) {return contactos.get(id);}
	
	
	public void imprimirContactos() {
		Collection<Contacto> values = contactos.values();
		Contacto[] targetArray = values.toArray(new Contacto[values.size()]);
		
		for(Contacto c1: targetArray) {
			System.out.println(c1);
		}
	}
	
	public int getSize() {return contactos.size();}


}
