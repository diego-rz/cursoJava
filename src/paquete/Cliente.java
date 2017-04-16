package paquete;

public class Cliente extends Persona{
	private int id; 
	private Alquiler[] alquileres = new Alquiler[5];
	private int indiceAlquileres;
	
	public Cliente(String nombre, String apellido, int dni, int id) {
		super(nombre, apellido, dni);
		this.id = id;
		indiceAlquileres = 0;
	}
	
	public void nuevoAlquiler(Vehiculo vehiculo, int dias){
		if(indiceAlquileres < 5 && vehiculo.isHabilitado())
			alquileres[indiceAlquileres++] = new Alquiler(this, vehiculo, dias);
	}

	public String toString(){
		String cadena="";
		for(int i=0; i<indiceAlquileres ; i++)
			cadena += alquileres[i].getVehiculo().tipo()+"\t"+alquileres[i].getDias()+"\t$"+alquileres[i].getPrecio()+"\n"; 
		return "Nombre: "+nombre+" "+apellido+"\nAlquileres:\n"+cadena ;
	}
	
	public int getId() {
		return id;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}
	
	
}
