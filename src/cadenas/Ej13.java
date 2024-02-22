package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
/**
 * Programa que se encarga de recibir dos frases o palabras y analizar si son un anagrama la una de la otra.
 * @param args
 */
	public static void main(String[] args) {
		
		
		// Creo la variable palabra2 de tipo String para almacenar la primera frase o palabra ingresada.
		String palabra1 = "";
		// Creo la variable palabra2 de tipo String para almacenar la segunda frase o palabra ingresada.
		String palabra2 = "";
		//Creo el Scanner para ingreso de datos por teclado.
		Scanner sc = new Scanner(System.in);
		//Pido la primera frase o palabra al usuario.
		System.out.println("Escriba una palabra/frase: ");
		//Almaceno la frase o palabra ingresada
		palabra1 = sc.nextLine();
		//Pido la segunda frase o palabra al usuario.
		System.out.println("Escriba otra palabra/frase: ");
		//Almaceno la frase o palabra ingresada
		palabra2 = sc.nextLine();
		//Elimino los espacios, si los hay.
		char[] sinEspacio = palabra1.replace(" ", "").toCharArray();
		//Ordeno los caracteres del nuevo array sinEspacio.
		Arrays.sort(sinEspacio);
		//Elimino los espacios, si los hay.
		char[] sinEspacio2 = palabra2.replace(" ", "").toCharArray();
		//Ordeno los caracteres del nuevo array sinEspacio2.
		Arrays.sort(sinEspacio2);
		//Evaluo si el primer array es igual al segundo y devuelvo un mensaje por consola.
		if (Arrays.equals(sinEspacio, sinEspacio2)) {
			System.out.println("La palabra/frase ingresada es un anagrama.");
		} else {
			System.out.println("La palabra/frase ingresada no es un anagrama.");
		}
		//Cierro el Scanner
		sc.close();

	}

}
