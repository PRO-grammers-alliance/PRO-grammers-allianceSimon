package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelComprobar extends JPanel{
	
	private JButton btComprobar;
	private JButton btEmpezar;
	
	public PanelComprobar() {
		setLayout(new GridLayout(1,1));
		setBorder(new TitledBorder("ACCION"));
		setBackground(new Color(184,211,162));
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		btEmpezar = new JButton("EMPEZAR");
		btEmpezar.setActionCommand("empezar");
		add(btEmpezar);
		
		btComprobar = new JButton("TERMINAR");
		btComprobar.setActionCommand("terminar");
		btComprobar.setEnabled(false);
		add(btComprobar);
	}

	public JButton getBtComprobar() {
		return btComprobar;
	}

	public void setBtComprobar(JButton btComprobar) {
		this.btComprobar = btComprobar;
	}

	public JButton getBtEmpezar() {
		return btEmpezar;
	}

	public void setBtEmpezar(JButton btEmpezar) {
		this.btEmpezar = btEmpezar;
	}
}
