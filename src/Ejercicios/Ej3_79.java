package Ejercicios;

/*

Este bucle busca si alguno de los 10 números introducidos es negativo.
Reescríbelo de forma que deje de pedir números en cuanto aparezca uno negativo: 
primero con una bandera en la condición del bucle y después con break. ¿Cuál prefieres y por qué? 

*/

import java.util.Scanner;

public class Ej3_79 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		boolean bandera = true;
		int i;
		int n;
		
		for(i = 0; !(bandera == false || i==10); i++) {
			//System.out.println("LLego");
			n = scanner.nextInt();
			if(n < 0) {
				bandera = false;
			}
		}
		
		
		scanner.close();
	}
}
