package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDeInicio extends JPanel{
	
	private JButton btingreso;
	
	public PanelDeInicio() {
		setLayout(new GridLayout(1,1,5,5));
		InicializarComponentes();
	}
	
	public void InicializarComponentes() {
		btingreso = new JButton("JUGAR SIMON");
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
