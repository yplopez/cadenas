package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// Creo un array con todo el abecedario.
				final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
						'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

				// Creo la variable frase frase de tipo String para almacenar la frase ingresada.
				String frase;

				// Cfreo una variable para almacenar la frase en minusculas.
				String fraseMinus;

				// Creo un array para almacenar cada carácter de la frase.
				char[] caracteres;

				// Creo una variable Contador para hacer el conteo de las veces que se repite cada letra.
				int contador;

				// Creamos el Scanner para ingreso de datos por teclado.
				Scanner sc = new Scanner(System.in);

				// Le pido al usuario que introduzca una frase y la almaceno.
				System.out.println("Introduzca una frase: ");
				frase = sc.nextLine();

				// Convierto la frase a minúsculas y elimino los espacios de la frase.
				fraseMinus = frase.toLowerCase().replace(" ", "");

				// Transformo la frase a caracteres.
				caracteres = fraseMinus.toCharArray();

				// Ordeno los caracteres alfabéticamente.
				Arrays.sort(caracteres);

				// Imprimo la frase ingresada.
				System.out.println("Frase: " + frase);
				System.out.println("Resultado:");

				// Recorro el array abecedario e inicializo a cero el contador.
				for (int i = 0; i < abecedario.length; i++) {
					contador = 0;

					// Recorro los caracteres de la frase.
					for (int j = 0; j < caracteres.length; j++) {
						// Si hay coincidencias de los caracteres de la frase con la letra del abecedario,
						// incremento el contador.
						if (abecedario[i] == caracteres[j]) {
							contador++;
						}
					}

					// Si la letra aparece al menos una vez en la frase, se imprimen las
					// coincidencias.
					if (contador > 0) {
						if (contador == 1) {
							System.out.println(abecedario[i] + ": " + contador + " vez");
						}else {
						System.out.println(abecedario[i] + ": " + contador + " veces");
						}
					}
				}

				// Cierro de Scanner
				sc.close();

	}

}
