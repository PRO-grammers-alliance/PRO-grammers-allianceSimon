package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public abstract class Secuencia {

	private String secuencia[];
	private Propiedades prop;
	public Secuencia() {
		prop = new Propiedades();
		int tam = Integer.parseInt(prop.leerPropiedades("secuencia"));
		secuencia = new String[tam];
	}
	
	//M�todo que genera y guarda un n�mero entero random entre 1 y 4 por cada posici�n del Arreglo 
	protected void generarNumeros() {
		for (int i = 0; i < secuencia.length; i++) {
			long numeros = Math.round(Math.random()*3+1);
			secuencia[i] = String.valueOf(numeros);
		}
	}
	//M�todo que junta en un String los n�meros en cada posici�n del arreglo
	protected String devolverArreglo() {
		String texto="";
		for (int i = 0; i < getSecuencia().length; i++) {
			texto += getSecuencia()[i];
		}
		return texto;
	}
	
	public String[] getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(String[] secuencia) {
		this.secuencia = secuencia;
	}
	
}
