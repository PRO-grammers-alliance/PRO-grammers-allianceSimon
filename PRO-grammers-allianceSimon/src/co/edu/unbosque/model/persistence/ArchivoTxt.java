package co.edu.unbosque.model.persistence;

import java.io.*;

import co.edu.unbosque.model.Secuencia;


public class ArchivoTxt extends Secuencia {

	private String archivodata = ".\\Data\\secuencia.txt";
	public ArchivoTxt() {
	}
	
	public int escribirArchivo(String dato) {
		File f = new File(this.archivodata);// f-> carga el archivo
		
		try {
			FileWriter fw = new FileWriter(f); //fw->crea un flujo desde f
			PrintWriter pw = new PrintWriter(fw); //pw->permite la escritura en el archivo
			
			pw.println(dato); //se escribe el contenido del parametro dato en el archivo
			
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea  = "";
		String cadena = "";
		File f = new File(this.archivodata); // f->carga el archivo
		
		try {
			FileReader fr = new FileReader(f); //fr-> crea el flujo desde f
			BufferedReader br = new BufferedReader(fr); //
			linea = br.readLine(); // linea toma el valor de la primera linea
			for(int i = 0;i<getSecuencia().length;i++) { // mientras haya datos por leer en el archivo	
				cadena += linea+"";	// acumular en cadena lo leido en linea
				linea = br.readLine(); // lee el valor de la siguente linea
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
	

	public String getArchivodata() {
		return archivodata;
	}

	public void setArchivodata(String archivodata) {
		this.archivodata = archivodata;
	}

}
