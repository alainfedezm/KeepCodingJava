package com.dia1;

public class Perro extends Animal{

	private float peso;
	public Perro(String nombreP, String razaP, int v, int d) {
		super(nombreP, razaP,v,d);
		// TODO Auto-generated constructor stub
		peso = 3;

	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
