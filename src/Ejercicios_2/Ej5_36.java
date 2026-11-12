package Ejercicios_2;
/*
 
Escribe un método que diga si una palabra se lee igual al revés, comparando caracteres desde los
extremos (sin invertir la cadena).
extremos (sin invertir la cadena).


● Versión 2. Para frases, ignorando espacios y mayúsculas («Anita lava la tina»).


*/

import java.util.Scanner;

public class Ej5_36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String frase;
		String reves;
		boolean flag = true;
		System.out.print("Introduce una frase: ");
		frase=scanner.nextLine().strip().toLowerCase().replaceAll(" ","");	
		
		System.out.println(frase);
		
		System.out.println("");
		
		for(int i = 0;i<frase.length();i++) {
			System.out.println(frase.charAt(i) + "-" + (frase.charAt(frase.length()-(i+1))));
			if(frase.charAt(i) != frase.charAt(frase.length()-(i+1))) {
				
				flag=false;
			}
			
		}
		if(flag) {
			System.out.println("Es palindromo");
		}
		else {
			System.out.println("No es palindromo");
		}
		
		
		
		
		scanner.close();
}}
