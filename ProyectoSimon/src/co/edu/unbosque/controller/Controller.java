package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.model.Secuencia;
import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaJuego;

public class Controller implements ActionListener {

	private VentanaBienvenida ventanaBienvenida;
	private VentanaJuego ventanaJuego;
	private Operaciones op;
	private Secuencia s;

	public Controller() {
		ventanaBienvenida = new VentanaBienvenida();
		ventanaJuego = new VentanaJuego();
		s = new Secuencia();
		op = new Operaciones();
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaBienvenida.getPi().getBtingreso().addActionListener(this);
		ventanaJuego.getpC().getBtEmpezar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("jugar")) {
			ventanaBienvenida.setVisible(false);
			ventanaJuego.setVisible(true);
		}else if(e.getActionCommand().equals("empezar")) {
			//Pasa por parametro la secuencia en un string de numeros y los escribe en el archivo de propiedades
			
			op.gestionarPropiedades(op.crearSecuencia());
			//Este como se debe hacer el cambio de panels dependiendo del numero generado
			//Si 1 se pone pVE, 2 se pone pRE,3 se pone pAE y 4 pAzE
			ventanaJuego.remove(ventanaJuego.getpS());
			ventanaJuego.add(ventanaJuego.getpVE(), BorderLayout.CENTER);
			ventanaJuego.getpVE().setVisible(true);		
			ventanaJuego.repaint();
		}
	}
}
