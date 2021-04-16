package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class VentanaJuego extends JFrame{

	private PanelNumeros pN;
	private PanelPuntaje pP;
	private PanelComprobar pC;
	private PanelSimon pS;
	private PanelVerdeE pVE;
	private PanelRojoE pRE;
	private PanelAmarilloE pAE;
	private PanelAzulE pAzE;
	
	public VentanaJuego() {
		setTitle("Simon");
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
		
		pP = new PanelPuntaje();
		getContentPane().add(pP, BorderLayout.WEST);
		
		pC = new PanelComprobar();
		getContentPane().add(pC, BorderLayout.SOUTH);
		
		pS = new PanelSimon();
		getContentPane().add(pS, BorderLayout.CENTER);
		
		pVE = new PanelVerdeE();
		
		pRE = new PanelRojoE();
		
		pAE = new PanelAmarilloE();
		
		pAzE = new PanelAzulE();
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

	public PanelPuntaje getpP() {
		return pP;
	}

	public void setpP(PanelPuntaje pP) {
		this.pP = pP;
	}

	public PanelSimon getpS() {
		return pS;
	}

	public void setpS(PanelSimon pS) {
		this.pS = pS;
	}

	public PanelVerdeE getpVE() {
		return pVE;
	}

	public void setpVE(PanelVerdeE pVE) {
		this.pVE = pVE;
	}

	public PanelRojoE getpRE() {
		return pRE;
	}

	public void setpRE(PanelRojoE pRE) {
		this.pRE = pRE;
	}

	public PanelAmarilloE getpAE() {
		return pAE;
	}

	public void setpAE(PanelAmarilloE pAE) {
		this.pAE = pAE;
	}

	public PanelAzulE getpAzE() {
		return pAzE;
	}

	public void setpAzE(PanelAzulE pAzE) {
		this.pAzE = pAzE;
	}
}