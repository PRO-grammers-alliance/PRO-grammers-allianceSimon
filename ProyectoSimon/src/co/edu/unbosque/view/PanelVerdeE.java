package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelVerdeE extends JPanel{
	
	private JLabel colorCambiar;
	private JLabel color2;
	private JLabel color3;
	private JLabel color4;
	
	public PanelVerdeE() {
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(false);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		Icon imgVE,imgRA,imgAA,imgAzA;
		imgVE = new ImageIcon(getClass().getResource("/imagen/verdeEncendido.jpg"));
		imgRA = new ImageIcon(getClass().getResource("/imagen/rojoApagado.jpg"));
		imgAA = new ImageIcon(getClass().getResource("/imagen/amarilloApagado.jpg"));
		imgAzA = new ImageIcon(getClass().getResource("/imagen/azulApagado.jpg"));
		
		//se pone el verde encendido
		colorCambiar = new JLabel(imgVE);
		add(colorCambiar);
		
		color2 = new JLabel(imgRA);
		add(color2);
		
		color3 = new JLabel(imgAA);
		add(color3);
		
		color4 = new JLabel(imgAzA);
		add(color4);
	}

	public JLabel getColorCambiar() {
		return colorCambiar;
	}

	public void setColorCambiar(JLabel colorCambiar) {
		this.colorCambiar = colorCambiar;
	}

	public JLabel getColor2() {
		return color2;
	}

	public void setColor2(JLabel color2) {
		this.color2 = color2;
	}

	public JLabel getColor3() {
		return color3;
	}

	public void setColor3(JLabel color3) {
		this.color3 = color3;
	}

	public JLabel getColor4() {
		return color4;
	}

	public void setColor4(JLabel color4) {
		this.color4 = color4;
	}
}
