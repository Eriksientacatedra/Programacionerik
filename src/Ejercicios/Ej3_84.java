package Ejercicios;

/*
   
 Tres caracoles compiten en una carrera de 50 casillas. En cada turno, cada caracol avanza al azar entre 0 y 3 casillas. 
 Después de cada turno, dibuja la posición de cada uno con una línea de puntos y una @. 
 La carrera termina cuando alguno llega a la meta; puede haber empate. 
 
 */

import java.util.Random;


public class Ej3_84 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int cont1=0; int guardo1=0; 
		int cont2=0; int guardo2=0; 
		int cont3=0; int guardo3=0; 
		int suma = 0;
		
		
		for(int i=0; suma < 50; i++) {
			int ale1 = aleatorio.nextInt(4); 
			int ale2 = aleatorio.nextInt(4);
			int ale3 = aleatorio.nextInt(4); 
			
			System.out.println("Turno: "+i);
			guardo1=cont1;
			cont1=0;
			ale1+=guardo1;
			System.out.print("A: ");
			for(int a=0; cont1<ale1 ;a++ ) {
				System.out.print("-");
				cont1++;
			}
			System.out.print("@");
			System.out.println("");
			
			guardo2=cont2;
			cont2=0;
			ale2+=guardo2;
			System.out.print("B: ");
			for(int b=0; cont2<ale2 ;b++ ) {
				System.out.print("-");
				cont2++;
			}
			System.out.print("@");
			System.out.println("");
			
			guardo3=cont3;
			cont3=0;
			ale3+=guardo3;
			System.out.print("C: ");
			for(int c=0; cont3<ale3 ;c++ ) {
				System.out.print("-");
				cont3++;
			}
			System.out.print("@");
			System.out.println("");
			
		suma= (cont1+cont3+cont2)+suma;	
		}
		
		if(guardo1 > guardo2|| guardo1 >guardo3) {
			System.out.println("GANA EL CARACOL A");
		}
		else if(guardo2 > guardo1|| guardo2 >guardo3) {
			System.out.println("GANA EL CARACOL B");
		}
		else if(guardo3 > guardo1|| guardo3 >guardo2) {
			System.out.println("GANA EL CARACOL C");
		}
		else if(guardo1 == guardo2|| guardo1 == guardo3) {
			System.out.println("EMPATE");
		}
		else {System.out.println("EMPATE");}
		
		
	}}

