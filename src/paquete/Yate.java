package pakete;

public class Yate extends Barco{
	private int camarotes;
	private boolean cocina;
	
	public Yate(int largo, int ancho, int camarotes, boolean cocina){
		super(largo, ancho);
		this.camarotes = camarotes;
		this.cocina = cocina;
	}
	
	public int obtenerPrecio(){
		return cocina? 
				(int)(largo*camarotes*PRECIO_BASE_BARCO*1.1) : 
				largo*camarotes*PRECIO_BASE_BARCO; 
	}
	
	public String tipo(){
		return "Yate";
	}

	public int getCamarotes() {
		return camarotes;
	}

	public boolean isCocina() {
		return cocina;
	}
}
