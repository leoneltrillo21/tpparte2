package ar.edu.ungs.prog2.ticketek;

public class Teatro extends Sede{

	int asientosPorFila;
	String[] sectores;
	int[] capacidad;
	int[] porcentajeAdicional;

	Teatro(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		super(nombre, direccion, capacidadMaxima);
		this.asientosPorFila = asientosPorFila;
		this.sectores = sectores;
		this.capacidad = capacidad;
		this.porcentajeAdicional = porcentajeAdicional;
	}
}
