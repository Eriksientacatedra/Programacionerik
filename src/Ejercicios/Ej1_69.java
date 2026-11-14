package Ejercicios;

import java.util.Scanner;

/*
 * Pide un año y guarda en un boolean si es bisiesto. Un año es bisiesto si es divisible entre 4,
 * salvo que sea divisible entre 100, excepto si también lo es entre 400.
 * Todo en una única expresión. Comprueba tu expresión con 2024 (sí), 1900 (no), 2000 (sí) y 2026 (no). 
 * 
 */


public class Ej1_69 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int conio;
		boolean SiNo;
		
		System.out.print("Indique un año: "); conio=scanner.nextInt();
		
		if(conio%4 == 0 && !(conio%100 == 0) || conio%400 == 0) {
			SiNo=true;	
		}
		
		else {SiNo=false;}
		
		//
		
		if (SiNo == true) {System.out.print("Su año "+conio+" es bisiesto "+SiNo); }
		else {System.out.print("Su año "+conio+" no es bisiesto "+SiNo);}
		
		scanner.close();
	}
	
}
