package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ticketek implements ITicketek {
	
	Map <String, Usuario> usuarios;
	Map <String, Espectaculo> espectaculos;
	List <Sede> sedes;
	
	public void registrarSede(String nombre, String direccion, int capacidadMaxima) {
		Sede s = new Sede(nombre, direccion, capacidadMaxima);
		sedes.add(s);
	}

	// Teatros
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		Teatro t = new Teatro(nombre, direccion, capacidadMaxima, asientosPorFila, sectores, capacidad, porcentajeAdicional);
		sedes.add(t);
	}

	//Miniestadios
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			int cantidadPuestos, double precioConsumicion, String[] sectores, int[] capacidad,
			int[] porcentajeAdicional) {
		Miniestadio m = new Miniestadio(nombre, direccion, capacidadMaxima, asientosPorFila, cantidadPuestos, precioConsumicion, sectores, capacidad, porcentajeAdicional);
		sedes.add(m);
	}

	@Override
	public void registrarUsuario(String email, String nombre, String apellido, String contrasenia) {
		if(!usuarios.containsKey(email)) {
			Usuario u = new Usuario(email, nombre, apellido, contrasenia);
			usuarios.put(email, u);
		}
	}

	@Override
	public void registrarEspectaculo(String nombre) {
		Espectaculo espec = new Espectaculo(nombre);
		espectaculos.put(nombre, espec);
	}

	@Override
	public void agregarFuncion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		Espectaculo espec = espectaculos.get(nombreEspectaculo);
		espec.agregarFuncion(nombreEspectaculo, fecha, sede, precioBase);
	}

	// Sector Campo
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			int cantidadEntradas) {
		
		List<IEntrada> entradasNueva = new ArrayList<>();
		Usuario usuario = usuarios.get(email);
		Espectaculo espec = espectaculos.get(nombreEspectaculo);
		for(int i = 0; i < cantidadEntradas; i++) {
			Entrada entrada = espec.venderEntrada(fecha);
			entradasNueva.add((IEntrada) entrada);
			usuario.agregarEntrada(entrada);
		}
		return entradasNueva;
	}

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			String sector, int[] asientos) {

		List<IEntrada> entradasNueva = new ArrayList<>();
		Usuario usuario = usuarios.get(email);
		Espectaculo espec = espectaculos.get(nombreEspectaculo);
		for(int asiento : asientos) {
			Entrada entrada = espec.venderEntrada(fecha, asiento);
			entradasNueva.add((IEntrada) entrada);
			usuario.agregarEntrada(entrada);
		}
		return entradasNueva;
	}

	@Override
	public String listarFunciones(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasEspectaculo(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasFuturas(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarTodasLasEntradasDelUsuario(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean anularEntrada(IEntrada entrada, String contrasenia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha, String sector, int asiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha, String sector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudado(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudadoPorSede(String nombreEspectaculo, String nombreSede) {
		// TODO Auto-generated method stub
		return 0;
	}

}
