package com.alain.dia1;

import java.util.Iterator;

public class Lucha {
	
	private UnOrderedDoubleLinkedList<Animal> animales;

	
	public Lucha() {
		animales = new UnOrderedDoubleLinkedList<Animal>();
		animales.addToFront(new Perro("Perro", "asd",10,2));
		animales.addToFront(new Gato("Gato", "asd",10,3));
		animales.addToFront(new Gato("Gato2", "asd",10,5));
		System.out.println("perro creado");
	}
	
	
	public void lucha() {
		Animal ganador = null;
		Iterator<Animal> itr = animales.iterator();
		Animal act = itr.next();
		while(itr.hasNext() & animales.size() > 1) {
			Animal sig = itr.next();
			sig.sufrir(act.getDani());
			if(sig.getVIda()<=0) {
				itr = animales.iterator();
				ganador = act;
				System.out.println("Participante eliminado");
				animales.remove(sig);
				sig = itr.next();
			}
			act = sig;
		}
		System.out.println("\nEl ganador es " + ganador.getNombre());
		
	}
		

}
