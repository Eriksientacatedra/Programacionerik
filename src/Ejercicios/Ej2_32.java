package Ejercicios;

import java.util.Scanner;

/*
 * Pide un número entero y di si es par o impar. Debe funcionar también con negativos.
 * 
 */


public class Ej2_32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Introduzca un numero: "); num = scanner.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.print("Su numero es par");
			
		}
		else{
			System.out.print("Su numero es Impar");
		}
		
		System.out.println("");
		scanner.close();
	}
}
