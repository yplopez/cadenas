package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//Creo la variable frase de tipo string para almacenar la frase ingresada
		String frase;
		
		//Creo la variable palabra de tipo String para almacenar el array que 
		//arroje la función split
		String palabra[];
		
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner (System.in);
		
		//Pido al usuario que ingrese una frase.
		System.out.println("Ingresa la frase del día:");
		
		//Capturo la frase ingresada en la variable frase
		frase = sc.nextLine();
		
		//asigno el resultado de separar la frase por palabras en la
		//variable palabra
		palabra = frase.split(" ");
		
		//Organizo las palabras alfabeticamente
		Arrays.sort(palabra);
		
		//Creo un for each para devolver la frase ordenada alfabeticamente
		for (String ordena : palabra) {
			System.out.println(ordena + " ");
		}
		
		//Cierro el Scanner
		sc.close();
		

	}

}
