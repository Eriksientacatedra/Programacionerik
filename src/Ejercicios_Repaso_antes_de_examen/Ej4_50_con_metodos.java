package Ejercicios_Repaso_antes_de_examen;
/*

4.50 Números perfectos ★★☆ NumerosPerfectos.java

Escribe un método sumaDivisoresPropios(int n) y otro esPerfecto(int n). Muestra los números
perfectos menores que 10 000.

*/

import java.util.Scanner;

public class Ej4_50_con_metodos {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero para verificar si es perfecto: ");
		num=scanner.nextInt();
		
		System.out.println("");
		System.out.println(suma(num));
		
		scanner.close();
	}
	
	public static String suma(int num) {
		String devolver="";
		int perfectcell = 0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				perfectcell += i;
			}}
		
		devolver=perfecto(num,perfectcell);
		
		return devolver;
	}
	
	
	public static String perfecto(int num, int num2) {
		
		String devolver="";
		
		if(num == num2) {
			devolver="Es perfelto papi";
		}
		else {devolver="No es perfelto papi";}
		
		return devolver;
	}
	
	
	
}
