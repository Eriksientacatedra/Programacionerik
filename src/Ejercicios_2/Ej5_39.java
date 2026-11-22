package Ejercicios_2;

/*
5.39 Validar contraseñas ★★☆ ValidaPassword.java

Pide una contraseña y valida que cumple esta política: 

* al menos 8 caracteres, //HECHO
* al menos una mayúscula, //HECHO
* al menos una minúscula, //HECHO
* al menos un dígito //HECHO
* y al menos un carácter que no sea letra ni dígito. //Hecho

Si no la cumple, indica todas las reglas que fallan. Escribe un método por regla.

*/

import java.util.Scanner;

public class Ej5_39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean bien = true;
		String contraseña = "";
		
		while(bien) {
			System.out.print("Vamos a crear una contraseña: ");
			contraseña = scanner.nextLine();
			bien=caracteresMin(contraseña);
			bien=mayus(contraseña);
			bien=minus(contraseña);
			bien=digito(contraseña);
			bien=especiales(contraseña);
			break;
		}
		
		scanner.close();
	} // FINAL MAIN //
	
	  //
	 //
	//
	
	public static boolean caracteresMin(String contraseña) {
		boolean bien=false;
		System.out.println("");
		if(contraseña.length()<8 || contraseña.length()<=0) {
			System.out.print("ERROR 001: Numero de caracteres invalidos. (REINICIE)");
			bien=false;
			
		}
		else{
			System.out.print("Numero de caracteres validos.");
			bien=true;
		}
		System.out.println("");
		return bien;
	} // FINAL METODO caracteresMin //
	
	  //
	 //
	//
	
	public static boolean mayus(String contraseña) {
		boolean bien=false;
		int contador = 0;
		
		for(int i=0; i<contraseña.length();i++) {
			if(Character.isUpperCase(contraseña.charAt(i))) {
				contador ++;
			}
		}
		
		System.out.println("");
		if(contador<=0) {
			System.out.print("ERROR 002: Numero de mayusculas invalidas, se necesita al menos 1. (REINICIE)");
			bien=false;
		}
		else {
			System.out.print("La contraseña contiene mayus.");
			bien=true;
		}
		
		System.out.println("");
		return bien;
	}// FINAL DEL METODO mayus //
	
	  //
	 //
	//
	
	public static boolean minus(String contraseña) {
		boolean bien=false;
		int contador = 0;
		
		for(int i=0; i<contraseña.length();i++) {
			if(Character.isLowerCase(contraseña.charAt(i))) {
				contador ++;
			}
		}
		
		System.out.println("");
		if(contador<=0) {
			System.out.print("ERROR 003: Numero de minusculas invalidas, se necesita al menos 1. (REINICIE)");
			bien=false;
		}
		else {
			System.out.print("La contraseña contiene minusculas.");
			bien=true;
		}
		
		System.out.println("");
		return bien;
	}// FINAL DEL METODO minus //
	
	  //
	 //
	//
	
	public static boolean digito(String contraseña) {
		boolean bien=false;
		int contador = 0;
		
		System.out.println("");
		
		for(int i=0;i<contraseña.length();i++) {
			if(Character.isDigit(contraseña.charAt(i))) { //Busca si tiene digitos
				contador++;
			}
		}
		
		if(contador<=0) {
			System.out.print("ERROR 004: Numero de digitos incorrecto, se necesita al menos 1. (REINICIE)");
			bien=false;
		}
		else {
			System.out.print("La contraseña contiene digitos.");
			bien=true;
		}
		
		System.out.println("");
		return bien;
	}
	
	  //
	 //
	//
	
	public static boolean especiales(String contraseña) {
		boolean bien=false;
		int contador = 0;
		
		System.out.println("");
		
		for(int i=0;i<contraseña.length();i++) {
			if(!(Character.isLetterOrDigit(contraseña.charAt(i)))) { //Busca si tiene digitos
				contador++;
			}
		}
		
		if(contador<=0) {
			System.out.print("ERROR 005: Numero de digitos especiales incorrecto, se necesita al menos 1. (REINICIE)");
			bien=false;
		}
		else {
			System.out.print("La contraseña contiene digitos especiales.");
			bien=true;
		}
		
		System.out.println("");
		return bien;
	}
	
} // FINAL CLASS //
