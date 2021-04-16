package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public class Operaciones{
	
	//M�todo que retorna un String de los n�meros generados que se guardaron en el arreglo en la clase Secuencia
	public String crearSecuencia() {
		Secuencia sec = new Secuencia();
		sec.generarNumeros();
		String secuencia = sec.devolverArreglo();
		return secuencia;
	}
	//Metodo que recibe por par�metro un String para guardar en el archivo de properties
	public void gestionarPropiedades(String numeros) {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades(numeros);
	}
	
	//M�todo que permite ver el n�mero de la secuencia seg�n la posici�n que se pase por par�metro
	public int verSecuencia(int posicion) {
		Propiedades prop = new Propiedades();
		String secuencia = prop.leerPropiedades("secuencia");
		String numero = String.valueOf(secuencia.charAt(posicion));
		return Integer.parseInt(numero);
	}
}
