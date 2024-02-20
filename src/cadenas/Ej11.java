package cadenas;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// Creo la primera cadena de caracteres de donde se tomará la posición de la
		// letra para ser codificada
		String conjunto1 = "eikmpqrstuv";
		// Creo la segunda cadena de caracteres que codificará las letras encontradas
		// enla primera cadena
		String conjunto2 = "pviumterkqs";
		// Creo la variable texto de tipo String para almacenar el mensaje ingresado por
		// teclado
		String texto = "";
		// Creo la variable textoMinus de tipo String para convertir a minúsculas el
		// mensaje ingresado
		String textoMinus = "";
		// Creo la variable codificada de tipo String para acumular las letras
		// encontradas en conjunto1 e
		// ir almacenando el mensaje cifrado
		String decodificada = "";
		// Creo un Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner(System.in);
		// Pido el mensaje a ser codificado
		System.out.println("Ingrese el mensaje a traducir:");
		// Al maceno el mensaje
		texto = sc.nextLine();
		// Transformo el mensaje a minúsculas
		textoMinus = texto.toLowerCase();
		// Creo un bucle for para recorrer toda la cadena y convertir cada letyra en una
		// posoción de un array
		for (String letra : textoMinus.split("")) {
			// Creo la variable posición de tipo entero para almacenar la posición en donde
			// se encuentra cada letra
			int posicion = conjunto2.indexOf(letra);
			// Evaluo si en posición no existe alguna letra ingresada, mantenerla en el
			// mensaje
			if (posicion == -1) {
				decodificada += letra;// Acumulo la letra en el mensaje
				// Si no, almaceno en codificada el valor del elemento en la posición
			} else {
				decodificada += conjunto1.charAt(posicion);
			}
		}
		// Muestro por consola el mensaje codificado.
		System.out.print("La palabra decodificada es: " + decodificada);

	}

}
