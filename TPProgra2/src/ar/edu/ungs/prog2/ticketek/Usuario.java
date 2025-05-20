package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.Map;

public class Usuario {
	String mail, nombre, apellido, contrasena;
	Map <String, Entrada> entradas;
	
	public Usuario(String mail, String nombre, String apellido, String contrasena) {
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
	}	

	void agregarEntrada(Entrada entrada) {
		entradas.put(entrada.codigo, entrada);
	}
	
	void anularEntrada(String codigo) {
		
	}
	
	double costoEntrada(String codigo) {
		return 0;
	}
}
