package paquete;

public abstract class Barco implements Vehiculo {
	protected final int PRECIO_BASE_BARCO = 10;
	protected int largo;
	protected int ancho;
	private boolean habilitado;
	
	public Barco(int largo, int ancho){
		this.largo = largo;
		this.ancho = ancho;
		habilitado = true;
	}
	

	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}
	
	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
}

