package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoTxt;
import co.edu.unbosque.model.persistence.Propiedades;

public class Juego extends Secuencia implements Operaciones {

	@Override
	public String crearSecuencia() {
		// TODO Auto-generated method stub
		ArchivoTxt arch = new ArchivoTxt();
		generarNumeros();
		String secuencia = devolverArreglo();
		arch.escribirArchivo(secuencia);
		return secuencia;
	}

	@Override
	public void gestionarPropiedades() {
		// TODO Auto-generated method stub
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
	}

	@Override
	public String verPropiedades(String clave) {
		// TODO Auto-generated method stub
		Propiedades prop = new Propiedades();
		return prop.leerPropiedades(clave);
	}

	@Override
	public int verSecuencia(int posicion) {
		// TODO Auto-generated method stub
		ArchivoTxt arch = new ArchivoTxt();
		String secuencia= arch.leerArchivo();
		String numero = String.valueOf(secuencia.charAt(posicion));
		return Integer.parseInt(numero);
	}

	@Override
	public String verSecuencia(long posicion) {
		// TODO Auto-generated method stub
		ArchivoTxt arch = new ArchivoTxt();
		String secuencia= arch.leerArchivo();
		String numero = String.valueOf(secuencia.charAt((int) posicion));
		return numero;
	}

	
}
