package co.edu.unbosque.view;

import java.awt.Color;
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
	
	public PanelSimon(){
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		setVisible(true);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		Icon imgVA,imgRA,imgAA,imgAzA,imgVE,imgRE,imgAE,imgAzE;
		imgVA = new ImageIcon(getClass().getResource("/imagen/verdeApagado.jpg"));	
		imgRA = new ImageIcon(getClass().getResource("/imagen/rojoApagado.jpg"));
		imgAA = new ImageIcon(getClass().getResource("/imagen/amarilloApagado.jpg"));	
		imgAzA = new ImageIcon(getClass().getResource("/imagen/azulApagado.jpg"));
		imgVE = new ImageIcon(getClass().getResource("/imagen/verdeEncendido.jpg"));
		imgRE = new ImageIcon(getClass().getResource("/imagen/rojoEncendido.jpg"));
		imgAE = new ImageIcon(getClass().getResource("/imagen/amarilloEncendido.jpg"));
		imgAzE = new ImageIcon(getClass().getResource("/imagen/azulEncendido.jpg"));
		
		colorV = new JButton();
		colorV.setIcon(imgVE);
		colorV.setDisabledIcon(imgVA);
		colorV.setEnabled(false);
		colorV.setActionCommand("verde");
		add(colorV);
		
		colorR = new JButton();
		colorR.setIcon(imgRE);
		colorR.setDisabledIcon(imgRA);
		colorR.setEnabled(false);
		colorR.setActionCommand("rojo");
		add(colorR);
		
		colorA = new JButton();
		colorA.setIcon(imgAE);
		colorA.setDisabledIcon(imgAA);
		colorA.setEnabled(false);
		colorA.setActionCommand("amarillo");
		add(colorA);
		
		colorAz = new JButton();
		colorAz.setIcon(imgAzE);
		colorAz.setDisabledIcon(imgAzA);
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

}