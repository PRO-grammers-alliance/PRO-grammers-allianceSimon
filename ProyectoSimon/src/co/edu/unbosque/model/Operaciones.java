package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoTxt;
import co.edu.unbosque.model.persistence.Propiedades;

public class Operaciones extends Secuencia{
	
	//Método que retorna un String de los números generados que se guardaron en el arreglo en la clase Secuencia y luego en el txt
	public String crearSecuencia() {
		ArchivoTxt arch = new ArchivoTxt();
		generarNumeros();
		String secuencia = devolverArreglo();
		arch.escribirArchivo(secuencia);
		return secuencia;
	}
	//Metodo que recibe por parámetro un String para guardar en el archivo de properties
	public void gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
	}
	//Metodo que recibe por parámetro un String con la clave para buscar su valor en el archivo de properties
	public String verPropiedades(String clave) {
		Propiedades prop = new Propiedades();
		return prop.leerPropiedades(clave);
	}
	
	//Método que permite ver el número de la secuencia según la posición que se pase por parámetro
	public int verSecuencia(int posicion) {
		ArchivoTxt arch = new ArchivoTxt();
		String secuencia= arch.leerArchivo();
		String numero = String.valueOf(secuencia.charAt(posicion));
		return Integer.parseInt(numero);
	}
	
}
