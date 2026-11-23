package Casa_Repaso;

// no me sale

import java.util.Scanner;


public class Ej_piramides {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("De cuanto quiere la piramide: ");
		int base = scanner.nextInt();
		piramide1(base);
		System.out.println("");
		piramide1_2(base);
		System.out.println("");
		piramide2(base);
		System.out.println("");
		piramide3(base);
		
		scanner.close();
	}
	
	public static void piramide1(int num) { //Con esto sale la invertida
		
		for(int i = 0; i<num;i++) {
			for(int pp=i;pp<num;pp++) {System.out.print("*");}
			System.out.println("");
		}		
	}
	
	public static void piramide1_2(int num) { //Con esto sale la invertida
		
		for(int i = 0; i<num;i++) {
			for(int pp=num;pp>i;pp--) {System.out.print("*");}
			System.out.println("");
		}		
	}
	
	public static void piramide2(int num) { //Con esto sale la invertida
			
			for(int i = 0; i<num;i++) {
				for(int pp=0;pp<=i;pp++) {System.out.print("*");}
				System.out.println("");
			}		
		}
	
	public static void piramide3(int num) { //Con este sale en espejo
		
		for(int i=0; i<num; i++) {
		    for(int pp=num; pp>i+1; pp--) { // sirve para que los espacios vayan disminuyendo
		        System.out.print(" ");
		    }
		    for(int pp=0; pp<=i; pp++) {
		        System.out.print("*");
		    }
		    System.out.println("");}
			
	}
	
	
	
}
