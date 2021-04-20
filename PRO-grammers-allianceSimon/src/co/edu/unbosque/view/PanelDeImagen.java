package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelDeImagen extends JPanel {
	
	private ImageIcon im;
	
	public PanelDeImagen() {
		
	}
	
	public void paint (Graphics g) {
		Dimension tam = getSize();
		ImageIcon im = new ImageIcon(getClass().getResource("/imagen/bv.jpg"));
		g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paint(g);
	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}
}
