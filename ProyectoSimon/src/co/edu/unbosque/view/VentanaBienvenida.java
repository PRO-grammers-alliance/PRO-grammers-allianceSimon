package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaBienvenida extends JFrame{
	
	private JLayeredPane lpane;
	private PanelDeImagen pim;
	private PanelDeInicio pi;
	
	public VentanaBienvenida() {
		setTitle("Ventana de Bienvenida");
		setPreferredSize(new Dimension(640, 482));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());//poner botones y paneles de forma automatica
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	public void inicializarComponentes() {		
		lpane = new JLayeredPane();
		getContentPane().add(lpane, BorderLayout.CENTER);
		lpane.setBounds(0, 0, 640, 482);
		
		pim = new PanelDeImagen();
		pim.setBounds(0, 0, 640, 482);
		pim.setOpaque(true);
		lpane.add(pim, new Integer(0), 0);
		
		pi = new PanelDeInicio();
		pi.setBounds(262, 228, 116, 27);
		pi.setOpaque(true);
		lpane.add(pi, new Integer(1), 0);
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}

	public PanelDeImagen getPim() {
		return pim;
	}

	public void setPim(PanelDeImagen pim) {
		this.pim = pim;
	}

	public PanelDeInicio getPi() {
		return pi;
	}

	public void setPi(PanelDeInicio pi) {
		this.pi = pi;
	}
}