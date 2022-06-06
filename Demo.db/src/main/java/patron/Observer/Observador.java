package patron.Observer;

public class Observador<T> implements IObserver {

	private T nombre;
	
	public Observador(T nombre) {
		super();
		this.nombre = nombre;
	}

	public void update(String tipoEvento) {
		System.out.println("Tipo del evento notificado: "+ tipoEvento +" ("+nombre+")");
	}

}
