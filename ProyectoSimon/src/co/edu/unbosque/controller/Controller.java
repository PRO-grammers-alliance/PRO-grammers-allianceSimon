package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

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
			ventanaJuego.setTitle(op.verPropiedades("nombreJuego"));
		} else if (e.getActionCommand().equals("empezar")) {
			// Crea la secuencia de numeros y la guarda en el txt
			op.gestionarPropiedades();
			op.crearSecuencia();

			// Clase Timer() que se usa para una secuencia repetiva en determinado tiempo
			// En este caso se usa para mostrar cada numero y luego quitarlo
			Timer timer = new Timer();
			// Indica la tarea a realizar en determinado tiempo
			TimerTask tarea = new TimerTask() {
				// metodo que se crea automaticamente al crear TimerTask
				public void run() {
					ventanaJuego.getpN().getNum1().setText("" + op.verSecuencia(0));
					ventanaJuego.getpN().getNum2().setText("" + op.verSecuencia(1));
					ventanaJuego.getpN().getNum3().setText("" + op.verSecuencia(2));
					ventanaJuego.getpN().getNum4().setText("" + op.verSecuencia(3));
				}
			};
			TimerTask tarea2 = new TimerTask() {
				public void run() {
					ventanaJuego.getpN().getNum1().setText("");
					ventanaJuego.getpN().getNum2().setText("");
					ventanaJuego.getpN().getNum3().setText("");
					ventanaJuego.getpN().getNum4().setText("");
				}
			};
			// Escribe en la parte superior los números generados
			int i = 0;
			while(i <= 1) {
				if(i == 0) {
					timer.scheduleAtFixedRate(tarea, 1000, 3000);
				}else if(i == 1) {
					timer.scheduleAtFixedRate(tarea2, 2000, 3000);
				}
				i++;
			}
			// Activa los botones para seguir la secuencia
			ventanaJuego.getpS().getColorV().setEnabled(true);
			ventanaJuego.getpS().getColorR().setEnabled(true);
			ventanaJuego.getpS().getColorA().setEnabled(true);
			ventanaJuego.getpS().getColorAz().setEnabled(true);

		} else if (e.getActionCommand().equals("verde")) {

		} else if (e.getActionCommand().equals("rojo")) {

		} else if (e.getActionCommand().equals("amarillo")) {

		} else if (e.getActionCommand().equals("azul")) {

		}
	}
}
