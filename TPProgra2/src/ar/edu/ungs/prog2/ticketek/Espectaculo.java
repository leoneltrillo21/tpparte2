package ar.edu.ungs.prog2.ticketek;

import java.util.List;
import java.util.Map;

public class Espectaculo {
	String codigo, nombre;
	int cantFunciones;
	Map <String, Funcion> funciones;
	
	public Espectaculo(String nombre) {
		this.nombre = nombre;
	}
	
	void agregarFuncion(String nombre, String fecha, String sede, double precioBase) {
		
	}
	
	void buscarFuncion(Fecha fecha) {
		
	}
	
	Entrada venderEntrada(String fecha) {
		Funcion func = funciones.get(fecha);
		return func.venderAsiento(nombre, fecha);
	}

	Entrada venderEntrada(String fecha, int asiento) {
		Funcion func = funciones.get(fecha);
		return func.venderAsiento(nombre, fecha, asiento);
	}
	
	void cambiarAsiento(String codigo, String sede, String nuevaSede, int nuevoAsiento) {}
	double valorEntrada(String sede, String sector) {
		return 0;
	}
}
