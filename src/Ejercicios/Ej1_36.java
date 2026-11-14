package Ejercicios;

import java.util.Scanner;

public class Ej1_36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1.36   Área y longitud de una circunferencia
		
		/* Pide el radio de una circunferencia y muestra el área del círculo (π·r²) 
		y la longitud de la circunferencia (2·π·r), 
		con dos decimales. Usa la constante Math.PI; no escribas 3.14 a mano. */
		
		
		double radio;
		
		System.out.print("Indique el radio a calcular: "); radio = scanner.nextDouble();
		
		System.out.println("");
		
		double area = (2 * Math.PI * Math.pow(radio,2));
		double longitud = (2 * Math.PI * radio);
		
		System.out.print("El area de su circuferencia es: "+ area + " y la longitud es: " + longitud);
		
		scanner.close();
	}
}
