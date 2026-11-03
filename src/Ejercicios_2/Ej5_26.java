package Ejercicios_2;

/*

Pide una frase y un carácter y muestra cuántas veces aparece. 

Escribe el método contar(String s, char c).

*/

import java.util.Scanner;

public class Ej5_26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			String frase;
			char palabra;
			int cont = 0;
			
			System.out.print("mete lo ke ute quiera tigre: ");
			frase = scanner.nextLine();
			System.out.print("mete la palabra que quiera buscal papi: ");
			palabra = scanner.nextLine().charAt(0);
			
			
			//pp de pila putas
			for(int pp = 0; pp<frase.length();pp++) {
				if(frase.charAt(pp)==palabra) {
					cont++;
				}
			}
			
			System.out.println("Su flase papi tiene "+cont+" de "+palabra+"´s");
			

		scanner.close();
}}
