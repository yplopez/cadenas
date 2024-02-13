package cadenas;

import java.util.Scanner;

public class Ej2A {

	public static void main(String[] args) {
		// Creo la variable cadena1 de tipo String para almacenar la contraseña
		// introducida por teclado.
		String cadena1;

		// Creo la variable cadena2 de tipo String para almacenar opciones de
		// contraseña.
		String cadena2;

		// Creo la variable resultado de tipo entero para almacenar el resultado
		// que devuelva la función.
		int resultado;

		// Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner(System.in);

		// Pido la contraseña al primer jugador y la almaceno en la variable cadena1
		System.out.println("Introduzca la contraseña:");
		cadena1 = sc.nextLine();

		// Pido la contraseña al segundo jugador y la almaceno en la variable cadena2
		System.out.println("Acierta la contraseña:");
		cadena2 = sc.nextLine();

		// Creo un bucle for para recorrer cada elemento de la cadena1 (contraseña)
		for (int i = 0; i < cadena1.length(); i++) {
			
			//Creo una nueva variable cadenaArray y le asigno el valor de la cadena2
			//como un array.
			char[] cadenaArray = cadena2.toCharArray();
			
			//Evaluo si el caracter que está ubicado en la posición i de la cadena1
			//es igual al caracter que está ubicado en la posición i de la cadena2.
			if (cadena1.charAt(i) == cadena2.charAt(i)) {
				
				//Imprimo el elemento que está en la posición i del array cadenaArray si coinciden.
				System.out.print(cadenaArray[i]);
				
			} else {
				//Si los caracteres no son iguales imprimo un asterisco.
				System.out.print("*");
			}
		}

		// Cierro el Scanner
		sc.close();

	}

}
