package pakete;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int dni;
	public Persona(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getDni() {
		return dni;
	}
	
	
}
