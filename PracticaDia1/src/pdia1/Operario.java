package pdia1;

public class Operario extends Tecnico {
	


	private String maquinaria;
	
	public Operario(String nombre, String codigoTaller, String maquinaria) {
		super(nombre, codigoTaller);
		// TODO Auto-generated constructor stub
		this.maquinaria = maquinaria;
	}

	public String getMaquinaria() {
		return maquinaria;
	}

	public void setMaquinaria(String maquinaria) {
		this.maquinaria = maquinaria;
	}

	@Override
	public String toString() {

		return  "Operario [maquinaria=" + maquinaria + " codigoTaller=" + getCodigoTaller() +  
				", Nombre="+ getnombre() +"]";
	}
	
	
	
	

}
