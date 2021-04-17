package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelNumeros extends JPanel{
	
	private JLabel texto;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	
	public PanelNumeros() {
		setLayout(new GridLayout(1,5,20,0));
		setBackground(new Color(226,133,51));
		setBorder(new TitledBorder("Patron"));
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		texto = new JLabel("Numero");
		texto.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
		add(texto);
		
		num1 = new JTextField("");
		num1.setBackground(new Color(162,162,162));
		num1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
		num1.setHorizontalAlignment(JTextField.CENTER);
		num1.setEditable(false);
		add(num1);
		
		num2 = new JTextField("");
		num2.setBackground(new Color(162,162,162));
		num2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
		num2.setHorizontalAlignment(JTextField.CENTER);
		num2.setEditable(false);
		add(num2);
		
		num3 = new JTextField("");
		num3.setBackground(new Color(162,162,162));
		num3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
		num3.setHorizontalAlignment(JTextField.CENTER);
		num3.setEditable(false);
		add(num3);
		
		num4 = new JTextField("");
		num4.setBackground(new Color(162,162,162));
		num4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
		num4.setHorizontalAlignment(JTextField.CENTER);
		num4.setEditable(false);
		add(num4);
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JTextField getNum1() {
		return num1;
	}

	public void setNum1(JTextField num1) {
		this.num1 = num1;
	}

	public JTextField getNum2() {
		return num2;
	}

	public void setNum2(JTextField num2) {
		this.num2 = num2;
	}

	public JTextField getNum3() {
		return num3;
	}

	public void setNum3(JTextField num3) {
		this.num3 = num3;
	}

	public JTextField getNum4() {
		return num4;
	}

	public void setNum4(JTextField num4) {
		this.num4 = num4;
	}

}