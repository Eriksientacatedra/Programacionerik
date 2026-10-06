package variables;

import java.util.Scanner;

public class ejerciciosnombres {
	public static void main(String[] args){
		
		String nombre1;
		String nombre2;
		int edad1;
		int edad2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre?: ");
		nombre1 = scanner.nextLine();
		System.out.println("Cual es tu Edad?: ");
		edad1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("");
		System.out.println("Su nombre es "+ nombre1 + " con edad "+edad1);
		System.out.println("");
		
		
		System.out.println("Cual es tu nombre?: ");
		nombre2 = scanner.nextLine();
		System.out.println("Cual es tu Edad?: ");
		edad2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("");
		System.out.println("Su nombre es "+ nombre2 + " con edad "+edad2);
		System.out.println("");
		
		
		scanner.close();
	}
}
