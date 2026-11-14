package Ejercicios_2;

/*

Pide una contraseña y comprueba que tiene al menos 8 caracteres. Si no, indica cuántos le faltan.


*/

import java.util.Scanner;

public class Ej5_31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Introduzca una contraseña de 8 caracteres: ");
		String contraseña=scanner.nextLine();
		
		if(contraseña.length()<8) {
			System.out.print("A tu contrasela le faltan: "+(8-contraseña.length()));
		}
		else {System.out.print("Contraseña correcta");}
		
		
		
		
		
		
		scanner.close();
	}
	
	
	
	
}
