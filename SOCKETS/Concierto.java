/**
 * 
 */
package logica;

import java.util.ArrayList;

/**
 * @author Fabio Enrique Pineda Guayacan 
 *
 */
public class Concierto {

	/**
	 * @param args
	 */
	private int maxEspectadores;
	private int estadisticas;
	private String nombre;
	private ArrayList<Cancion>canciones;

	public Concierto(int maxEspectadores, int estadisticas, String nombre,
			ArrayList<Cancion>cancions) {
		
		super();
		this.maxEspectadores = maxEspectadores;
		this.estadisticas = estadisticas;
		
		this.nombre = nombre;
	}

	/**
	 * @return the estadisticas
	 */
	public int getEstadisticas() {
		return estadisticas;
	}

	/**
	 * @param estadisticas the estadisticas to set
	 */
	public void setEstadisticas(int estadisticas) {
		this.estadisticas = estadisticas;
	}

	/**
	 * @return the maxEspectadores
	 */
	public int getMaxEspectadores() {
		return maxEspectadores;
	}

	/**
	 * @param maxEspectadores the maxEspectadores to set
	 */
	public void setMaxEspectadores(int maxEspectadores) {
		this.maxEspectadores = maxEspectadores;
	}

	public void agregarCancion(){

	}
}
