package Ejercicios_2;

/*

Escribe dos métodos, uno para el área y otro para la longitud de la circunferencia, y un main que lea el
radio y muestre ambos. Compáralo con tu solución del ejercicio 1.36: ¿qué has ganado?


*/

import java.util.Scanner;

public class Ej4_36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzcca el radio: ");
		int radio = scanner.nextInt();
		
		area(radio);
		//System.out.println("");
		longitud(radio);
		
		scanner.close();
	}
	
	
	public static void area(double radio) {
		
		double calculo = (Math.PI*Math.pow(radio,2));
		
		System.out.println("Su area es de: "+calculo);
	
		
	}
	
	public static void longitud(double radio) {
		
		double calculo=2*Math.PI*radio;
		
		System.out.println("Su longitud es de: "+ calculo);
		
	}
	
	
	
	
}
