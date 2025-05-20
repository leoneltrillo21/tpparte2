package ar.edu.ungs.prog2.ticketek;

public class Entrada {

	String codigo, nombreEspectaculo;
	int ubicacion;
	String fecha;

	public Entrada(String nombreEspectaculo, String fecha) {
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
	}
	
	public Entrada(String nombreEspectaculo, String fecha, int asiento) {
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
		this.ubicacion = asiento;
	}	
}