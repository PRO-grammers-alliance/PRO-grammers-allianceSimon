package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
=======
>>>>>>> branch 'master' of https://github.com/PRO-grammers-alliance/Simon1.git

import co.edu.unbosque.view.VentanaResultado;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaJuego;

public class Controller implements ActionListener {

	private VentanaBienvenida ventanaBienvenida;
	private VentanaJuego ventanaJuego;
	private VentanaResultado  ventana_r;
	private Juego op;
	private int i;
	private String[] numero_u;

	public Controller() {
		ventanaBienvenida = new VentanaBienvenida();
		ventanaJuego = new VentanaJuego();
		ventana_r = new VentanaResultado();
		op = new Juego();
		i =0;
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
			ventana_r.mostrarInfo("Bienvenido a SIMON \nEl juego consiste en repetir la secuencia de numeros\nque se le mostrara, cuando presione el boton de comenzar,\ntiene solo un intento si repilica correctamente la secuencia ganara.\nBuena suerte!!", "informativo");
			ventanaJuego.setVisible(true);
		} else if (e.getActionCommand().equals("empezar")) {
			// Crea la secuencia de numeros y la guarda en el txt
			op.gestionarPropiedades();
			ventanaJuego.setTitle(op.verPropiedades("nombreJuego"));
			op.crearSecuencia();
<<<<<<< HEAD
			ventanaJuego.getpC().getBtEmpezar().setVisible(false);
			
			numero_u = new String[Integer.parseInt(op.verPropiedades("secuencia"))];
=======

>>>>>>> branch 'master' of https://github.com/PRO-grammers-alliance/Simon1.git
			for (int i = 0; i < Integer.parseInt(op.verPropiedades("secuencia")); i++) {
				if (i==0) {
					ventanaJuego.getpN().getNum1().setText(""+op.verSecuencia(i));
					
					
					System.out.println(op.verSecuencia(i));
					
				} else if (i==1) {
					ventanaJuego.getpN().getNum2().setText(""+op.verSecuencia(i));
					
					System.out.println(op.verSecuencia(i));
					
				} else if (i==2) {
					ventanaJuego.getpN().getNum3().setText(""+op.verSecuencia(i));
					System.out.println(op.verSecuencia(i));
					
				} else if (i==3) {
					ventanaJuego.getpN().getNum4().setText(""+op.verSecuencia(i));
<<<<<<< HEAD
				}	
=======
					
					System.out.println(op.verSecuencia(i));
					
				}
>>>>>>> branch 'master' of https://github.com/PRO-grammers-alliance/Simon1.git
			}
<<<<<<< HEAD
			
			borrar();

=======
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				ventanaJuego.getpN().getNum1().setText("");
				ventanaJuego.getpN().getNum2().setText("");
				ventanaJuego.getpN().getNum3().setText("");
				ventanaJuego.getpN().getNum4().setText("");
			}
			
>>>>>>> branch 'master' of https://github.com/PRO-grammers-alliance/Simon1.git
			// Activa los botones para seguir la secuencia
			ventanaJuego.getpS().getColorV().setEnabled(true);
			ventanaJuego.getpS().getColorV().setIcon(ventanaJuego.getpS().getUno1());
			ventanaJuego.getpS().getColorR().setEnabled(true);
			ventanaJuego.getpS().getColorR().setIcon(ventanaJuego.getpS().getDos2());
			ventanaJuego.getpS().getColorA().setEnabled(true);
			ventanaJuego.getpS().getColorA().setIcon(ventanaJuego.getpS().getTres3());
			ventanaJuego.getpS().getColorAz().setEnabled(true);
			ventanaJuego.getpS().getColorAz().setIcon(ventanaJuego.getpS().getCuatro4());

		} else if (e.getActionCommand().equals("verde")) {
			numero_u[i]="1";
			i++;
		} else if (e.getActionCommand().equals("rojo")) {
			numero_u[i]="2";
			i++;
		} else if (e.getActionCommand().equals("amarillo")) {
			numero_u[i]="3";
			i++;
		} else if (e.getActionCommand().equals("azul")) {
			numero_u[i]="4";
			i++;
		}else if (e.getActionCommand().equals("terminar")) {
			System.out.println("termine");
			ventanaJuego.setVisible(false);
			validarGanador();
			i=0;
			ventanaBienvenida.setVisible(true);
			ventanaJuego.getpS().getColorV().setEnabled(false);
			ventanaJuego.getpS().getColorV().setIcon(null);
			ventanaJuego.getpS().getColorR().setEnabled(false);
			ventanaJuego.getpS().getColorR().setIcon(null);
			ventanaJuego.getpS().getColorA().setEnabled(false);
			ventanaJuego.getpS().getColorA().setIcon(null);
			ventanaJuego.getpS().getColorAz().setEnabled(false);
			ventanaJuego.getpS().getColorAz().setIcon(null);
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
		for(int i=0;i<op.getSecuencia().length;i++){
			for(int j = 0; j<numero_u.length;j++) {
				if(i==j) {
					System.out.println(op.verSecuencia(i)+" - "+numero_u[j]+" = "+contador);
					if(op.verSecuencia1(i).equals(numero_u[j])) {
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
