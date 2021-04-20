package co.edu.unbosque.model;


public interface Operaciones  {
	
	//M�todo que retorna un String de los n�meros generados que se guardaron en el arreglo en la clase Secuencia y luego en el txt
	public abstract String crearSecuencia();
		
	//Metodo que recibe por par�metro un String para guardar en el archivo de properties
	public abstract void gestionarPropiedades(); 
		
	//Metodo que recibe por par�metro un String con la clave para buscar su valor en el archivo de properties
	public abstract String verPropiedades(String clave); 
	
	//M�todo que permite ver el n�mero de la secuencia seg�n la posici�n que se pase por par�metro
	public abstract int verSecuencia(int posicion); 
	
	//metodo que davuelve el arreglo en String
	public abstract String verSecuencia(long posicion); 	
}
