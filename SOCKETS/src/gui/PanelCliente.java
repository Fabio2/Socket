/**
 * 
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author Fabio Enrique Pinda
 *
 */
public class PanelCliente extends JPanel{
	
	private JButton jbpuerto;
	private JLabel jlescojerConcierto;
	private JButton jbTiempo;
	private JButton jbhoraInicio;
	private JButton jbhoraFin;

	
	public PanelCliente(){
		setBorder(new TitledBorder("Bienvenidos a Nuestro Portal de Conciertos"));
		setLayout(new GridLayout(2, 3));
		
		
		jlescojerConcierto = new JLabel("Escoje tu concierto");
		add(jlescojerConcierto);
		
		jbhoraInicio = new JButton("Hora Inicio");
		add(jbhoraInicio);
		
		jbhoraFin = new JButton("Hora Fin");
		add(jbhoraFin);
		
		jbpuerto = new JButton("ingrese su puerto");
		add(jbpuerto);
		
		jbTiempo = new JButton("Consulte su Tiempo");
		add(jbTiempo);
	}
 
}
