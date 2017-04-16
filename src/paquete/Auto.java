package paquete;

public abstract class Auto implements Vehiculo{
	public final int PRECIO_BASE_AUTO = 5;
	protected int kmTotal;
	protected int kmAceite;
	protected int kmCubiertas;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected int potencia;
	protected boolean habilitado;
	
	
	
	public Auto(String marca, String modelo, int anio, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.potencia = potencia;
		habilitado = true;
	}

	public void setHabilitado(boolean habilitado){
		this.habilitado = habilitado;
	}

	public boolean isHabilitado() {
		return habilitado;
	}
	
	
}
