package Ejercicios;

import java.util.Scanner;

public class Ej3_76 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			// for (int i = 5; i > 0; i--) System.out.println(i); 
		
		int i =5;
		do {
			System.out.print(i+ "");
			i=i-1;
		}while(i<=0);
		
		
		scanner.close();
	}
}
