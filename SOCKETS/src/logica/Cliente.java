/**
 * 
 */
package logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *   @author fabio Enrique Pineda
 *
 */
public class Cliente implements Runnable {

	private Socket socketConexion;
	private String direccion;
	private int puerto;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	private boolean ejecutar=true;
	private int opcion=0;
	/**
	 * @return the socketConexion
	 */
	public Socket getSocketConexion() {
		return socketConexion;
	}
	/**
	 * @param socketConexion the socketConexion to set
	 */
	public void setSocketConexion(Socket socketConexion) {
		this.socketConexion = socketConexion;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the puerto
	 */
	public int getPuerto() {
		return puerto;
	}
	/**
	 * @param puerto the puerto to set
	 */
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	/**
	 * @return the inputStream
	 */
	public DataInputStream getInputStream() {
		return inputStream;
	}
	/**
	 * @param inputStream the inputStream to set
	 */
	public void setInputStream(DataInputStream inputStream) {
		this.inputStream = inputStream;
	}
	/**
	 * @return the outputStream
	 */
	public DataOutputStream getOutputStream() {
		return outputStream;
	}
	/**
	 * @param outputStream the outputStream to set
	 */
	public void setOutputStream(DataOutputStream outputStream) {
		this.outputStream = outputStream;
	}

	/**
	 * 
	 */
	public Cliente() {

		puerto =3010;
		try {
			socketConexion = new Socket("localHost",3010);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("el host no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("el host no existe");
		}

		try {
			outputStream = new DataOutputStream(socketConexion.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream = new DataInputStream(socketConexion.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//este es el inicio del hilo
		Thread hilo = new Thread(this);
		hilo.start();
	}


	public void run() {
		// TODO Auto-generated method stub
		while (ejecutar) {
			try {
				opcion= inputStream.readInt();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (opcion) {
			case 1:
				try {
					System.out.println(inputStream.readInt());
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 2:

			default:
				break;
			}
		}
	}
}
