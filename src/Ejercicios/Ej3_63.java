package Ejercicios;

/*

Dibuja un triángulo rectángulo de altura n, primero alineado a la izquierda y después a la derecha. 


*/


import java.util.Scanner;

public class Ej3_63 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Alto y ancho: "); 
		int ancho = 0; 
		ancho = scanner.nextInt();
		int avance = 0;
		
		
		for(int i = 1;i<=ancho;i++) {
			for(int u=1;u<=i;u++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		
		//Piramide inversa este repasar
		
		for(int i=1;i<=ancho;i++) {
			for(int u=1;u<=ancho-i;u++) {
				System.out.print(" ");
			}
			for(int p=1;p<=i;p++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		scanner.close();
	}
}
