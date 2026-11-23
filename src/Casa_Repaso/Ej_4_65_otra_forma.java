package Casa_Repaso;

// Multiplicar primer metodo pide un numero y el otro hasta cuando

import java.util.Scanner;

public class Ej_4_65_otra_forma {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		
		int num1 =0;
		int num2 =0;
		
		System.out.print("Que numero quieres multiplicar: ");
		num1=scanner.nextInt();
		System.out.println("");
		System.out.print("Hasta que numero quieres multiplicar si quieres por defecto (10) marca 0: ");
		num2=scanner.nextInt();
		
		if(num2<=0) {
			multiplicacion1(num1);
		}
		else {
			multiplicacion2(num1,num2);
		}
		
		
		scanner.close();
	}
	
	
	public static void multiplicacion1(int num) {
		
		for(int i = 0; i<=10;i++){
			System.out.println(""+num+" x "+i+" = "+(num*i));
		}
		
	}
	
	public static void multiplicacion2(int num1,int num2) {
			
		for(int i = 0; i<=num2;i++){
				System.out.println(""+num1+" x "+i+" = "+(num1*i));
		}
			
	}
	
	
	
	
}
