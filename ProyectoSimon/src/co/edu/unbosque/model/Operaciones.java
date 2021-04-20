package co.edu.unbosque.model;


public interface Operaciones  {
	
	//Método que retorna un String de los números generados que se guardaron en el arreglo en la clase Secuencia y luego en el txt
	public abstract String crearSecuencia();
		
	//Metodo que recibe por parámetro un String para guardar en el archivo de properties
	public abstract void gestionarPropiedades(); 
		
	//Metodo que recibe por parámetro un String con la clave para buscar su valor en el archivo de properties
	public abstract String verPropiedades(String clave); 
	
	//Método que permite ver el número de la secuencia según la posición que se pase por parámetro
	public abstract int verSecuencia(int posicion); 
	
	//metodo que davuelve el arreglo en String
	public abstract String verSecuencia(long posicion); 	
}
