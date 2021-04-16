package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelAzulE extends JPanel{

	private JLabel color1;
	private JLabel color2;
	private JLabel color3;
	private JLabel colorCambiar;
	
	public PanelAzulE() {
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(false);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		Icon imgVA,imgRA,imgAA,imgAzE;
		imgVA = new ImageIcon(getClass().getResource("/imagen/verdeApagado.jpg"));
		imgRA = new ImageIcon(getClass().getResource("/imagen/rojoApagado.jpg"));
		imgAA = new ImageIcon(getClass().getResource("/imagen/amarilloApagado.jpg"));
		imgAzE = new ImageIcon(getClass().getResource("/imagen/azulEncendido.jpg"));
		
		color1 = new JLabel(imgVA);
		add(color1);
		
		color2 = new JLabel(imgRA);
		add(color2);
		
		color3 = new JLabel(imgAA);
		add(color3);
		
		//se pone azul encendido
		colorCambiar = new JLabel(imgAzE);
		add(colorCambiar);
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

	public JLabel getColor3() {
		return color3;
	}

	public void setColor3(JLabel color3) {
		this.color3 = color3;
	}

	public JLabel getColorCambiar() {
		return colorCambiar;
	}

	public void setColorCambiar(JLabel colorCambiar) {
		this.colorCambiar = colorCambiar;
	}
}
