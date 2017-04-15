package paquete;

public class Empresa{
	private Cliente[] clientes;
	private Barco[] barcos;
	private Auto[] autos;
	int indiceClientes;
	int indiceBarcos;
	int indiceAutos;
	
	
	public Empresa(){
		clientes = new Cliente[100];
		barcos = new Barco[100];
		autos = new Auto[100];
		indiceClientes = indiceBarcos = indiceAutos = 0;
	}
	
	public void agregarCliente(Cliente clienteNuevo){
		clientes[indiceClientes++] = clienteNuevo;
	}
	
	public void agregarVehiculo(Barco vehiculoNuevo){
		barcos[indiceBarcos++] = vehiculoNuevo;
	}
	public void agregarVehiculo(Auto vehiculoNuevo){
		autos[indiceAutos++] = vehiculoNuevo;
	}



	public Cliente[] getClientes() {
		return clientes;
	}



	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}



	public Barco[] getBarcos() {
		return barcos;
	}



	public void setBarcos(Barco[] barcos) {
		this.barcos = barcos;
	}



	public int getIndiceClientes() {
		return indiceClientes;
	}



	public void setIndiceClientes(int indiceClientes) {
		this.indiceClientes = indiceClientes;
	}



	public int getIndiceBarcos() {
		return indiceBarcos;
	}



	public void setIndiceBarcos(int indiceBarcos) {
		this.indiceBarcos = indiceBarcos;
	}

	public Auto[] getAutos() {
		return autos;
	}

	public void setAutos(Auto[] autos) {
		this.autos = autos;
	}

	public int getIndiceAutos() {
		return indiceAutos;
	}

	public void setIndiceAutos(int indiceAutos) {
		this.indiceAutos = indiceAutos;
	}
	
	
}
