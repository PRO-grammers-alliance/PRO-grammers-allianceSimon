package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSimon extends JPanel{
	
	private JLabel color1, color1_1;
	private JLabel color2, color2_1;
	private JLabel color3, color3_1;
	private JLabel color4, color4_1;
	
	public PanelSimon(){
		setLayout(new GridLayout(2,2));
		setBackground(new Color(108,102,97));
		setBorder(new TitledBorder("SIMON"));
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {	
		Icon imgVA,imgVE,imgRA,imgRE,imgAA,imgAE,imgAzA,imgAzE;
		imgVA = new ImageIcon(getClass().getResource("/imagen/verdeApagado.jpg"));
		imgVE = new ImageIcon(getClass().getResource("/imagen/verdeEncendido.jpg"));
		
		imgRA = new ImageIcon(getClass().getResource("/imagen/rojoApagado.jpg"));
		imgRE = new ImageIcon(getClass().getResource("/imagen/rojoEncendido.jpg"));
		
		imgAA = new ImageIcon(getClass().getResource("/imagen/amarilloApagado.jpg"));
		imgAE = new ImageIcon(getClass().getResource("/imagen/amarilloEncendido.jpg"));
		
		imgAzA = new ImageIcon(getClass().getResource("/imagen/azulApagado.jpg"));
		imgAzE = new ImageIcon(getClass().getResource("/imagen/azulEncendido.jpg"));
		
		color1 = new JLabel(imgVA);
		add(color1);
		color1_1 = new JLabel(imgVE);
		
		color2 = new JLabel();
		color2.setIcon(imgRA);
		add(color2);
		color2_1 = new JLabel(imgRE);
		
		color3 = new JLabel();
		color3.setIcon(imgAA);
		add(color3);
		color3_1 = new JLabel(imgAE);
		
		color4 = new JLabel();
		color4.setIcon(imgAzA);
		add(color4);
		color4_1 = new JLabel(imgAzE);
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

	public JLabel getColor4() {
		return color4;
	}

	public void setColor4(JLabel color4) {
		this.color4 = color4;
	}

	public JLabel getColor1_1() {
		return color1_1;
	}

	public void setColor1_1(JLabel color1_1) {
		this.color1_1 = color1_1;
	}

	public JLabel getColor2_1() {
		return color2_1;
	}

	public void setColor2_1(JLabel color2_1) {
		this.color2_1 = color2_1;
	}

	public JLabel getColor3_1() {
		return color3_1;
	}

	public void setColor3_1(JLabel color3_1) {
		this.color3_1 = color3_1;
	}

	public JLabel getColor4_1() {
		return color4_1;
	}

	public void setColor4_1(JLabel color4_1) {
		this.color4_1 = color4_1;
	}
}
