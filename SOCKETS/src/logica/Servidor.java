/**
 * 
 */
package logica;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author Fabio Enrique Pineda Guayacan
 *
 */
public class Servidor implements Runnable {

	/**
	 * @param args
	 */

	private ServerSocket serverSocket;
	private ArrayList<Conexion> arrayConexion;
	private Socket conexionEntrante;
	private String direccionIP;
	private int puertoConexion = 3000;
	private int opcion=0;
	private boolean ejecutar= false;


	/**
	 * 
	 */
	public Servidor() {

		puertoConexion = 3010;
		arrayConexion = new ArrayList<Conexion>();
		iniciarServidor();
		Thread hilo = new Thread(this);
		hilo.start();
	}
	/**
	 * @return the serverSocket
	 */
	public ServerSocket getServerSocket() {
		return serverSocket;
	}
	/**
	 * @param serverSocket the serverSocket to set
	 */
	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}
	/**
	 * @return the arrayConexion
	 */
	public ArrayList<Conexion> getArrayConexion() {
		return arrayConexion;
	}
	/**
	 * @param arrayConexion the arrayConexion to set
	 */
	public void setArrayConexion(ArrayList<Conexion> arrayConexion) {
		this.arrayConexion = arrayConexion;
	}
	/**
	 * @return the conexionEntrante
	 */
	public Socket getConexionEntrante() {
		return conexionEntrante;
	}
	/**
	 * @param conexionEntrante the conexionEntrante to set
	 */
	public void setConexionEntrante(Socket conexionEntrante) {
		this.conexionEntrante = conexionEntrante;
	}
	/**
	 * @return the direccionIP
	 */
	public String getDireccionIP() {
		return direccionIP;
	}
	/**
	 * @param direccionIP the direccionIP to set
	 */
	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}
	/**
	 * @return the puertoConexion
	 */
	public int getPuertoConexion() {
		return puertoConexion;
	}
	/**
	 * @param puertoConexion the puertoConexion to set
	 */
	public void setPuertoConexion(int puertoConexion) {
		this.puertoConexion = puertoConexion;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!ejecutar) {
			
			System.out.println("esperando conexion");
			try {
				conexionEntrante = serverSocket.accept();
				arrayConexion.add(new Conexion(conexionEntrante));
				System.out.println("nueva conexion aceptada");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	public void iniciarServidor(){
		if (serverSocket == null) {
			try {
				serverSocket= new ServerSocket(puertoConexion);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error al crear la conexion.....");
			}


		}
	}
	public void detener(){
		ejecutar=true;
	}
	
	public void cerrarConexion(){
		for (int i = 0; i < arrayConexion.size(); i++) {
			arrayConexion.get(i).cerrarConex();
		}
		//detener();
	}
}
