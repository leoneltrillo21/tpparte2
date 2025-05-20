package ar.edu.ungs.prog2.ticketek;

public class Asiento {
	String sector;
	int fila, asiento;
	boolean disponibilidad;
	
	Asiento(String sector, int fila, int asiento) {
		this.sector = sector;
		this.fila = fila;
		this.asiento = asiento;
	}

	void cambiarDisponibilidad(boolean d){
		this.disponibilidad = d;
	}
}
