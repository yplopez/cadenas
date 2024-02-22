package cadenas;

import java.util.Scanner;

/**
 * Programa que recibe una frase, identifica la palabra más larga, la devuelve y además
 * dice cuantos caracteres tiene esa palabra.
 */

public class Ej12 {

	public static void main(String[] args) {
		//Creo una variable frase de tipo String para almacenar una frase ingresada por teclado.
		String frase;
		//Crreo un array palabra de tipo String para almacenar las palabras despues de usar la 
		//función split.
		String [] palabra;
		//Creo la variable palabra Mayor para almacenar la palabra las larga encontrada.
		String palabraMayor="";
		//Creo el scanner para ingreso de datos por teclado.
		Scanner sc = new Scanner (System.in);
		//Pido  la frase al usuario.
		System.out.println("Escriba una frase: ");
		//Almaceno la frase ingresada.
		frase = sc.nextLine();
		//Uso la función split para convertir la frase en un array en el que se almacenará cada cada
		//palabra en un espacio
		palabra = frase.split(" ");
		//Utilizo un bucle for para recorrer cada palabra y contar su longitud hasta que encuentre la 
		//de mayor longitud.
		for (int i=0; i<palabra.length; i++) {
			if (palabra [i].length()>palabraMayor.length()) {
				palabraMayor = palabra [i];
			}
		}
		//Imprimo el resultado de la busqueda.
		System.out.println("La palabra con mayor longitud es: " + palabraMayor + 
				", tiene " + palabraMayor.length() + " caracteres.");
		
		//Cierro el scanner
		sc.close();
		
		

	}

}
