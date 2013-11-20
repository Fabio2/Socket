/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.PanelCliente;
import javax.swing.JFrame;

/**
 * @author Fabio Enrique Pineda
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

	PanelCliente paCl = PanelCliente();
	
	public static void main(String[] args) {
		VentanaPrincipal vp = new VentanaPrincipal();
		vp.setVisible(true);
	}
	private PanelCliente PanelCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
