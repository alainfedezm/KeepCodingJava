package pdia2;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	
	private Categoria categoria;
	private float sueldoBase;

	public User(int id, String firstName, String lastName, Categoria categoria) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.categoria = categoria;
		this.sueldoBase = 1000;
	}
	
	public void getCategoria() {
		System.out.println("El sueldo de " + firstName + " segun su " +  categoria.getCategoria()  + " es de: " + categoria.calcularSueldo(sueldoBase));
	}
	
	public void setCategoria(Categoria categoria) {this.categoria = categoria;}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}