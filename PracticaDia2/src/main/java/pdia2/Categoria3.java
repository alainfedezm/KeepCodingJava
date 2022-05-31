package pdia2;

public class Categoria3 implements Categoria {

	public float calcularSueldo(float sb) {
		// TODO Auto-generated method stub
		return (float) (sb + sb*1.35+sb*0.32);
	}

	public String getCategoria() {
		// TODO Auto-generated method stub
		return "Categoria 3";
	}


}
