package Ejercicios;

/*

3.40   Potencia sin potencia   ★☆☆   

PotenciaBucle.java Pide una base (real) y un exponente (entero no negativo) y calcula la potencia con un bucle, 
sin Math.pow(). 

● Versión 2. Admite también exponentes negativos. 

*/

import java.util.Scanner;


public class Ej3_40 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
		
		int base = 0;
		int exp = 0;
		double multi=1;
		int multi2=1;
		
		System.out.print("Indique una base para que se eleve: "); base=scanner.nextInt();
		System.out.print("Indique un exponente: "); exp=scanner.nextInt();
		
		if(exp<0) {
			
			for(int i=1;i<=-exp;i++) {
				multi= 1/(multi*(double)base);
			}
			System.out.print("Su numero "+base+" elevado a "+exp+" es igual a "+multi);
			
		}
		else {
			for(int i=1;i<=exp;i++) {
				multi2*=base;
			}
			System.out.print("Su numero "+base+" elevado a "+exp+" es igual a "+multi2);
		}
		
		
	scanner.close();
	}
}
