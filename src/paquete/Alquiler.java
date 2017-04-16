package paquete;

public class Alquiler {
	private Cliente cliente;
	private Vehiculo vehiculo;
	private int dias;
	private int precio;

	public Alquiler(Cliente cliente, Vehiculo vehiculo, int dias) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.dias = dias;
		this.vehiculo.setHabilitado(false);
		precio = vehiculo.obtenerPrecio() * dias;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	// getters/setters
	public Cliente getCliente() {
		return cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
