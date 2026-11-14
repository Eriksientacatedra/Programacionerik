package Ejercicios;

import java.util.Scanner;

/*
3.52   Divisores   ★★☆   Divisores.java 
Pide un número y muestra todos sus divisores y cuántos tiene. 

● Versión 2. 
Indica si el número es perfecto: la suma de sus divisores, sin contarse a sí mismo, es igual al número (6 = 1 + 2 + 3). 

*/

public class Ej3_52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			int num1;
			int sum=0;
			int contador=1;
			
			System.out.print("Introduzca un numero para mostrar sus divisores: "); num1=scanner.nextInt();
			
			while(contador<num1) {
				if(num1%contador == 0) {
					sum+=contador;
					System.out.print(contador+" ");
				}
				contador++;
			}
			
			//System.out.println("");
		
			if(num1 == sum) {
				System.out.println(""+num1+" Eyeyey, no digas eso, eres perfecta");
			}
			
			
			
		scanner.close();
	}
}
