package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaJuego;

public class Controller implements ActionListener {

	private VentanaBienvenida ventanaBienvenida;
	private VentanaJuego ventanaJuego;
	private Operaciones op;

	public Controller() {
		ventanaBienvenida = new VentanaBienvenida();
		ventanaJuego = new VentanaJuego();
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
		} else if (e.getActionCommand().equals("empezar")) {
			// Pasa por parametro la secuencia en un string de numeros y los escribe en el
			// archivo de propiedades
			op.gestionarPropiedades(op.crearSecuencia());
			// Este como se debe hacer el cambio de panels dependiendo del numero generado
			// Si 1 se pone pVE, 2 se pone pRE,3 se pone pAE y 4 pAzE
			ventanaJuego.getpS().setVisible(false);
			for(int i = 0; i<4;i++) {
				if (op.verSecuencia(i) == 1) {
					ventanaJuego.getpRE().setVisible(false);
					ventanaJuego.getpAE().setVisible(false);
					ventanaJuego.getpAzE().setVisible(false);
					ventanaJuego.add(ventanaJuego.getpVE(), BorderLayout.CENTER);
					ventanaJuego.getpVE().setVisible(true);
					ventanaJuego.getpVE().updateUI();
					System.out.println(i+"...1");
					try {
						Thread.sleep(700);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if (op.verSecuencia(i) == 2) {
					ventanaJuego.add(ventanaJuego.getpRE(), BorderLayout.CENTER);
					ventanaJuego.getpRE().setVisible(true);
					ventanaJuego.getpVE().setVisible(false);
					ventanaJuego.getpAE().setVisible(false);
					ventanaJuego.getpAzE().setVisible(false);
					ventanaJuego.getpRE().updateUI();
					System.out.println(i+"...2");
					try {
						Thread.sleep(700);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if (op.verSecuencia(i) == 3) {
					ventanaJuego.getpRE().setVisible(false);
					ventanaJuego.getpVE().setVisible(false);
					ventanaJuego.getpAzE().setVisible(false);
					ventanaJuego.add(ventanaJuego.getpAE(), BorderLayout.CENTER);
					ventanaJuego.getpAE().setVisible(true);
					ventanaJuego.getpAE().updateUI();
					System.out.println(i+"...3");
					try {
						Thread.sleep(700);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if (op.verSecuencia(i) == 4) {
					ventanaJuego.getpRE().setVisible(false);
					ventanaJuego.getpAE().setVisible(false);
					ventanaJuego.getpVE().setVisible(false);
					ventanaJuego.add(ventanaJuego.getpAzE(), BorderLayout.CENTER);
					ventanaJuego.getpAzE().setVisible(true);
					ventanaJuego.getpAzE().updateUI();
					System.out.println(i+"...4");
					try {
						Thread.sleep(700);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
		}
	}
}
