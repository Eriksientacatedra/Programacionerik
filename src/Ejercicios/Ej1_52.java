package Ejercicios;

import java.util.Scanner;
/*
 * Pide cuántas monedas hay de cada tipo (2 €, 1 €, 50, 20 y 10 céntimos) 
 * 
 * y muestra el total en euros y céntimos. 
 * 
 * 
 */
public class Ej1_52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mdos = 0;
		int muno = 0;
		int mcincu = 0;
		int mveinte = 0;
		int mdiez = 0;
		
		System.out.println("Indique monedas:");
		System.out.print("2€:"); mdos= scanner.nextInt(); //scanner.nextLine();
		System.out.print("1€:"); muno= scanner.nextInt(); //scanner.nextLine();
		System.out.print("50 cent:"); mcincu= scanner.nextInt(); //scanner.nextLine();
		System.out.print("20 cent:"); mveinte= scanner.nextInt(); //scanner.nextLine();
		System.out.print("10 cent:"); mdiez= scanner.nextInt(); //scanner.nextLine();
		
		int centimos = 0;
		mdos *=2;
		int euros = mdos + muno;
		
		mcincu *= 50;
		mveinte *= 20;
		mdiez *= 10;
		
		euros  += mcincu/100;
		centimos += mcincu %100;
		
		euros  += mveinte/100;
		centimos += mveinte %100;
		euros  += mdiez/100;
		centimos += mdiez %100;
		
		System.out.println("La suma total es de: " + euros+"€ y "+ centimos +"cnt");
		
		scanner.close();
	}
}
