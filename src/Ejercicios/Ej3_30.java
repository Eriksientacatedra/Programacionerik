package Ejercicios;

/*
 * Pide un entero positivo N y muestra la suma de todos los números de 1 a N. 
 * 
 * 
 */

import java.util.Scanner;

public class Ej3_30 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
		
		int num1=-1;
		
		while(num1 < 0) {
			System.out.println("Introduzca un numero entero y positivo: ");
			num1 = scanner.nextInt();
		}
		
		
		
	scanner.close();
	}
}
