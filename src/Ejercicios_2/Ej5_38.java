package Ejercicios_2;

/*  5.38
 
  Pide una cadena y muestra el primer carácter que aparece repetido y la posición de su segunda
aparición. Si no hay ninguno, indícalo. 

En «programa», el primero que se repite al leer de izquierda a
derecha es la r (posición 4)
  
*/

import java.util.Scanner;

public class Ej5_38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Recordar poner lowwercase
		String palabra="";
		
		System.out.print("Introduzca una palabra y veamos cuantas veces se repita la primera letra: ");
		palabra=scanner.nextLine().toLowerCase().strip().replaceAll(" ","");
		
		System.out.println("");
		
		System.out.print(Mrepetir(palabra));
		
		
		scanner.close();
	}
	
	
	public static String Mrepetir(String repetido) {
		//En este metodo indicamos si la primera letra esta repetida y cuantas veces y en que posicion
		String devolver="";
		int contador=0;;
		String posiciones="";;
		for(int i=0;i<repetido.length();i++) {
			
			if(repetido.charAt(0)==repetido.charAt(i)) {
				posiciones = posiciones + " "+i; 
				contador++;
			}
		}
		
		devolver = "Su palabra "+repetido+" su primera letra "+repetido.charAt(0)+" Se repite un total de "+contador+" veces y en las posiciones:"+posiciones ;
		
		return devolver;
	}








}
