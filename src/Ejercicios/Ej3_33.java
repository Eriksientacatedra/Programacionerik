package Ejercicios;

import java.util.Scanner;

/*
 
  Pide un número y muestra su tabla de multiplicar del 1 al 10, alineada con printf. 
  
 
 */

public class Ej3_33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1=-1;
		int mult=0;
		
		while(num1<=0) {
			System.out.print("Escriba un numero positivo del cual quiera la tabla de multiplicar: ");num1=scanner.nextInt();	
		}
		
		for(int i=0; i<=10; i++ ) {
			mult=i*num1;
			System.out.printf("%3d x %3d = %3d", i,num1,mult);System.out.println("");
		} // con el 3d le indicamos que deje tres huecos para que alinee
		
		scanner.close();
	}
}
