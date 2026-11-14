package Ejercicios;

/*

Pide un número e indica si es primo 
(solo es divisible entre 1 y entre sí mismo; el 1 no es primo). 

Versión 2. Optimízalo: deja de buscar en cuanto encuentres un divisor y busca 
solo hasta la raíz cuadrada del número. Cuenta las vueltas que da cada versión con 1 000 003. 

*/


import java.util.Scanner;

public class Ej3_48 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int num1 = 0;
		boolean reketona = true;
		int divisor = 0;
		int contador = 0;
		
		
		
		System.out.print("Introduzca un Numero: "); num1=scanner.nextInt();
		
		/*
		for(int i = 1;reketona;i++) {
			if(num1%i==0) {
				divisor++;
			}
			else if(divisor>=3) {
				reketona=false;
				System.out.println("Su numero no es primo");
				}
				else{
					reketona=false;
					System.out.println("Su numero es primo");
				}
			contador++;
		}*/
		
		/*
		contador=2;
		while(reketona && contador<=num1) {
			if(num1%contador==0) {
				reketona=false;
			}
			
			contador++;
			divisor++;
		}
		
		if(reketona) {
			System.out.println("Su numero es primo");
		}
		else{System.out.println("Su numero no es primo");}
		
		
		System.out.println("Contador: "+ divisor);
		*/
		
		//System.out.println(contador);
		
		
		
		
		
		// -- Version 2:
		
		
		contador=2;
		while(reketona && contador<=Math.sqrt(num1)) {
			if(num1%contador==0) {
				reketona=false;
			}
			
			contador++;
			divisor++;
		}
		
		if(reketona) {
			System.out.println("Su numero es primo");
		}
		else{System.out.println("Su numero no es primo");}
		
		
		System.out.println("Contador: "+ divisor);
		
		scanner.close();
	}
}
