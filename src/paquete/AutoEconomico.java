package paquete;

public class AutoEconomico extends Auto{
	private boolean aireAcondicionado;
	private boolean direccionHidra;
	private boolean gnc;
	
	public AutoEconomico(boolean aireAcondicionado, boolean direccionHidra, boolean gnc) {
		super();
		this.aireAcondicionado = aireAcondicionado;
		this.direccionHidra = direccionHidra;
		this.gnc = gnc;
	}
	
	public String tipo(){
		return "Auto económico";
	}
}
