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
		int sum=0;
		int i=1;
		
		while(num1 < 0) {
			System.out.println("Introduzca un numero entero y positivo: ");
			num1 = scanner.nextInt();
		}
		
		// /*   Bucle for
		  
 		for(i = 1; i <= num1; i++ ) {
			System.out.print("Vamos a sumar "+i+ " y "+ sum + " ");
			sum += i;
			System.out.print("="+sum);
			System.out.println("");
		}
		
		/*   Bucle while
		 * 
		while(i<=num1) {
			System.out.print("Vamos a sumar "+i+ " y "+ sum + " ");
			sum += i;
			System.out.print("="+sum);
			i++;
			System.out.println("");
			
		}
		
		*/
		/* Bucle Do while
		  
		do {
			System.out.print("Vamos a sumar "+i+ " y "+ sum + " ");
			sum += i;
			System.out.print("="+sum);
			i++;
			System.out.println("");
		}while(i<=num1);
		
		*/
	scanner.close();
	}
}
