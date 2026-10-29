package Ejercicios;

/*

Calcular cuantas a

*/

import java.util.Scanner;

public class Contar_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cont = 0;
		
		System.out.print("Introducce algo: ");
		String nombre = scanner.nextLine();
		
		System.out.println("");
		
		for(int i=0;i<nombre.length();i++) {
			if(nombre.charAt(i)=='a') {
				cont++;
			}
		}
		
		System.out.println(cont);
		
		scanner.close();
	}
}
