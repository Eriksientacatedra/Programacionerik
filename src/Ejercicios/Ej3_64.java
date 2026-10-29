package Ejercicios;
/*
  Dibuja una pirámide centrada de altura n.
  
 */

import java.util.Scanner;

public class Ej3_64 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = -1;
		int suma =0;
		
		while(num<0) {
		
			System.out.print("Introduzca el numero: "); 
			num = scanner.nextInt();
			System.out.println("");
		}
		
		for(int i = 1; i<=num;i++) {
			for(int p = 1; p<=i;p++) {
				System.out.print("*"); 
			}
			System.out.println("");
			
		}
		
		//Seguir apartir de aqui
		
		for(int i = 1; i<=num;i++) {
			for(int p = 1; p<=i;p++) {
				System.out.print("*"); 
			}
			System.out.println("");
			
		}
		
		
		
		
		
		
		scanner.close();
	}
}
