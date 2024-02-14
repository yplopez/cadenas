package cadenas;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		String palabra = "";

		String grupoPalabras = "";

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una palabra: ");
		palabra = sc.next();

		while (!palabra.equalsIgnoreCase("fin")) {
			
			grupoPalabras +=palabra+" ";

			System.out.println("Escriba una palabra: ");
			palabra = sc.next();

			

		}
		System.out.println(grupoPalabras);
		sc.close();
	}

}
