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

	private int a�o;
	private String nombre;
	private int duracion;
	private String autor;
	private ArrayList<String> letra;
	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
