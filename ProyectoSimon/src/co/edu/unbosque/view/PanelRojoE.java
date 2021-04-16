package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelRojoE extends JPanel{

	private JLabel color1;
	private JLabel colorCambiar;
	private JLabel color2;
	private JLabel color3;
	
	public PanelRojoE() {
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(false);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		Icon imgVA,imgRE,imgAA,imgAzA;
		imgVA = new ImageIcon(getClass().getResource("/imagen/verdeApagado.jpg"));
		imgRE = new ImageIcon(getClass().getResource("/imagen/rojoEncendido.jpg"));
		imgAA = new ImageIcon(getClass().getResource("/imagen/amarilloApagado.jpg"));
		imgAzA = new ImageIcon(getClass().getResource("/imagen/azulApagado.jpg"));
		
		color1 = new JLabel(imgVA);
		add(color1);
		
		//se pone el rojo encendido
		colorCambiar = new JLabel(imgRE);
		add(colorCambiar);
		
		color2 = new JLabel(imgAA);
		add(color2);
		
		color3 = new JLabel(imgAzA);
		add(color3);
	}

	public JLabel getColor1() {
		return color1;
	}

	public void setColor1(JLabel color1) {
		this.color1 = color1;
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
}
