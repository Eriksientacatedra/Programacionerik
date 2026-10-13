package Ejercicios;

import java.util.Scanner;
/*
 * Pide al usuario dos caracteres y guárdalos en las variables a y b. 
 * 
 * Intercambia sus valores y muestra cuánto vale cada variable antes y después. 
 * 
 * 
 * Repasa el ejercicio 1.22 antes de empezar. 
 * 
 */

public class Ej1_48 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			String a;
			String b;
			String c;
			
			System.out.println("Introduzca dos caracteres: ");
			System.out.print("Caracter a: "); a = scanner.nextLine(); //scanner.nextLine();
			System.out.print("Caracter b: "); b = scanner.nextLine(); //scanner.nextLine();
			System.out.println("Variable a: "+ a + " Variable b: "+ b); //--> comprobacion
			c=a;
			a=b;
			b=c;
			System.out.println("Variable a: "+ a + " Variable b: "+ b);
			
			
			
		scanner.close();
	}
}
