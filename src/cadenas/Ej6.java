package cadenas;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//Creo la variable palabra de tipo string para almacenar cada palabra ingresada
		String palabra = "";
		
		//Creo la variable grupoPalabras para almacenar la frase resultante de la concatenación de palabras
		String grupoPalabras = "";

		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		//Creo un while para controlar que cuando se ingrese la palabra fin termine el programa
		//usando la función equalsIgnoreCase
		while (!palabra.equalsIgnoreCase("fin")) {			

			//Pido las palabras al usuario.
			System.out.println("Escriba una palabra: ");
			
			//Almaceno las palabras
			palabra = sc.next();
			
			//Evaluo que no aparezca la palabra fin para no concatenar la palabra fin a la cadena
			if(!palabra.equalsIgnoreCase("fin")) {
				
				//Almaceno la acumulacion de palabras en la variable grupoPalabras
				grupoPalabras +=palabra+" ";
				}
		}
		
		//Muestro en consola la frase formada por las palabras
		System.out.println(grupoPalabras);
		
		//cierro el scanner
		sc.close();
	}

}
