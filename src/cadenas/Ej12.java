package cadenas;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		
		String frase;
		
		String [] palabra;
		
		String palabraMayor="";
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba una frase: ");
		
		frase = sc.nextLine();
		
		palabra = frase.split(" ");
		
		for (int i=0; i<palabra.length; i++) {
			if (palabra [i].length()>palabraMayor.length()) {
				palabraMayor = palabra [i];
			}
		}
		
		System.out.println("La palabra con mayor longitud es: " + palabraMayor + 
				", tiene " + palabraMayor.length() + " caracteres.");
		
		
		
		

	}

}
