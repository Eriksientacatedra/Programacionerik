package Ejercicios;

/*

Dibuja un cuadrado de asteriscos de lado n.

● Versión 2. Solo el borde, hueco por dentro.


*/

import java.util.Scanner;


public class Ej3_62 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cuadra = -1;
		
		
		
		while(cuadra < 0) {
			System.out.print("De que proporcion quiere el cuadrado: "); cuadra = scanner.nextInt();
			System.out.println("");
		}
		
		for(int i=1;i<=cuadra;i++) {
			for(int u=1;u<=cuadra;u++) {
				if(i==1 || i==cuadra || u ==1 || u == cuadra ) {
					System.out.print("*");
				}
				else {System.out.print(" ");}
				
			}
			System.out.println("");
		}
		
		
		scanner.close();
	}
}
