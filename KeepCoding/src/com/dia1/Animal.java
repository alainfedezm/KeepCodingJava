package com.dia1;

public class Animal {
	

	
	private String nombre;
	private String raza;
	private boolean vacunado;
	private boolean sexo;
	private int vida;
	private int dano;
	
	public Animal(String nombreP, String razaP, int v, int d) {
		nombre = nombreP;
		raza = razaP;
		vacunado = false;
		sexo = false;
		vida = v;
		dano = d;
	}
	
	//get
	public String getRaza(){return raza;}
	public String getNombre(){return nombre;}
	public boolean getVacunado() {return vacunado;}
	public int getDani() {return dano;}
	public int getVIda() {return vida;}
	public String getSexo() {
		if(!sexo) return "masculino";
		return "femenimo";
	}
	
	//set
	public void getRaza(String newRaza) {raza = newRaza;}
	public void setNombre(String newNombre){nombre = newNombre;}
	public void ponerVacuna(boolean vacuna){vacunado =vacuna;}
	public void setSexo(boolean newSexo) {sexo = newSexo;}
	public void setVida(int newvida) {vida = newvida;}
	public void setDano(int newSexo) {dano = newSexo;}
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza  + ", vacunado=" + vacunado + "]";
	}
	
	public void hacerRuido() {System.out.println("Ladrar");}
	
	public int sufrir(int dano) {
		vida -=dano; 
		System.out.println(nombre + " ha recibido " + dano + " de damage le quedan " + vida + " puntos de vida");
		return vida;
	}

}
