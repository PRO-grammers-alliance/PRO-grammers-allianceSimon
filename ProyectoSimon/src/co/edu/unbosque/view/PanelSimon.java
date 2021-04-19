package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSimon extends JPanel{
	
	private JButton colorV;
	private JButton colorR;
	private JButton colorA;
	private JButton colorAz;
	private ImageIcon uno1;
	private ImageIcon dos2;
	private ImageIcon tres3;
	private ImageIcon cuatro4;
	
	public PanelSimon(){
		uno1 = new ImageIcon(getClass().getResource("/imagen/verdeEncendido1.jpg"));
		dos2 = new ImageIcon(getClass().getResource("/imagen/rojoEncendido2.jpg"));
		tres3 = new ImageIcon(getClass().getResource("/imagen/amarilloEncendido3.jpg"));
		cuatro4 = new ImageIcon(getClass().getResource("/imagen/azulEncendido4.jpg"));
		setLayout(new GridLayout(2,2,5,5));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(true);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {		
		colorV = new JButton("1");
		colorV.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 50));
		colorV.setBackground(new Color(38,152,22));
		colorV.setEnabled(false);
		colorV.setActionCommand("verde");
		add(colorV);
		
		colorR = new JButton("2");
		colorR.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 50));
		colorR.setBackground(new Color(197,12,12));
		colorR.setEnabled(false);
		colorR.setActionCommand("rojo");
		add(colorR);
		
		colorA = new JButton("3");
		colorA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 50));
		colorA.setBackground(new Color(197,197,12));
		colorA.setEnabled(false);
		colorA.setActionCommand("amarillo");
		add(colorA);
		
		colorAz = new JButton("4");
		colorAz.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 50));
		colorAz.setBackground(new Color(16,91,158));
		colorAz.setEnabled(false);
		colorAz.setActionCommand("azul");
		add(colorAz);
		
		
	}

	public JButton getColorV() {
		return colorV;
	}

	public void setColorV(JButton colorV) {
		this.colorV = colorV;
	}

	public JButton getColorR() {
		return colorR;
	}

	public void setColorR(JButton colorR) {
		this.colorR = colorR;
	}

	public JButton getColorA() {
		return colorA;
	}

	public void setColorA(JButton colorA) {
		this.colorA = colorA;
	}

	public JButton getColorAz() {
		return colorAz;
	}

	public void setColorAz(JButton colorAz) {
		this.colorAz = colorAz;
	}

	public ImageIcon getUno1() {
		return uno1;
	}

	public void setUno1(ImageIcon uno1) {
		this.uno1 = uno1;
	}

	public ImageIcon getDos2() {
		return dos2;
	}

	public void setDos2(ImageIcon dos2) {
		this.dos2 = dos2;
	}

	public ImageIcon getTres3() {
		return tres3;
	}

	public void setTres3(ImageIcon tres3) {
		this.tres3 = tres3;
	}

	public ImageIcon getCuatro4() {
		return cuatro4;
	}

	public void setCuatro4(ImageIcon cuatro4) {
		this.cuatro4 = cuatro4;
	}
	
}