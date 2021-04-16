package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public class Operaciones {
	
	public String crearSecuencia() {
		Secuencia sec = new Secuencia();
		sec.generarNumeros();
		String secuencia = sec.devolverArreglo();
		return secuencia;
	}
	
	public void gestionarPropiedades(String numeros) {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades(numeros);
	}
	
}
