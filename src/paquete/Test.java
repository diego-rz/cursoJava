package paquete;

public class Test {
	public static void main(String args[]){
		Empresa miEmpresa = new Empresa();
		
		
		Barco b = new Lancha(6, 3, 40, 24);
		miEmpresa.agregarVehiculo(b);
		b = new Yate(20, 7, 1, false);
		miEmpresa.agregarVehiculo(b);
		b = new Velero(5, 2, 2, 1);
		miEmpresa.agregarVehiculo(b);
		
		Auto a = new AutoEconomico(true, false, false);
		miEmpresa.agregarVehiculo(a);
		a = new AutoDelujo(true, false, false);
		miEmpresa.agregarVehiculo(a);
		a = new AutoEstandar(true, true, true, false);
		miEmpresa.agregarVehiculo(a);
		
		Cliente c = new Cliente("Juan", "Roman", 123455, 1);
		miEmpresa.agregarCliente(c);
		c = new Cliente("Martin", "Palermo", 5252123, 2);
		miEmpresa.agregarCliente(c);
		c = new Cliente("Pedro", "Picapiedra", 123511, 3);
		miEmpresa.agregarCliente(c);
		
		for(int i=0; i<miEmpresa.getIndiceBarcos() ; i++)
			System.out.println(miEmpresa.getBarcos()[i].tipo());
		
		for(int i=0; i<miEmpresa.getIndiceAutos() ; i++)
			System.out.println(miEmpresa.getAutos()[i].tipo());
		
//		miEmpresa.getClientes()[0].nuevoAlquiler(miEmpresa.getBarcos()[0], 12);
//		miEmpresa.getClientes()[0].nuevoAlquiler(miEmpresa.getBarcos()[1], 5);
//		miEmpresa.getClientes()[1].nuevoAlquiler(miEmpresa.getBarcos()[0], 7);
//		miEmpresa.getClientes()[1].nuevoAlquiler(miEmpresa.getBarcos()[2], 15);
//		miEmpresa.getClientes()[2].nuevoAlquiler(miEmpresa.getBarcos()[1], 3);
//		
//		System.out.println(miEmpresa.getClientes()[0]);
//		System.out.println(miEmpresa.getClientes()[1]);
//		System.out.println(miEmpresa.getClientes()[2]);
	}
}
