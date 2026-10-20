package Ejercicios;

import java.util.Scanner;

/*

Este bucle debería repetir la pregunta mientras la nota no sea válida, pero hace justo lo contrario. 
Corrígelo de dos formas: cambiando los operadores y usando !. 

*/

public class Ej3_16 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		double nota; 
		do { 
			System.out.print("Nota (0-10): "); 
			nota = sc.nextDouble();   
			} while (nota >= 0 && nota <= 10);
	
	sc.close();
	}
}
