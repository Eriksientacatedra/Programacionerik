package Ejercicios;

import java.util.Scanner;

public class Ej3_76 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			// for (int i = 5; i > 0; i--) System.out.println(i); 
		
		int i =5;
		do {
			System.out.print(""+i+ "");
			i=i-1;
		}while(i<=0);
		
			/*
			int n = sc.nextInt(); while (n < 0) n = sc.nextInt(); 
		
			*/
		
		System.out.println("");
		
		int n = -1;
		
		do {
			n  = scanner.nextInt();
			
		}while(n<=0);
		
		System.out.println(n);
		
		//
		
		int o = 1; // do { System.out.println(o * o); o++; } while (o <= 10); 
		
		while(o<=10) {
			System.out.println(o * o);
			o++;
		}
		
		
		scanner.close();
	}
}
