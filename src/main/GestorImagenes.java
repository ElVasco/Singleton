package main;

public class GestorImagenes {

	//comienzo singleton
	private static GestorImagenes instance = new GestorImagenes();
	
	private GestorImagenes () {	}
	
	public static GestorImagenes obtenerInstance() {
		return instance;
	}
	//fin singleton
	
	public void cargandoImagen(String ruta) {
		System.out.println("cargando imagen: " + ruta);
	}

	public void borrandoImagen(String ruta) {
		System.out.println("borrando imagen: " + ruta);
	}
	
}
