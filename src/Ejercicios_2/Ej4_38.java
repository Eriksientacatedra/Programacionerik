package Ejercicios_2;

/*  4.38

Escribe los métodos esPar(int), esPositivo(int), esMultiplo(int a, int b) y signo(int)
(devuelve 1, −1 o 0). En el main, pide un número y muestra todo lo que se sabe de él usando los
métodos.

*/

import java.util.Scanner;

public class Ej4_38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int opcion = 0;
			int num = 0;
			boolean tf=true;
			
			System.out.println("1. Saber si es Par o Impar");
			System.out.println("2. Saber si es Positivo o Negativo");
			System.out.println("3. Saber si es Multiplo de otro Numero");
			System.out.println("4. Cambiar signo");
			System.out.println("0. Salir");
			
			System.out.println("");
			System.out.print("Introduzca una opcion: ");
			opcion = scanner.nextInt();
			
			while(num<0 && num>4) {
				System.out.println("");
				System.out.println("Introduzca una opcion valida: ");
				opcion = scanner.nextInt();
				System.out.println("");
			}
			
			
			switch (opcion) {
			case 1:
				System.out.print("Introducce un numero para comprobar si es par: "); 
				num=scanner.nextInt();
				System.out.println(esPar(num)); 
				break;
				
			case 2:
				System.out.print("Introducce un numero para comprobar si es Positivo: "); 
				num=scanner.nextInt();
				System.out.println(esPositivo(num));
				break;
			case 3:
				System.out.print("Introducce un numero para comprobar si es Multiplo de otro: "); 
				num=scanner.nextInt();
				System.out.println(esMultiplo(num));
				break;
			case 4:
				System.out.print("Introducce un numero para cambiar su signo: "); 
				num=scanner.nextInt();
				System.out.println(signo(num));
				break;
			case 0:
				System.out.print("SALIENDO..."); 
				tf=false;
				break;
			}
			
			
			
		scanner.close();
	}
	
	
	public static String esPar(int numero) {
		String resultado;
		if(numero % 2 ==0) { resultado="Es Par";}
		else {resultado="Es impar";}
		return resultado;
		
	}
	
	public static String esPositivo(int numero) {
		String resultado;
		if(numero > 0)  { resultado="Es Positivo";}
		else {resultado="Es Negativo";}
		return resultado;
	}
	
	public static String esMultiplo(int numero1) {
		Scanner scannerm = new Scanner(System.in);
		String resultado;
		System.out.print("Introducce el otro numero "); 
		int numero2= scannerm.nextInt();
		boolean guardar=false;
		for(int i=0;i<=numero2;i++) {
			if(Math.pow(numero1, i) == numero2) {
				guardar=true;
			}
		}
		if(guardar) {resultado="Es multiplo";}
		else {resultado = "No es Multiplo";}
		
		scannerm.close();
		
		return resultado;
	}
	
	
	public static int signo(int num) {
		int resultado = 0;
		if (num > 0) {
			resultado = -num;
		}
		else{resultado = num*-1;}
		return resultado;
	}
	
}
