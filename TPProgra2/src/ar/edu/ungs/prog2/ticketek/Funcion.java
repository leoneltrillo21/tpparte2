package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;

public class Funcion {
	Sede sede;
	Fecha fecha;
	double precioBase;
	int contadorEntradas;
	ArrayList<Entrada> entradas;
	int asiento;
	
	public Funcion(Sede sede, Fecha fecha, double precioBase, int contadorEntradas) {
		this.sede = sede;
		this.fecha = fecha;
		this.precioBase = precioBase;
		this.contadorEntradas = contadorEntradas;
	}
	
	void agregarSede(Sede sede) {
		
	}
	
	Entrada venderAsiento(String nombre, String fecha) {
		Entrada entrada = new Entrada(nombre, fecha);
		entradas.add(entrada);
		return entrada;
	}

	Entrada venderAsiento(String nombre, String fecha2, int asiento) {
		Entrada entrada = new Entrada(nombre, fecha, asiento);
		entradas.add(entrada);
		return entrada;
	}
	
}
