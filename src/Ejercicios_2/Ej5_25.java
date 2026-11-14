package Ejercicios_2;

/*
 Pide una palabra y muéstrala en vertical, un carácter por línea.
	● Versión 2. De abajo arriba.

 */

import java.util.Scanner;

public class Ej5_25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("Introduzca UNA PALABRA: ");
			String nombre01; nombre01=scanner.nextLine();
		
			
			for(int i = 0; i<nombre01.length();i++) {
				System.out.println(nombre01.charAt(i));
			}
		
			System.out.println("");
		
			
			for(int o = nombre01.length()-1; o>=0;o--) {
				System.out.println(nombre01.charAt(o));
			}
		
		
		scanner.close();
}}
