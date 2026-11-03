package Ejercicios_2;

/*

Pide una frase y muéstrala en mayúsculas y escrita al revés.


*/

import java.util.Scanner;

public class Ej5_32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			String frase;
		
			System.out.print("Introduzca una frase: ");
			frase=scanner.nextLine().toUpperCase();;
			
			System.out.println(frase);
			
			System.out.println("");
			
			for(int i = frase.length()-1;i>-1;i--) {
				System.out.print(frase.charAt(i));
			}
			
		
		scanner.close();
}}
