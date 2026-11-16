package Ejercicios_2;

/*

La sucesión de Fibonacci es una secuencia matemática de números en la que cada número 
se obtiene sumando los dos anteriores.

Empieza así:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34...

Por ejemplo, después del 5 y el 8 viene el 13, porque 5 + 8 = 13.

Es decir, cada número depende de los dos números anteriores.


*/

import java.util.Scanner;
public class Fibonachi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int fin;
		
		System.out.print("Introducce un numero para el final de Fibonachi: ");
		fin= scanner.nextInt();
		
		fibonachi(fin);
		
		scanner.close();
	}//Final Main
	
	
	public static void fibonachi(int end) {
		int num1 =0;
		int num2 =1;
		int num3 =0; //Numero que va a ir guardando la suma;
		
		for(int i=3;i<=end;i++) {
			num3=num1+num2;
			System.out.println(""+num1+","+num2+","+num3);
			num1=num2;
			num2=num3;
		}
	};
	
	
}//Final class
