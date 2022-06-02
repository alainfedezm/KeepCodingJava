package com.contacto;

public class Contacto {
	
	private int id;
	private String nombre;
	private String email;
	private int telefono;
	
	public Contacto(String n, String em, int tel) {

		nombre = n;
		email = em;
		telefono = tel;
	}
	
	public Contacto(int i,String n, String em, int tel) {
		this.id = i;
		nombre = n;
		email = em;
		telefono = tel;
	}
	
	public int getId() {return id;}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
	}
	

}
