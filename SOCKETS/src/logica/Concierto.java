/**
 * 
 */
package logica;

import java.util.ArrayList;
import java.util.List;

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
	private int costoSeg;
	private ArrayList<Cancion>cancions;
	
	public ArrayList<Cancion> getCancions() {
		return cancions;
	}

	public void setCancions(ArrayList<Cancion> cancions) {
		this.cancions = cancions;
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

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoSeg() {
		return costoSeg;
	}

	public void setCostoSeg(int costoSeg) {
		this.costoSeg = costoSeg;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	private ArrayList<Cancion> canciones;

	public Concierto(int maxEspectadores, int estadisticas, String nombre,
			ArrayList<Cancion>cancions) {
		super();
		this.maxEspectadores = maxEspectadores;
		this.estadisticas = estadisticas;
		this.nombre = nombre;
	}

	
	public void agregarCancion(Cancion cancion){
		if (cancion !=null) {
			((List<Cancion>) cancion).add(cancion);
		}

	}
}
