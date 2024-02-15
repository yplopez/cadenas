package cadenas;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Creo la variable frase de tipo String para almacenar una frase
		String frase;
		//Creo la variable invierte para llamar la funcion y pasarle el parámetro frase
		String invierte;
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		//Pido al usuario que ingrese una frase
		System.out.println("Ingresa una frase: ");
		//Capturo la información ingresada
		frase = sc.nextLine();
		//Llamo la función y le paso la variable frase como parámetro
		invierte = Ej5.invertida(frase);
		//Muestro en consola la frase invertida.
		System.out.println("Tu frase invertida es: " + invierte);

	}
	
	//Creo una función de tipo String que retorna un String
	public static String invertida (String frase) {
		//Creo una variable para almacenar la frase invertida
		String palabInvertida="";
		
		for(int i= frase.length()-1; i>=0; i--) {
			palabInvertida += frase.charAt(i);
		}
		
		return palabInvertida;
		
	}
	
	

}
