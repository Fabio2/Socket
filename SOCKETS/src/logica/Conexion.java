/**
 * 
 */
package logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author  Fabio Enrique Pineda Guayacan
 *
 */
public class Conexion implements Runnable {

	private Socket conexion;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	private int opcion;
	private boolean ejecutar=true;
	/**
	 * @return the conexion
	 */
	public Socket getConexion() {
		return conexion;
	}
	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Socket conexion) {
		this.conexion = conexion;
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
	public Conexion(Socket sock) {
		this.conexion = sock;
		

		try {
			inputStream = new DataInputStream(sock.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error en entrada de datos");
		}

		try {
			outputStream = new DataOutputStream(sock.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error en salida de datos");
		}
	}

	public void cerrarConex(){
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
		try {
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error rn la salida");
		}
		try {
			conexion.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
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
public void establecerConexion() {
		
		try {
			outputStream.write(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outputStream.writeUTF("hola");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

