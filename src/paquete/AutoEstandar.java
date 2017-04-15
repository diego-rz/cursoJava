package paquete;

public class AutoEstandar extends Auto{
	private boolean centralizado;
	private boolean gps;
	private boolean cajaAutomatica;
	private boolean polarizado;
	public AutoEstandar(boolean centralizado, boolean gps, boolean cajaAutomatica, boolean polarizado) {
		super();
		this.centralizado = centralizado;
		this.gps = gps;
		this.cajaAutomatica = cajaAutomatica;
		this.polarizado = polarizado;
	}
	
	public String tipo(){
		return "Auto estándar";
	}
}
