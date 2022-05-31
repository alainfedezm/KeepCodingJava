package pdia1;

import java.util.ArrayList;

public class Main {

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public void crearempleados() {	
		empleados.add(new Directivo("SergioD", "Marketing"));
		empleados.add(new Directivo("AlainD", "Ventas"));	
		empleados.add(new Oficial("SergioO", "123", "IT"));	
		empleados.add(new Oficial("AlainO", "123", "IT"));				
		empleados.add(new Operario("SergioOp", "12w3", "pc"));
		empleados.add(new Operario("AlainOp", "123", "pc")); 
		
		for(Empleado emp: empleados) {
			System.out.println(emp);
			if(emp instanceof Empleado) System.out.println(((Empleado) emp).calcularSalario(10));
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Main()).crearempleados();
		
	}
}
