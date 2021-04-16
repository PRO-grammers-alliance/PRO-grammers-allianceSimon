package co.edu.unbosque.model;

public class Secuencia {

	private String secuencia[];
	
	public Secuencia() {
		secuencia = new String[4];
	}
	
	//Método que genera y guarda un número entero random entre 1 y 4 por cada posición del Arreglo 
	protected void generarNumeros() {
		for (int i = 0; i < secuencia.length; i++) {
			long numeros = Math.round(Math.random()*3+1);
			secuencia[i] = String.valueOf(numeros);
		}
	}
	//Método que junta en un String los números en cada posición del arreglo
	protected String devolverArreglo() {
		String texto="";
		for (int i = 0; i < getSecuencia().length; i++) {
			if(i==getSecuencia().length-1) {
				texto += getSecuencia()[i];
			}else {
				texto += getSecuencia()[i] + " ";
			}
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
