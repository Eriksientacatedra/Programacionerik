package Ejercicios_2;

import java.util.Scanner;

/*

4.62 Extrae métodos ★★☆

Este programa repite código. Reescríbelo con métodos de forma que el main quede corto y se lea como
una descripción de lo que hace.

System.out.print("Base del rectángulo: ");
double b = sc.nextDouble();
while (b <= 0) { 
	System.out.print("Debe ser positivo: "); 
	b = sc.nextDouble(); 
	}


System.out.print("Altura del rectángulo: ");
double h = sc.nextDouble();
while (h <= 0) { 
	System.out.print("Debe ser positivo: "); 
	h = sc.nextDouble(); }

System.out.printf("Área: %.2f%n", b * h);





System.out.print("Base del triángulo: ");
double bt = sc.nextDouble();
while (bt <= 0) { System.out.print("Debe ser positivo: "); bt = sc.nextDouble(); }

System.out.print("Altura del triángulo: ");
double ht = sc.nextDouble();
while (ht <= 0) { 
	System.out.print("Debe ser positivo: "); 
	ht = sc.nextDouble(); }
System.out.printf("Área: %.2f%n", bt * ht / 2);




*/

//Si cierras el scanner en los metodos peta

public class Ej4_62 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double b = -1; //Esta es la base rectangulo
		double hh =-1; //Esta es la altura rectangulo
		
		double bt = -1; //Esta es la base del triangulo
		double ht = -1; //Esta es la altura del triangulo
		
		
		System.out.println("Vamos a calcular el area del rectangulo -->");
		System.out.println("--------------------------------------------------------------------------");
		b=verificarb(b);
		System.out.println("");
		hh=altura(hh);
		System.out.println("");
		Area(b,hh);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Vamos a calcular el area del Triangulo -->");
		System.out.println("--------------------------------------------------------------------------");
		bt=verificarb(bt);
		System.out.println("");
		ht=altura(ht);
		System.out.println("");
		Area2(bt,ht);
		
		scanner.close();
	}// FINAL MAIN //
	
	public static double verificarb(double b) {
		Scanner scanner = new Scanner(System.in);
		//Vamos a introduccir la base y verificar si es positivo
		
		System.out.print("Introduzca la base: ");
		b= scanner.nextDouble();
		
		System.out.println("");
		while(b<=0) { //Bucle que proboca que solo se pueda introduccir positivo.
			System.out.print("Introduzca la base en POSITIVO: ");
			b=scanner.nextDouble();
			System.out.println("");
		}
		
		
		return b;
	}
	
	  //
	 //
	//
	
	public static double altura(double hh) {
		Scanner scanner = new Scanner(System.in);
		//Vamos a introduccir la altura y verificar si es positivo
		
		System.out.print("Introduzca la altura: ");
		hh=scanner.nextDouble();
		
		System.out.println("");
		while(hh<=0){ //Aseguramos que sea positivo
			System.out.print("Introduzca la altura en POSITIVO: ");
			hh=scanner.nextDouble();
			System.out.println("");
		}
		

		return hh;
	}
	
	  //
	 //
	//

	public static void Area(double b, double h) { //Rectangulo
		//Ahora sacamos el area del rectangulo
		System.out.println();
		System.out.printf("Área: %.2f%n", b * h);
		System.out.println();
	}
	
	public static void Area2(double b, double h) { //Triangulo
		//Ahora sacamos el area del rectangulo
		System.out.println();
		System.out.printf("Área: %.2f%n", (b * h)/2);
		System.out.println();
	}
	
	
	
}// FINAL CLASS //




















