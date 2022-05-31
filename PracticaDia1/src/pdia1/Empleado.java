package pdia1;

public abstract class  Empleado {
	
	private String nombre;
	private float vh;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		vh = 10;
	}
	
	public String getnombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public float getValorHoras() {return vh;}
	public void setValorHoras(float valor) {vh = valor;}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	public String calcularSalario(float vt) {		
		return "El salario por " + vt  + " horas trabajadas es de " + vt * vh;
	}

}
