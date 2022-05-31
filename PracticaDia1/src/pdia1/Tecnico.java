package pdia1;


public abstract class Tecnico extends Empleado{
	
	private String codigoTaller;

	public Tecnico(String nombre, String codigoTaller) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.codigoTaller = codigoTaller;
		setValorHoras(12);
	}

	public String getCodigoTaller() {
		return codigoTaller;
	}

	public void setCodigoTaller(String codigoTaller) {
		this.codigoTaller = codigoTaller;
	}

	@Override
	public String toString() {
		return  "Tecnico [codigoTaller=" + codigoTaller +  
				",Nombre= "+ getnombre() +"]";
	}

}
