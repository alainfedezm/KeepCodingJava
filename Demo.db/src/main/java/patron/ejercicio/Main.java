package patron.ejercicio;

import patron.Observer.Observador;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		Coche c1 = new Coche.CocheBuilder("2864FWR").modelo("BMW").build();
		System.out.println(c1);
		
		Motor m = new Motor();
		m.suscribe(c1);
		m.suscribe(new Observador<String>("holaa"));
		

		

		m.arrancar();
		System.out.println("-----------------------------------------");

		m.parar();
		System.out.println("-----------------------------------------");

		m.parar();
		System.out.println("-----------------------------------------");
		
	}

}
