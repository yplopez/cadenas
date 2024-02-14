package cadenas;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		// Creo la variable cadena1 de tipo String para almacenar la contraseña
		// introducida por teclado.
		String cadena1;

		// Creo la variable cadena2 de tipo String para almacenar opciones de
		// contraseña.
		String cadena2;

		// Creo la variable resultado de tipo entero para almacenar el resultado
		// que devuelva la función compareTo.
		
		int resultado;

		// Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner(System.in);

		// Pido la contraseña al primer jugador y la almaceno en la variable cadena1
		System.out.println("Introduzca la contraseña:");
		cadena1 = sc.nextLine();

		// Pido la contraseña al segundo jugador y la almaceno en la variable cadena2
		System.out.println("Acierta la contraseña:");
		cadena2 = sc.nextLine();

		// Hago uso de la función compareTo
		resultado = cadena1.compareTo(cadena2);

		// Evaluo las cadenas y de acuerdo a ello devuelvo el mensaje		
		if (resultado < 0) {
			System.out.println("La contraseña en menor alfabeticamente.");
		} else if (resultado > 0) {
			System.out.println("La contraseña en mayor alfabeticamente.");
		} else {
			System.out.println("Has acertado la contraseña.");
		}

		// Cierro el Scanner
		sc.close();

	}

}
