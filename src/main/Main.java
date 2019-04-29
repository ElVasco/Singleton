package main;

public class Main {

	public static void main(String[] args) {
		GestorImagenes gi = GestorImagenes.obtenerInstance();
		
		gi.cargandoImagen("meSaleDeLasPelotas.jpg");
		gi.borrandoImagen("TodasLasImagenes.jpg");
		
	}

}
