package cadenas;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		//Creo la variable frase de tipo  String para almacenar el mensaje
		String frase;
		
		//Creo una variable resultado de tipo booleano para almacenar el valor retornado de la 
		//función comprueba mensaje
		boolean resultado;
		
		//Creo la variable traduccion de tipo String para almacenar el valor retornado de la
		//funcion traduce
		String traduccion;
		
		//Creo un Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		
		//Piso un mensaje al usuario
		System.out.println("Ingrese su mensaje: ");
		
		//Almaceno la frase ingresada por teclado
		frase = sc.nextLine();
		
		//Asigno el tipo de dato retornado por la función compruebaMensaje al pasarle
		//frase como parámetro
		resultado = compruebaMensaje(frase);		
		
		//Evaluo si resultado es verdadero o falso para informar si el mensaje es de
		//lenguaje javalandia o no
		if (resultado == true) {
			System.out.println("El lenguaje es de Javalandia");
		}else {
			System.out.println("El mensaje no está en lenguaje Javalandia");
		}
		
		//Asigno el mensaje retornado por la función traduce al pasarle
		//la frase como parámetro
		traduccion = traduce(frase);
		
		//Muestro el mensaje traducido por consola al usuario
		System.out.println("El mensaje traducido dice: " + traduccion);
		

	}
	//Creo la función compruebaMensaje de tipo booleano que retorna un resultado de tipo booleano
	public static boolean compruebaMensaje (String frase) {
		
		//Creo la variable lenguajava de tipo booleano para almacenar el valor retornado por
		//la función.
		boolean lenguaJava = false;
		
		//Creo la variable minuscula de tipo String y le asigno la frase recibida como
		//parámetro, la cual convierto a minúscula con la función toLowerCase de la clase String
		String minuscula = frase.toLowerCase();
		
		//Evalúo con las funciones startWith o endsWith si el mensaje inicia o termina con el dialecto
		//de Javalandia
		if(minuscula.startsWith("javalín, javalón")|| minuscula.endsWith("javalén, len, len")) {
			lenguaJava = true;
		}
		
		System.out.println(lenguaJava);
		
		return lenguaJava;
	}
	
	public static String traduce (String frase) {
		
		String traduce="";
		
		if(frase.startsWith("javalín, javalón")){
			traduce = frase.substring(16, frase.length());
		}else {
			traduce = frase.substring(0, frase.length()-18);
		}
		
		return traduce;
	}

}
