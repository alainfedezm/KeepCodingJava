package patron.ejercicio;

import patron.Observer.Observador;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(new Coche.CocheBuilder("2864FWR").modelo("BMW").build());
		
		Motor m = new Motor();
		m.suscribe(new Observador("Velocimetro"));
		m.suscribe(new Observador("Ruedas"));

		

		m.arrancar();
		System.out.println("-----------------------------------------");

		m.parar();
		System.out.println("-----------------------------------------");

		m.parar();
		System.out.println("-----------------------------------------");
		
	}

}
