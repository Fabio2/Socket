/**
 * 
 */
package logica;

import java.util.ArrayList;

/**
 * @author USUARIO
 *
 */
public class Cancion {

	/**
	 * @param args
	 */

	private int año;
	private String nombre;
	private int duracion;
	private String autor;
	private ArrayList<String> letra;
	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the letra
	 */
	public ArrayList<String> getLetra() {
		return letra;
	}
	/**
	 * @param letra the letra to set
	 */
	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}

	
	public void CargarCancion(){
		
	}
}
