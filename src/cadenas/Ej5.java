package cadenas;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Creo la variable frase de tipo String para almacenar una frase
		String frase;
		//Creo la variable invierte para llamar la funcion y pasarle el parámetro frase
		String invierte;
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa una frase o palabra: ");
		frase = sc.nextLine();
		
		invierte = Ej5.invertida(frase);
		
		System.out.println("Tu frase invertida es: " + invierte);

	}
	
	
	public static String invertida (String frase) {
		
		String palabInvertida="";
		
		for(int i= frase.length()-1; i>=0; i--) {
			palabInvertida += frase.charAt(i);
		}
		
		return palabInvertida;
		
	}
	
	

}
