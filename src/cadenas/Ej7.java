package cadenas;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//Creo la variable frase de tipo string para almacenar una frase ingresada
		String frase;
		
		//Creo una variable de tipo String para almacenar una palabra de la frase
		String palabra;
		
		//Creo la variable de tipo entero para recibir la cantidad de la 
		//función cuentaPalabra y pasarle los parámetros.
		int cantidad;
		
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		
		//Pido una frase al usuario
		System.out.println("Ingrese una frase: ");
		
		//Almaceno la frase ingresada
		frase = sc.nextLine();
		
		//Pido una palabra de la frase al usuario
		System.out.println("Ingrese la palabra que quiere buscar dentro de la frase: ");
		
		//Almaceno la palabra ingresada
		palabra = sc.nextLine();
		
		//Asigno a la variable cantidad el valor retornado por la función 
		//cuentaPalabra y paso los parámetros.
		cantidad = cuentaPalabra(frase, palabra);
		
		//Muestro el resultado encontrado con la función cuentaPalabra
		System.out.println("La palabra " + palabra + " aparece " + cantidad + " veces, en la frase.");
		
	}
	
	//Creo una función de tipo entero que recibe como parámetros dos 
	//String y retorna un entero
	public static int cuentaPalabra (String frase, String palabra) {
		//Creo la variable cantidad de tipo entero para contar la cantidad
		//de ves que aparece la palabra
		int cantidad = 0;
		
		//Divido la frase por espacios con la función split
		String[] oracion = frase.split(" ");
		
		//Creo un bucle for each para recorrer todas las palabras
		// de la cadena y buscar cuantas veces aparece la palabra.
		//Cada que encuentra la palabra que coincida la acumula en la 
		//variable cantidad.
		for (String word : oracion) {
			if(word.equals(palabra)) {
				cantidad++;
			}
		}
				
		//Retorno la cantidad de coincidencias de la palabra al método main
		//donde está siendo invocado.
		return cantidad;
	}

}
