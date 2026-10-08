package Ejercicios;

import java.util.Scanner;

public class Ej1_34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//El cociente y el resto
		
		//Pide dos números enteros y muestra el cociente y el resto de su división
		
		System.out.println("Introducca dos numeros que quieras dividir");
		int num1 = scanner.nextInt();
		System.out.println(" y ");
		int num2 = scanner.nextInt();
		System.out.println("");
		
		int resultado = (num1/num2);
		double resto = (num1%num2);
		
		System.out.println("" + num1 + " entre " + num2 + " da " + resultado + " y sobran " + resto);
		System.out.println("");
		
		
		scanner.close();
	}
}
