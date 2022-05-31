package pdia1;

public class Directivo extends Empleado{
	
	private String area;

	public Directivo(String nombre, String area) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.area = area;
		setValorHoras(14);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Directivo [area=" + area + ",Nombre="+ getnombre() + "]";
	}

	
}
