package patron.ejercicio;

import patron.Observer.Observado;

public class Motor extends Observado implements IMotor  {

	private Boolean estado;
	//False -> encendido
	//True -> apagado
	
	public Motor() {estado = false;}
	
	@Override
	public void arrancar() {
		estado = true;
		notify("El coche ha arrancado");
	}

	@Override
	public void parar() {
		estado = false;
		notify("El Coche esta parando");
	}
	
	@Override
	public boolean estado() {return estado;}
	

}
