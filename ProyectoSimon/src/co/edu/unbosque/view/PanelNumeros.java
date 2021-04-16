package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelNumeros extends JPanel{
	
	private JLabel texto;
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	
	public PanelNumeros() {
		setLayout(new GridLayout(1,5,20,0));
		setBackground(new Color(226,133,51));
		setBorder(new TitledBorder("Ingreso Datos"));
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		texto = new JLabel("Numero");
		texto.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
		add(texto);
		
		num1 = new JButton();
		add(num1);
		
		num2 = new JButton();
		add(num2);
		
		num3 = new JButton();
		add(num3);
		
		num4 = new JButton();
		add(num4);
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JButton getNum1() {
		return num1;
	}

	public void setNum1(JButton num1) {
		this.num1 = num1;
	}

	public JButton getNum2() {
		return num2;
	}

	public void setNum2(JButton num2) {
		this.num2 = num2;
	}

	public JButton getNum3() {
		return num3;
	}

	public void setNum3(JButton num3) {
		this.num3 = num3;
	}

	public JButton getNum4() {
		return num4;
	}

	public void setNum4(JButton num4) {
		this.num4 = num4;
	}
}