package paquete;

public class Alquiler {
	private Cliente cliente;
	private Barco barco;
	private int dias;
	
	public Alquiler(Cliente cliente, Barco barco, int dias) {
		this.cliente = cliente;
		this.barco = barco;
		this.dias = dias;
		this.barco.setHabilitado(false);
	}
	
	
	
	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	//	getters/setters
	public Cliente getCliente() {
		return cliente;
	}

	public Barco getBarco() {
		return barco;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
