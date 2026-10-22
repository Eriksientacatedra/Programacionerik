package Ejercicios;

/*

Simula N lanzamientos de dos dados. Muestra cuántas veces la suma ha sido 7 y qué porcentaje representa. 
Con N muy grande, el porcentaje debería acercarse a 16,67 %: ¿por qué precisamente ese? 

*/

import java.util.Random;

public class Ej3_61 {
	public static void main(String[] args) {
		Random rand = new Random();
		double cont=0;
		int sum = 0;
		double sumtotal = 0;
		
		System.out.println("⚀ Tiramos los dados ⚄");
		
		for(int i=1; i<10000000;i++) {
			int num1 = rand.nextInt(6)+1;
			int num2 = rand.nextInt(6)+1;
			
			sum = num1 + num2; 
			
			if(sum == 7) {cont++;}
			
		}
		sumtotal = (cont/10000000)*100;
		
		System.out.println(sumtotal+"%");
		
	}
}
