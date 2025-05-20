package ar.edu.ungs.prog2.ticketek;

public class Miniestadio extends Sede{

	int asientosPorFila;
	int cantidadPuestos;
	double precioConsumicion;
	String[] sectores;
	int[] capacidad;
	int[] porcentajeAdicional;
	
	Miniestadio(String nombre, String direccion, int capacidadMax, int asientosPorFila,
			int cantidadPuestos, double precioConsumicion, String[] sectores, int[] capacidad,
			int[] porcentajeAdicional) {
		super(nombre, direccion, capacidadMax);
		this.asientosPorFila = asientosPorFila;
		this.cantidadPuestos = cantidadPuestos;
		this.precioConsumicion = precioConsumicion;
		this.sectores = sectores;
		this.capacidad = capacidad;
		this.porcentajeAdicional = porcentajeAdicional;
		}

}
