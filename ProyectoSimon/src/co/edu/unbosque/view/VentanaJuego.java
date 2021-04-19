package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaJuego extends JFrame{

	private PanelNumeros pN;
	private PanelComprobar pC;
	private PanelSimon pS;
	
	public VentanaJuego() {
		setTitle("");
		setPreferredSize(new Dimension(640, 482));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());//poner botones y paneles de forma automatica
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		pN = new PanelNumeros();
		getContentPane().add(pN, BorderLayout.NORTH);
		
		pC = new PanelComprobar();
		getContentPane().add(pC, BorderLayout.SOUTH);
		
		pS = new PanelSimon();
		getContentPane().add(pS, BorderLayout.CENTER);
		
		
	}

	public PanelComprobar getpC() {
		return pC;
	}

	public void setpC(PanelComprobar pC) {
		this.pC = pC;
	}

	public PanelNumeros getpN() {
		return pN;
	}

	public void setpN(PanelNumeros pN) {
		this.pN = pN;
	}

	public PanelSimon getpS() {
		return pS;
	}

	public void setpS(PanelSimon pS) {
		this.pS = pS;
	}


}