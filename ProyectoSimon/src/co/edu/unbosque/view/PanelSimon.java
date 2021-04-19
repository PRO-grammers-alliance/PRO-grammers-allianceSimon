package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSimon extends JPanel{
	
	private JButton colorV;
	private JButton colorR;
	private JButton colorA;
	private JButton colorAz;
	
	public PanelSimon(){
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
	
}
