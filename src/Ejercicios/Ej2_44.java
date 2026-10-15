package Ejercicios;

import java.util.Scanner;

/*
 * Pide el límite de velocidad de una vía y la velocidad medida. 
 *  Según el exceso, muestra la sanción de esta tabla (inventada para el ejercicio, no es la de la DGT): 
 *  hasta 20 km/h por encima, 100 €;
 * de 21 a 40, 300 € y 2 puntos;
 *  de 41 a 60, 500 € y 4 puntos;
 *  más de 60, 600 €, 6 puntos y aviso de posible delito.
 */

public class Ej2_44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maxima;
		int velocidad;
		int limite;
		
		System.out.print("A que velocidad iba?: "); velocidad = scanner.nextInt();
		System.out.print("Cual es la velocidad de la via?: "); maxima = scanner.nextInt();
		
		if(velocidad > maxima) {
			
			limite = velocidad - maxima;
			System.out.println(limite);
			
			if(limite >= 20) {
				
				if(limite == 20) {System.out.print("Su multa son 100€"); }
				else if(limite >= 21 && limite <= 40){System.out.print("Su multa son 300€ y 2 puntos");}
				else if(limite <= 60){System.out.print("Su multa son 500€ y 4 puntos");}
				else {System.out.print("Su multa son 600€, 6 puntos y empieza a incurrir en un delito");}
			}
			else {System.out.print("Usted va muy al limite");}
			
		}
		else { System.out.print("Sigua respetando las normas de velocidad"); }
		
		scanner.close();
	}
	
}
