package Ejercicios_2;

/*
4.65 Un parámetro en lugar de tres métodos ★☆☆

Sustituye estos tres métodos casi idénticos por uno solo con un parámetro.

static void tablaDel2() { 
	for (int i = 1; i <= 10; i++) System.out.println(2 * i); 
	}

static void tablaDel3() { 
	for (int i = 1; i <= 10; i++) System.out.println(3 * i); 
	}

static void tablaDel5() { 
	for (int i = 1; i <= 10; i++) System.out.println(5 * i); 
	}


Después añade un segundo parámetro para que también se pueda elegir hasta qué número llega la
tabla.

*/

import java.util.Scanner;
public class Ej4_65 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		
		System.out.println("De que numero quieres la tabla de multiplicar y hasta que numero: ");
		tablam(num,num2);
		
		scanner.close();
	}// FINAL MAIN //
	
	
	// METODO DE LA TABLA DE MULTIPLICAR -->
	
	public static void tablam(int num, int num2) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.print("Que numero quieres multiplicar?: ");
		num=scanner.nextInt();
		System.out.println("");
		while(num2<=0) {
			System.out.print("Hasta que numero quieres multiplicar?: ");
			num2=scanner.nextInt();
			System.out.println("");
		}
		
		for(int i=0;i<=num2;i++) {
			System.out.println(""+num+" * "+i+" = "+(num*i));
		}
	}// FINAL METODO //
	
	
}// FINAL CLASS //
