package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VentanaResultado {
	public void mostrarInfo(String dato, String tipo) {
		if(tipo.equals("informativo")) {
			JOptionPane.showMessageDialog(null, dato, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, dato, "Perdio", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
