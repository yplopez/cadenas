package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
String frase;
		
		String palabra1 = "";
		
		String palabra2 = "";
		
		boolean isAnagrama = true;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba una palabra/frase: ");
		
		palabra1 = sc.nextLine();
		
		System.out.println("Escriba otra palabra/frase: ");
		
		palabra2 = sc.nextLine();
		
		char[] sinEspacio = palabra1.replace(" ", "").toCharArray();
		
		 Arrays.sort(sinEspacio);
		 
		 
		 char[] sinEspacio2 = palabra2.replace(" ", "").toCharArray();
			
		 Arrays.sort(sinEspacio2);
		 
		 
		 if (Arrays.equals(sinEspacio, sinEspacio2)) {
			 System.out.println("La palabra/frase ingresada es un anagrama.");
		 }else {
		 System.out.println("La palabra/frase ingresada no es un anagrama.");
		 }
		
		

	}

}
