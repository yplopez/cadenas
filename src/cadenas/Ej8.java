package cadenas;

import java.util.Scanner;

/**
 * Programa que recibe una frase  o palabra y analiza si es palíndroma.
 */

public class Ej8 {
	

	public static void main(String[] args) {
		//Creo la variable frase de tipo String para almacenar una frase
				String frase;
				
				//Creo la variable inviertida de tipo booleano para llamar la
				//funcion y pasarle el parámetro frase
				boolean invertida;
				
				//Creo el Scanner para ingreso de datos
				Scanner sc = new Scanner (System.in);
				
				//Pido una frase al usuario
				System.out.println("Ingresa una frase o palabra: ");
				
				//Capturo la frase
				frase = sc.nextLine();
				
				//Asigno a la variable inviertida la función esPalindroma y le paso la frase como parámetro
				invertida = esPalindroma(frase);
				
				//Muestro por consola si la frase es palíndroma
				System.out.println("¿Tu frase es palíndroma? " + invertida);
				
				//Cierro el scanner
				sc.close();
	}
	
	//Creo una función de tipo booleano que recibe como parámetro un string y retorna un
	//resultado booleano.
		public static boolean esPalindroma (String frase) {
			
			//Creo la variable de tipo string fraseInvertida para almacenar la frase al contrario.
			String fraseInvertida="";
			
			//Creo la variable booleana palíndroma para evaluar si la frase lo es o no.
			boolean palindroma = false;
			
			//Creo un bucle for para recorrer la cadena de atrás para adelante.
			for(int i= frase.length()-1; i>=0; i--) {
				//asigno y acumulo cada carácter a la variable con la función charAt
				fraseInvertida += frase.charAt(i);
			}
			//Evaluo que la frase sea igual a la frase invertida y elimino los espacios
			//vacios con la función replace
			if (frase.replace(" ", "").equals(fraseInvertida.replace(" ", ""))) {
				//Si se cumple lo anterior...
				palindroma = true;
			}
			
			
			//retorno si es palíndroma o no la frase
			return palindroma;
			
		}

}
