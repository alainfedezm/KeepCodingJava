package com.alain.dia1;

public class Gato extends Animal{

	private int year;
	
	public Gato(String nombreP, String razaP, int v, int d) {
		super(nombreP, razaP,v,d);
		// TODO Auto-generated constructor stub
		year = 2022;
	}
	
	public int getYear() {return year;}
	public void setYear(int newYear) {year = newYear;}

	@Override
	public String toString() {
		return "Gato [year=" + year + ", nombre=" + getNombre() + ", raza=" + getRaza() + ", vacunado=" + getVacunado() 
		+ ", sexo=" + getSexo() + "]";
	}
	
	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		System.out.println("Miau");
		
	}
}
