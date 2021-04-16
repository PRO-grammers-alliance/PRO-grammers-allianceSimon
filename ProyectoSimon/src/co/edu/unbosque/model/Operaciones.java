package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public class Operaciones{
	
	//Método que retorna un String de los números generados que se guardaron en el arreglo en la clase Secuencia
	public String crearSecuencia() {
		Secuencia sec = new Secuencia();
		sec.generarNumeros();
		String secuencia = sec.devolverArreglo();
		return secuencia;
	}
	//Metodo que recibe por parámetro un String para guardar en el archivo de properties
	public void gestionarPropiedades(String numeros) {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades(numeros);
	}
	
}
