package Ejercicios_2;

/*

 Escribe un método esPrimo(int n) y úsalo para escribir otro contarPrimos(int desde, int hasta)
y otro siguientePrimo(int n) (el primer primo mayor que n). El main prueba los tres.

*/

import java.util.Scanner;

public class Ej4_47 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		
		System.out.print(esprimo(num));
		
		scanner.close();
	}
	
	public static String esprimo(int num) {
		String resultado = "";
		boolean tf = true;
		if(num%num+1==0) {
			tf=false;
		}
		if(tf) {
			resultado = "Es primo";
		}
		else {resultado = "No es primo";}
		
		return resultado;
	}
	
	
}
