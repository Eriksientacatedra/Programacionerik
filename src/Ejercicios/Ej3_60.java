package Ejercicios;

/*
Pide un entero positivo. Si es par, divídelo entre 2; si es impar, multiplícalo por 3 y suma 1. 
Repite hasta llegar a 1, mostrando cada valor y el número de pasos. Prueba con 27. 

● Versión 2. Busca qué número menor que 1000 necesita más pasos.
*/

import java.util.Scanner;

public class Ej3_60 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*		
		int num = -1;
		
		while(num<=0) {
			System.out.println("Escribe un numero par o impar:");
			num=scanner.nextInt();
			System.out.println("");
		}
		
		System.out.println(num);
		while(num!=1) {
			
			if(num%2==0) {
				num /= 2;
				System.out.println(num);
			}
			else {
				num = (num * 3) + 1;
				System.out.println(num);
			}
		}
*/		
		
		//-- Version 2 no conseguida
	
		int cont=0;
		int num =0;
		int contM=0;
		int guardar=0;
		
		for(int i = 2; i<1000; i++) {
			num=i;
			while(num!=1) {
				
				if(num%2==0) {
					num /= 2;
				}
				else {
					num = (num * 3) + 1;
				}
				cont++;
			}
			
			if(cont>contM) {
				guardar=i;
				contM=cont;
				
			}
			cont=0;
			
		}
		
		System.out.println(guardar);
		System.out.println(contM);
		
		scanner.close();
	}
}
