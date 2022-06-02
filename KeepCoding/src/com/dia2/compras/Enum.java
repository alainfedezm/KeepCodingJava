package com.dia2.compras;

enum PersonaC{
	DIRECTIVO, EMPLEADO, SOCIO, TIENDA, ONLINE
}
public class Enum {

	public static void main(String[] args) {
		PersonaC tp = PersonaC.DIRECTIVO;
		Descuento desc = null;
		Compra c = new Compra();
		
		switch(tp) {
			case DIRECTIVO:
				desc = new DescuentoDirectivo();
				break;
			case EMPLEADO: 
				desc = new DescuentoEmpleado();
				break;
			case SOCIO: 
				desc = new DescuentoSocio();
				break;
			case TIENDA: 
				desc = new DescuentoTIENDA();
				break;
			case ONLINE: 
				desc = new DescuentoOnline();
				break;
		default:
			break;
		}
		
		c.aplicarDescuento(desc);
		
	}
	
}
