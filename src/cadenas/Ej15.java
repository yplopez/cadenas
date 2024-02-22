package cadenas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que recibe una palabra de un jugador, la desordena e invita a un segundo jugador a
 * adivinarla, hasta que lo logre.
 */

public class Ej15 {

	public static void main(String[] args) {
		// Variable jugador1 de tipo string para almacenar palabra ingresada por
		// jugador1.
		String jugador1 = "";

		// Variable jugador2 de tipo string para almacenar palabra ingresada por
		// jugador2.
		String jugador2 = "";

		// Variable pista de tipo String para almacenar la pista generada de la palabra introducida por
		// Jugador1.
		String pista = "";

		// Array para almacenar los caracteres de la palabra de Jugador1.
		char[] caracteres;

		// Creo el Scanner para ingreso de datos por teclado.
		Scanner sc = new Scanner(System.in);

		// Pido a Jugador1 que introduzca una palabra y la almaceno.
		System.out.println("Jugador1: Ingresa una palabra: ");
		jugador1 = sc.nextLine();

		// Elimino espacios en blanco al principio y al final de la palabra.
		jugador1 = jugador1.trim();

		// Convierto la palabra en caracteres.
		caracteres = jugador1.toCharArray();

		// Genero una pista anagrama para la palabra de Jugador1
		pista = pistaAnagrama(caracteres);

		//Jugador2 empieza a adivinar la palabra de Jugador1 hasta que la adivine.
		do {

			// Muestro la pista para Jugador2.
			System.out.println(pista);

			// Le pedimos a Jugador2 que introduzca una palabra para iniciar y la almaceno.
			System.out.println("Jugador2: Adivina la palabra: ");
			jugador2 = sc.next();

			// El bucle continua hasta que Jugador2 acierte la palabra
			// de Jugador1.
		} while (!jugador2.equals(jugador1));

		// Imprimir un mensaje cuando Jugador2 haya adivinado la palabra de Jugador1
		System.out.println("Adivinaste!, la palabra es: " + jugador1);

		// Cierre de Scanner.
		sc.close();
	}

	/**
	 * Función que genera una pista de acuerdo a la primera palabra recibida	 *
	 * @param caracteres
	 * @return pista de tipo String.
	 */
	public static String pistaAnagrama(char[] caracteres) {
		// Uso la clase Random para generar números aleatorios.
		Random rand = new Random();

		// Variable de tipo string para almacenar la palabra desordenada.
		String disorderWord = "";

		// Almaceno los caracteres de la palabra desordenada.
		char[] letras = new char[caracteres.length];

		// Recorro cada caracter de la palabra ingresada por jugador1.
		for (int i = 0; i < caracteres.length; i++) {
			// Creo la variable letra Aleatoria para almacenar las letras.
			char letraAleatoria;

			// Genero letras aleatorias hasta que mezcle la palabra ingresada por jugador1.		
			do {
				letraAleatoria = caracteres[rand.nextInt(caracteres.length)];

				// Compruebo si el carácter ya existe en la palabra desordenada.
			} while (disorderWord.indexOf(letraAleatoria) != -1);
			// Asigno cada letra aleatoria y las asigno la nueva palabra desordenada.
			letras[i] = letraAleatoria;
			disorderWord += letras[i];
		}

		// Retorno la palabra desordenada.
		return disorderWord;

	}

}
