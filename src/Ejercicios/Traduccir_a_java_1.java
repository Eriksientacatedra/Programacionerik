package Ejercicios;

import java.util.Scanner;

public class Traduccir_a_java_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int a = 0;
		int b = 0;
		
		System.out.println("Introducca valores a y b");
		System.out.print("a: "); a = scanner.nextInt(); 
		System.out.print("b: "); b = scanner.nextInt(); 
		
		/*
		if(a==b){
			
			System.out.print("Sus numeros son iguales a: "+ a + " b: "+ b );
			
		}
		else{if(a>b){
			
			System.out.print("a: "+ a + " es mayor que b: "+ b );
		}
		else{
			
			System.out.print("a: "+ a + " es menor que b: "+ b );
		}
			
		}
		*/
		
		if(a>b){
			
			System.out.print("a: "+ a + " es mayor que b: "+ b );}
		else if(a<b){
			
			System.out.print("a: "+ a + " es menor que b: "+ b );}
		else {
			System.out.print("Sus numeros son iguales a: "+ a + " b: "+ b );
		}
		
		scanner.close();
	}
	
}
