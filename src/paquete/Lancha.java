package paquete;

public class Lancha extends Barco {
	private int potencia;
	private int horasAutonomia;
	
	public Lancha(int largo, int ancho, int potencia, int horasAutonomia){
		super(largo,ancho);
		this.potencia = potencia;
		this.horasAutonomia = horasAutonomia;
	}
	
	public int obtenerPrecio(){
		return largo*potencia*PRECIO_BASE_BARCO;
	}
	
	public String tipo(){
		return "Lancha";
	}

	public int getPotencia() {
		return potencia;
	}

	public int getHorasAutonomia() {
		return horasAutonomia;
	}
}
