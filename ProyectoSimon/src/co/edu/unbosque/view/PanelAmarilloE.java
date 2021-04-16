package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelAmarilloE extends JPanel{

	private JLabel color1;
	private JLabel color2;
	private JLabel colorCambiar;
	private JLabel color3;
	
	public PanelAmarilloE() {
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(false);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		Icon imgVA,imgRA,imgAE,imgAzA;
		imgVA = new ImageIcon(getClass().getResource("/imagen/verdeApagado.jpg"));
		imgRA = new ImageIcon(getClass().getResource("/imagen/rojoApagado.jpg"));
		imgAE = new ImageIcon(getClass().getResource("/imagen/amarilloEncendido.jpg"));
		imgAzA = new ImageIcon(getClass().getResource("/imagen/azulApagado.jpg"));
		
		color1 = new JLabel(imgVA);
		add(color1);
		
		color2 = new JLabel(imgRA);
		add(color2);
		
		//se pone el amarillo encendido
		colorCambiar = new JLabel(imgAE);
		add(colorCambiar);
		
		color3 = new JLabel(imgAzA);
		add(color3);
	}

	public JLabel getColor1() {
		return color1;
	}

	public void setColor1(JLabel color1) {
		this.color1 = color1;
	}

	public JLabel getColor2() {
		return color2;
	}

	public void setColor2(JLabel color2) {
		this.color2 = color2;
	}

	public JLabel getColorCambiar() {
		return colorCambiar;
	}

	public void setColorCambiar(JLabel colorCambiar) {
		this.colorCambiar = colorCambiar;
	}

	public JLabel getColor3() {
		return color3;
	}

	public void setColor3(JLabel color3) {
		this.color3 = color3;
	}
}
