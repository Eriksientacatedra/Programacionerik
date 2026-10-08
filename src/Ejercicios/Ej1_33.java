package Ejercicios;

import java.util.Scanner;

public class Ej1_33 {
 public static void main (String[] args) {
	 // Calculadora simple
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 // Version 1
	 
	 int num1 = 0;
	 int num2 = 0;
	 
	 System.out.println("Hola Introduzca los numeros que quiera sumar, restar y la multiplicacion ");
	 System.out.println("Numero 1");
	 num1 = scanner.nextInt();
	 System.out.println("");
	 System.out.println("Numero 2");
	 num2 = scanner.nextInt();
	 System.out.println("");
	 
	 int suma = num1 + num2;
	 int resta = num1 - num2;
	 int producto = num1 * num2;
	 
	 System.out.println("Sus resultados");
	 System.out.println("Suma: " + suma);
	 System.out.println("Resta: " + resta);
	 System.out.println("Producto: " + producto);
	 System.out.println("");
	 
	 //Verion 2
	 
	 //Sin los parentesis te lo escribe tal cual no calcula
	 scanner.close();
 }
}
