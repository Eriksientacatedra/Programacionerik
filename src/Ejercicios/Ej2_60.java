package Ejercicios;

/*
 * Piedra Papel o tijeras
 * 
 * El usuario elige piedra, papel o tijera y el ordenador elige al azar. Muestra la elección del ordenador y quién gana.
 * Intenta que el código que decide el ganador sea lo más corto posible sin perder claridad. 
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class Ej2_60 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int eleccion = 0;
		int ale=random.nextInt(3)+1;
		String ele2;
		
		System.out.print("Realiza una eleccion");
		System.out.println("1.Piedra");
		System.out.println("2.Papel");
		System.out.println("3.Tijeras");
		
		while(eleccion < 1 || eleccion > 3){
			System.out.print("Indique un numero correcto: "); eleccion=scanner.nextInt();
		}
		
		//System.out.print(eleccion);
		
		if(eleccion == ale) {
			System.out.print("EMPATE");
			if(eleccion == 1 && ale == 1) {System.out.print("Usted ha seleccionado Piedra y la maquinita ha seleccionado Piedra");}
			else if(eleccion == 2 && ale == 2){System.out.print("Usted ha seleccionado Papel y la maquinita ha seleccionado Papel");}
			else {System.out.print("Usted ha seleccionado Tijera y la maquinita ha seleccionado Tijera");}
		}
		else {
			
			if((eleccion == 1 && ale == 3)||(eleccion == 2 && ale == 1)||(eleccion == 3 && ale == 2)){
				System.out.print("Usted Gana ");
			}
			else {
				System.out.print("Usted Pierde ");
			}
		
			// Eleccion del Jugador
			if(eleccion == 1) {
				System.out.print("Usted Selecciono Piedra y ");
			}
			else if(eleccion == 2) {
				System.out.print("Usted Selecciono Papel y ");
			}
			else{
				System.out.print("Usted Selecciono Tijeras y ");
			}
			
			//Eleccion de la maquina
			if(ale == 1) {
				System.out.println("La maquina Selecciono Piedra");
			}
			else if(ale == 2) {
				System.out.println("La maquina Selecciono Papel");
			}
			else{
				System.out.println("La maquina Selecciono Tijeras");
			}
		
		
		}
		
		scanner.close();
	}
	
	
}
