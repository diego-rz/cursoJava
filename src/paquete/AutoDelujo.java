package paquete;

public class AutoDelujo extends Auto{
	private boolean pilotoAutomatico;
	private boolean deportivo;
	private boolean blindado;
	public AutoDelujo(boolean pilotoAutomatico, boolean deportivo, boolean blindado) {
		super();
		this.pilotoAutomatico = pilotoAutomatico;
		this.deportivo = deportivo;
		this.blindado = blindado;
	}
	
	public String tipo(){
		return "Auto de lujo";
	}
}
