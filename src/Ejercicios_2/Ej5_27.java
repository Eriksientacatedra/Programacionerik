package Ejercicios_2;

/*

Pide nombre y apellido y muestra las iniciales en mayúscula con el formato X.Y..

Versión 2. Pide el nombre completo en una sola línea, con cualquier número de palabras, y
muestra todas las iniciales

*/

import java.util.Scanner;

public class Ej5_27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombres;
		char separador;
		System.out.print("Introduzcca nombres: ");
		nombres=scanner.nextLine().toUpperCase();
		System.out.print("Introduzcca el separador usado: ");
		separador=scanner.nextLine().charAt(0);
		
		System.out.print(nombres.charAt(0));
		for(int pp=0;pp<nombres.length();pp++) {
			if(nombres.charAt(pp)==separador) {
				System.out.print(""+separador + nombres.charAt(pp+1));
			}
		}
		
		
		
		
		scanner.close();
}}
