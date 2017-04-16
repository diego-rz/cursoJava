package paquete;

public class AutoEconomico extends Auto{
	private boolean aireAcondicionado;
	private boolean direccionHidra;
	private boolean gnc;
	
	
	
	public AutoEconomico(String marca, String modelo, int anio, int potencia, boolean aireAcondicionado, boolean direccionHidra, boolean gnc) {
		super(marca, modelo, anio, potencia);
		this.aireAcondicionado = aireAcondicionado;
		this.direccionHidra = direccionHidra;
		this.gnc = gnc;
	}

	public String tipo(){
		return "Auto económico";
	}
	
	public int obtenerPrecio(){
		int valor = PRECIO_BASE_AUTO*potencia*anio/100;
		if(aireAcondicionado)
			valor += 15;
		if(direccionHidra)
			valor += 10;
		return valor;
	}
}
