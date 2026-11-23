package Casa_Repaso;

/*

4.51 Factorial recursivo ★★☆ FactorialRecursivo.java
Escribe una versión recursiva del factorial y un main que lo pruebe. Controla que el número no sea
negativo.

*/

import java.util.Scanner;

public class Ej4_51 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num=-1;
		
		verificar(num);
		
		//System.out.print(num); --> Hasta aqui funciona
		
		//Se puede llamar aqui tambien
		// multiplicar(num);
		
		scanner.close();
	} // FINAL MAIN
	
	public static void verificar(int num) {
		Scanner scanner = new Scanner(System.in);
		boolean flag= false;
		
		System.out.print("Introduzca  un numero: ");
		num = scanner.nextInt();
		System.out.println("");
		
		while(!(flag)) {
			if(num==0) {
				System.out.print("Que sea entero: ");
				num = scanner.nextInt();
				System.out.println("");
				flag= false;
			}
			else if(num<0) {
				num=Math.abs(num);
				flag= true;
			}
			else {flag= true;}
			
		}//FINAL WHILE1
		
		multiplicar(num);
		
		//return num;
		
	}//FINAL METODO VERIFICAR
	
	
	public static void multiplicar(int num) {
		int multi= 1;
		System.out.print(num);	
		for(int i=num-1;i>0;i--) {
			System.out.print(" x "+i);
			multi *= i;
		}
		
		multi *= num;
		
		System.out.print(" = "+multi);
	}
	
	
}// FINAL CLASS
