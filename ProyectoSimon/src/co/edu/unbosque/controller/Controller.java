package co.edu.unbosque.controller;

import java.awt.Color;
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
		ventanaJuego.getpS().getColorV().addActionListener(this);
		ventanaJuego.getpS().getColorR().addActionListener(this);
		ventanaJuego.getpS().getColorA().addActionListener(this);
		ventanaJuego.getpS().getColorAz().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("jugar")) {
			ventanaBienvenida.setVisible(false);
			ventanaJuego.setVisible(true);
		} else if (e.getActionCommand().equals("empezar")) {
			// Crea la secuencia de numeros y la guarda en el txt
			op.gestionarPropiedades();
			ventanaJuego.setTitle(op.verPropiedades("nombreJuego"));
			op.crearSecuencia();

			for (int i = 0; i < Integer.parseInt(op.verPropiedades("secuencia")); i++) {
				if (i==0) {
					ventanaJuego.getpN().getNum1().setText(""+op.verSecuencia(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(op.verSecuencia(i));
					ventanaJuego.getpN().getNum1().setText("");
				} else if (i==1) {
					ventanaJuego.getpN().getNum2().setText(""+op.verSecuencia(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(op.verSecuencia(i));
					ventanaJuego.getpN().getNum2().setText("");
				} else if (i==2) {
					ventanaJuego.getpN().getNum3().setText(""+op.verSecuencia(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(op.verSecuencia(i));
					ventanaJuego.getpN().getNum3().setText("");
				} else if (i==3) {
					ventanaJuego.getpN().getNum4().setText(""+op.verSecuencia(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(op.verSecuencia(i));
					ventanaJuego.getpN().getNum4().setText("");
				}
			}			
			// Activa los botones para seguir la secuencia
			ventanaJuego.getpS().getColorV().setEnabled(true);
			ventanaJuego.getpS().getColorV().setBackground(new Color(59,230,0));
			ventanaJuego.getpS().getColorR().setEnabled(true);
			ventanaJuego.getpS().getColorR().setBackground(new Color(255,0,0));
			ventanaJuego.getpS().getColorA().setEnabled(true);
			ventanaJuego.getpS().getColorA().setBackground(new Color(251,255,0));
			ventanaJuego.getpS().getColorAz().setEnabled(true);
			ventanaJuego.getpS().getColorAz().setBackground(new Color(0,135,255));

		} else if (e.getActionCommand().equals("verde")) {
			
		} else if (e.getActionCommand().equals("rojo")) {

		} else if (e.getActionCommand().equals("amarillo")) {

		} else if (e.getActionCommand().equals("azul")) {

		}
	}
}
