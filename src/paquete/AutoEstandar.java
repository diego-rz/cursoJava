package paquete;

public class AutoEstandar extends Auto{
	private boolean centralizado;
	private boolean gps;
	private boolean cajaAutomatica;
	

	
	
	public AutoEstandar(String marca, String modelo, int anio, int potencia, boolean centralizado, boolean gps, boolean cajaAutomatica) {
		super(marca, modelo, anio, potencia);
		this.centralizado = centralizado;
		this.gps = gps;
		this.cajaAutomatica = cajaAutomatica;
	}

	public String tipo(){
		return "Auto estándar";
	}
	
	public int obtenerPrecio(){
		int valor = PRECIO_BASE_AUTO*potencia*anio/100;
		if(gps)
			valor += 10;
		if(cajaAutomatica)
			valor += 20;
		return valor;
	}
}
