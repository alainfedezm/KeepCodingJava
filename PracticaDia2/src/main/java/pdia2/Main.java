package pdia2;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<User> usuarios = new Stack<User>();
			
		usuarios.push(new User(1, "Alain", "Fernandez",(new Categoria1())));
		usuarios.push(new User(2, "Marta", "Franco",(new Categoria3())));
		usuarios.push(new User(3, "Diego", "Olmos",(new Categoria2())));
		usuarios.push(new User(4, "Anne", "Baste",(new Categoria3())));
		usuarios.push(new User(5, "Andoni", "Fernandez",(new Categoria2())));
		usuarios.push(new User(6, "Alain", "Fernandez",(new Categoria1())));
		usuarios.push(new User(7, "Marta", "Franco",(new Categoria3())));
		usuarios.push(new User(8, "Diego", "Olmos",(new Categoria2())));
		usuarios.push(new User(9, "Anne", "Baste",(new Categoria3())));
		usuarios.push(new User(10, "Andoni", "Fernandez",(new Categoria2())));
		
		while(!usuarios.isEmpty()) {
			usuarios.pop().getCategoria();
		}	
	}
}
