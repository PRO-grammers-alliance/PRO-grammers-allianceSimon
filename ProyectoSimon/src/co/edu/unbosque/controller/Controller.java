package co.edu.unbosque.controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import co.edu.unbosque.view.VentanaResultado;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaJuego;

public class Controller implements ActionListener {

	private VentanaBienvenida ventanaBienvenida;
	private VentanaJuego ventanaJuego;
	private VentanaResultado  ventana_r;
	private Juego op;
	private int k;
	private String[] numero_u;

	public Controller() {
		ventanaBienvenida = new VentanaBienvenida();
		ventanaJuego = new VentanaJuego();
		ventana_r = new VentanaResultado();
		op = new Juego();
		k = 0;
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaBienvenida.getPi().getBtingreso().addActionListener(this);
		ventanaJuego.getpC().getBtEmpezar().addActionListener(this);
		ventanaJuego.getpC().getBtComprobar().addActionListener(this);
		ventanaJuego.getpS().getColorV().addActionListener(this);
		ventanaJuego.getpS().getColorR().addActionListener(this);
		ventanaJuego.getpS().getColorA().addActionListener(this);
		ventanaJuego.getpS().getColorAz().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("jugar")) {
			ventanaBienvenida.setVisible(false);
			ventana_r.mostrarInfo("Bienvenido a SIMON \nEl juego consiste en repetir la secuencia de números\nque se le mostrará, cuando presione el botón de comenzar \ntiene solo un intento, si replica correctamente la secuencia ganará.\nBuena suerte!!", "informativo");
			ventanaJuego.setVisible(true);
			ventanaJuego.setTitle(op.verPropiedades("nombreJuego"));
		} else if (e.getActionCommand().equals("empezar")) {
			// Crea la secuencia de numeros y la guarda en el txt
			op.crearSecuencia();
			ventanaJuego.getpC().getBtEmpezar().setEnabled(false);
			ventanaJuego.getpC().getBtComprobar().setEnabled(true);
			
			numero_u = new String[Integer.parseInt(op.verPropiedades("secuencia"))];
			
			for (int i = 0; i < Integer.parseInt(op.verPropiedades("secuencia")); i++) {
				if (i==0) {
					ventanaJuego.getpN().getNum1().setText(""+op.verSecuencia(i));
				} else if (i==1) {
					ventanaJuego.getpN().getNum2().setText(""+op.verSecuencia(i));
				} else if (i==2) {
					ventanaJuego.getpN().getNum3().setText(""+op.verSecuencia(i));
				} else if (i==3) {
					ventanaJuego.getpN().getNum4().setText(""+op.verSecuencia(i));
				}	
			}
			
			borrar();

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
			numero_u[k]="1";
			k++;
			if(k==4) {
				ventanaJuego.getpS().getColorV().setEnabled(false);
				ventanaJuego.getpS().getColorR().setEnabled(false);
				ventanaJuego.getpS().getColorA().setEnabled(false);
				ventanaJuego.getpS().getColorAz().setEnabled(false);
			}
		} else if (e.getActionCommand().equals("rojo")) {
			numero_u[k]="2";
			k++;
			if(k==4) {
				ventanaJuego.getpS().getColorV().setEnabled(false);
				ventanaJuego.getpS().getColorR().setEnabled(false);
				ventanaJuego.getpS().getColorA().setEnabled(false);
				ventanaJuego.getpS().getColorAz().setEnabled(false);
			}
		} else if (e.getActionCommand().equals("amarillo")) {
			numero_u[k]="3";
			k++;
			if(k==4) {
				ventanaJuego.getpS().getColorV().setEnabled(false);
				ventanaJuego.getpS().getColorR().setEnabled(false);
				ventanaJuego.getpS().getColorA().setEnabled(false);
				ventanaJuego.getpS().getColorAz().setEnabled(false);
			}
		} else if (e.getActionCommand().equals("azul")) {
			numero_u[k]="4";
			k++;
			if(k==4) {
				ventanaJuego.getpS().getColorV().setEnabled(false);
				ventanaJuego.getpS().getColorR().setEnabled(false);
				ventanaJuego.getpS().getColorA().setEnabled(false);
				ventanaJuego.getpS().getColorAz().setEnabled(false);
			}
		}else if (e.getActionCommand().equals("terminar")) {
			ventanaJuego.setVisible(false);
			validarGanador();
			k=0;
			ventanaBienvenida.setVisible(true);
			ventanaJuego.getpS().getColorV().setEnabled(false);
			ventanaJuego.getpS().getColorV().setBackground(new Color(38,152,22));
			ventanaJuego.getpS().getColorR().setEnabled(false);
			ventanaJuego.getpS().getColorR().setBackground(new Color(197,12,12));
			ventanaJuego.getpS().getColorA().setEnabled(false);
			ventanaJuego.getpS().getColorA().setBackground(new Color(197,197,12));
			ventanaJuego.getpS().getColorAz().setEnabled(false);
			ventanaJuego.getpS().getColorAz().setBackground(new Color(16,91,158));
			ventanaJuego.getpC().getBtEmpezar().setVisible(true);

		}
	}
	
	public void borrar() {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	    Runnable tarea1 = ()->ventanaJuego.getpN().getNum1().setText("");
	    Runnable tarea2 = ()-> ventanaJuego.getpN().getNum2().setText("");
	    Runnable tarea3 = ()-> ventanaJuego.getpN().getNum3().setText("");
	    Runnable tarea4 = ()-> ventanaJuego.getpN().getNum4().setText("");
	    service.scheduleAtFixedRate(tarea1, 2, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea2, 2, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea3, 2, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea4, 2, 1, TimeUnit.SECONDS);
	}
	public void validarGanador() {
		int contador = 0;
		for(long i=0;i<op.getSecuencia().length;i++){
			for(int j = 0; j<numero_u.length;j++) {
				if(i==j) {
					if(op.verSecuencia(i).equals(numero_u[j])) {
							contador++;
					 }
				}
			}
		}
		if(contador==4) {
			ventana_r.mostrarInfo("¡¡¡Felicidades ganaste!!!", "informativo");
		}else {
			ventana_r.mostrarInfo("Lo siento la secuencia era : \n"+op.verSecuencia(0)+" "+op.verSecuencia(1)+" "+op.verSecuencia(2)+" "+op.verSecuencia(3), "error");
		}
	}
}
