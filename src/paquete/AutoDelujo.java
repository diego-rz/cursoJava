package paquete;

public class AutoDelujo extends Auto{
	private boolean pilotoAutomatico;
	private boolean deportivo;
	private boolean blindado;
	

	
	
	public AutoDelujo(String marca, String modelo, int anio, int potencia, boolean pilotoAutomatico, boolean deportivo, boolean blindado) {
		super(marca, modelo, anio, potencia);
		this.pilotoAutomatico = pilotoAutomatico;
		this.deportivo = deportivo;
		this.blindado = blindado;
	}

	public String tipo(){
		return "Auto de lujo";
	}
	
	public int obtenerPrecio(){
		int valor = PRECIO_BASE_AUTO*potencia*anio/100;
		if(pilotoAutomatico)
			valor += 55;
		if(blindado)
			valor += 30;
		return valor;
	}
}
