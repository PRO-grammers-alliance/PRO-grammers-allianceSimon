package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaBienvenida extends JFrame {

	private PanelDeImagen pim;
	private PanelDeInicio pi;
	private JLayeredPane lpane;
	
	public VentanaBienvenida() {
		
		setTitle("SIMON");
		setPreferredSize(new Dimension(615,435));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		
		
	}
	
	public void inicializarComponentes() {
		lpane = new JLayeredPane();
		getContentPane().add(lpane,BorderLayout.CENTER);
		lpane.setBounds(0, 0, 600, 400);
		
		pim = new PanelDeImagen();
		pim.setBounds(0, 0, 600, 400);
		pim.setOpaque(true);
		lpane.add(pim);
		
		pi = new PanelDeInicio();
		pi.setBounds(0, 0, 600, 400);
		pi.setOpaque(false);
		lpane.add(pi);
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

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}

	
}
