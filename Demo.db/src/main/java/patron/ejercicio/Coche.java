package patron.ejercicio;

import patron.Observer.IObserver;

public class Coche implements IObserver{
	
	private String marca;
	private String modelo;
	private int cm3;
	private String color;
	private int puertas;
	private String matricula;
	private boolean seguro;
	private Motor motor;
	
	public Coche(CocheBuilder builder) {
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.cm3 = builder.cm3;
		this.color = builder.color;
		this.puertas = builder.puertas;
		this.matricula = builder.matricula;
		this.seguro = builder.seguro;
		this.motor = builder.motor;
	}
	

	public static class CocheBuilder{
		private String marca;
		private String modelo;
		private int cm3;
		private String color;
		private int puertas;
		private String matricula;
		private boolean seguro;
		private Motor motor;
		
		public CocheBuilder(String matricula) {
			super();
			this.matricula = matricula;
			puertas = 3;
			
		}
		
		public CocheBuilder marca(String marca) {
			this.marca=marca;
			return this;
		}
		
		public CocheBuilder modelo(String modelo) {
			this.modelo=modelo;
			return this;
		}
		
		public CocheBuilder cm3(int cm3) {
			this.cm3=cm3;
			return this;
		}
		
		public CocheBuilder color(String color) {
			this.color=color;
			return this;
		}
		
		public CocheBuilder puertas(int puertas) {
			this.puertas=puertas;
			return this;
		}
		
		public CocheBuilder seguro(boolean seguro) {
			this.seguro=seguro;
			return this;
		}
		
		public CocheBuilder motor(Motor motor) {
			this.motor=motor;
			return this;
		}
		
		public Coche build() {
			Coche coche = new Coche(this);
			return coche;
		}
	}
	
	



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCm3() {
		return cm3;
	}

	public void setCm3(int cm3) {
		this.cm3 = cm3;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", cm3=" + cm3 + ", color=" + color + ", puertas="
				+ puertas + ", matricula=" + matricula + ", seguro=" + seguro + ", motor=" + motor + "]";
	}

	@Override
	public void update(String tipoEvento) {
		System.out.println(toString());
	}
	
	
}
