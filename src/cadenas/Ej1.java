package cadenas;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		// Creo la variable de tipo String para la frase 1.
		String cadena1;

		// Creo la variable de tipo String para la frase 1.
		String cadena2;

		// Creo el Scanner para ingreso de datos por teclado.
		Scanner sc = new Scanner(System.in);

		// Pido la primera frase
		System.out.println("Ingrese la primera frase: ");

		// Capturo la frase ingresada en la variable cadena1
		cadena1 = sc.nextLine();

		// Pido la segunda frase
		System.out.println("Ingrese la segunda frase: ");

		// Capturo la frase ingresada en la variable cadena1
		cadena2 = sc.nextLine();
		

		// Evaluo la longitud de las cadenas y de acuerdo a ello devuelvo el mensaje indicando cual es
		// mas corta.
		if (cadena1.length() < cadena2.length()) {
			System.out.println("La frase 1 es mas corta que la frase 2.");
		} else if (cadena1.length() > cadena2.length() ) {
			System.out.println("La frase 2 es mas corta que la frase 1.");
		} else {
			System.out.println("Las 2 frases tienen la misma longitud.");
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
