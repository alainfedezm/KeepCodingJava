package patron.Singleton;

import java.util.Stack;

public class Singleton<T> {

	
	private static Singleton instance= new Singleton(); 
	private Stack<T> pila;

		   
	private Singleton() {
		pila = new Stack<T>();
	}
		
	public static Singleton getMiInstance() {
		return instance;
	}
		
	public void anadirElem(T elem) {pila.push(elem);}
	
	public void imprimirDatos() {
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
}
