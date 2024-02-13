package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		// Creo la variable frase de tipo String para recibir la frse digitada.
		String frase;

		// Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido al usuario una frase
		System.out.println("Ingrese una frase: ");

		// Capturo la frase ingresada por el usuario en la variable frase
		frase = sc.nextLine();

		// Creo la variable resultado de tipo entero para asignarle el valor retornado
		// por la función recibeFrase
		int resultado = recibeFrase(frase);

		// Imprimo el valor almacenado en la variable resultado
		System.out.println("El número de espacios es: " + resultado);

	}

	// Creo una función que recibe un String y devuelve un entero
	public static int recibeFrase(String frase) {

		// Creo una variable de tipo String que almacena un array y le asigno el
		// resultado de dividir la frase de acuerdo a los espacios encontrados
		// usando la función split de la clase String
		String[] arrayFrase = frase.split(" ");

		// Retorno el número de elementos encontrados en el array menos 1 para
		// determinar los espacios.
		return arrayFrase.length - 1;

	}

}
