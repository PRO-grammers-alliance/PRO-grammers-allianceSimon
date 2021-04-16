package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPuntaje extends JPanel{
	
	private JLabel puntaje;
	
	public PanelPuntaje() {
		setLayout(new GridLayout(1,1));
		setBackground(new Color(15,255,0));
		setBorder(new TitledBorder("PUNTAJE"));
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		puntaje = new JLabel("Puntaje: ");
		puntaje.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
		add(puntaje);
	}

	public JLabel getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(JLabel puntaje) {
		this.puntaje = puntaje;
	}
}