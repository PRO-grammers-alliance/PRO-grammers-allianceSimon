package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDeInicio extends JPanel{
	
	private JButton btingreso;
	
	public PanelDeInicio() {
		setLayout(null);
		setVisible(true);
		InicializarComponentes();
	}
	
	public void InicializarComponentes() {
		btingreso = new JButton("JUGAR SIMON");
		btingreso.setBounds(200, 300, 200, 30);
		btingreso.setActionCommand("jugar");
		add(btingreso);
	}

	public JButton getBtingreso() {
		return btingreso;
	}

	public void setBtingreso(JButton btingreso) {
		this.btingreso = btingreso;
	}
}
