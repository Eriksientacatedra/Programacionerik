package Ejercicios_2;

/*

5.60   Generador de contraseñas   ★★★   GeneradorPassword.java 

Genera contraseñas aleatorias de la longitud que pida el usuario. 

Cada contraseña generada debe  pasar la validación del ejercicio 5.39 (reutiliza sus métodos). 


¿Es mejor generar al azar hasta que una cumpla o construirla para que cumpla desde el principio? 

Al azar es más indescifrable

*/

import java.util.Scanner;
import java.util.Random;

public class Ej5_60 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0;
		
		tama(num);
		
		scanner.close();
	}// FINAL MAIN //
	
	public static void tama(int num) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag=false;
		
		System.out.print("Introduzca de cuanto quiera ");
		num=scanner.nextInt();
		
		while(!(flag)) {
			if(num<=8) {
				System.out.println("");
				System.out.print("Tiene que ser superior a 8 ");
				num=scanner.nextInt();
				flag=false;
			}
			else {flag=true;}
		}
		
		generar(num);
		
	} // FINAL METODO TAMA //
	
	
	public static void generar(int num) {
		Random rand = new Random();
		
		String especiales = "!@#$%&*+-_?¿¡";
		int caracter = rand.nextInt(16);
		String contraseña ="";
		boolean bien = true;
		
		
		for(int i = 0;i<num;i++) {
			int numale1 = rand.nextInt(2) ;
			int numale2 = rand.nextInt(2) ;
			int numale3 = rand.nextInt(2) ;
			int pachar1 = rand.nextInt(26)+65 ;//con esto solo mayusculas
			int pachar2 = rand.nextInt(26)+97 ;//con esto solo minusculas
			int panumero = rand.nextInt(10) ;
			
				
				if(numale1==0) {
					contraseña += panumero;
				}
				else{
					if(numale2==0) {
						contraseña += especiales.charAt(caracter);
					}
					else{
						
							if(numale3 == 2) {
								char letra = (char) pachar1; //con esto solo mayusculas
								contraseña += letra;
							}
							else {
								char letra = (char) pachar2; //con esto solo minusculas
								contraseña += letra;
							}
						
					}
					
					
				}	
		}
		
		while(bien){
			bien=mayus(contraseña,num);
			bien=minus(contraseña,num);
			bien=digito(contraseña,num);
			bien=especiales(contraseña,num);
		}
		
		System.out.println("");
		System.out.print(contraseña);
		
	} // FINAL GENERAR //
	
	public static boolean mayus(String contraseña, int num) {
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
			generar(num);
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
	
	public static boolean minus(String contraseña, int num) {
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
			generar(num);
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
	
	public static boolean digito(String contraseña, int num) {
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
			generar(num);
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
	
	public static boolean especiales(String contraseña, int num) {
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
			generar(num);
		}
		else {
			System.out.print("La contraseña contiene digitos especiales.");
			bien=true;
		}
		
		System.out.println("");
		return bien;
	}
	
	
}// FINAL CLASS //
