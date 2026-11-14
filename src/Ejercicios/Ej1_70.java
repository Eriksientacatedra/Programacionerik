package Ejercicios;

import java.util.Scanner;

public class Ej1_70 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		int min;
		int hor;
		int anadido;

		System.out.print("Indique un numero de Horas: "); hor=scanner.nextInt();
		System.out.print("Indique un numero de Minutos: "); min=scanner.nextInt();
	
		min=hor*60+min;
		hor= min / 60;
		min %= 60;
		
		System.out.println("Su numero de horas: "+hor);
		System.out.println("Su numero de minutos: "+min);
		
		System.out.print("Añada minutos: "); anadido = scanner.nextInt();
		
		min=hor*60+min+anadido;
		hor= min / 60;
		min %= 60;
		
		System.out.printf("Hora resultante %02d:%02d", hor,min);
		
	scanner.close();
}
}
