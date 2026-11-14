package Ejercicios;

import java.util.Scanner;

/*
 * Pide una cantidad de segundos y muestrala en formato hh:mm:ss, con dos cifras en cada campo
 *  (%02d en printf)
 */

public class Ej1_47 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int segundos = 0;
		
		System.out.print("Introduzca un numero de segundos: "); segundos = scanner.nextInt();
		
		//System.out.printf("Su numero de segundos: %d", segundos);
		
		int minutos = segundos / 60; 
		int horas = minutos / 60;
		
		minutos %= 60; 
		segundos %= 60;
		
		System.out.printf("%02d, %02d, %02d", horas,minutos,segundos);
		
		scanner.close();
		
	}
}
