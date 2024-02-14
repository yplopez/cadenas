package cadenas;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Creo la variable frase de tipo String para almacenar una frase
		String frase;
		
		//Creo la variable invierte para llamar la funcion y pasarle el parámetro frase
		String invierte;
		
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner (System.in);
		
		//Pido una frase al usuario
		System.out.println("Ingresa una frase o palabra: ");
		
		//Capturo la frase
		frase = sc.nextLine();
		
		//Asigno a la variable invierte la función invertida y le paso la frase como parámetro
		invierte = invertida(frase);
		
		//Muestro por consola la frase invertida
		System.out.println("Tu frase/palabra invertida es: " + invierte);
		
		//Cierro el scanner
		sc.close();

	}
	
	//Creo una función de tipo string que recibe como parámetro un string y retorna otro.
	public static String invertida (String frase) {
		
		//Creo la variable de tipo string palabInvertida para almacenar la palabra o frase al contrario.
		String palabInvertida="";
		
		//Creo un bucle for para recorrer la cadena de atrás para adelante.
		for(int i= frase.length()-1; i>=0; i--) {
			//asigno y acumulo cada carácter a la variable con la función charAt
			palabInvertida += frase.charAt(i);
		}
		//retorno la palabra/frase invertida al main donde sea llamada
		return palabInvertida;
		
	}
	
	

}
