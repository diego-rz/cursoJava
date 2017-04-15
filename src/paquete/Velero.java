package paquete;

public class Velero extends Barco {
	private int capacidad;
	private int mastiles;

	public Velero(int largo, int ancho, int capacidad, int mastiles) {
		super(largo, ancho);
		this.capacidad = capacidad;
		this.mastiles = mastiles;
	}
	
	public String tipo(){
		return "Velero";
	}
	
	public int obtenerPrecio(){
		return capacidad*PRECIO_BASE_BARCO;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getMastiles() {
		return mastiles;
	}
	
	
}
