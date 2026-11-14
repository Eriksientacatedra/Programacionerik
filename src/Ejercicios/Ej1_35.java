package Ejercicios;

import java.util.Scanner;

public class Ej1_35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double base = 0;
		double altura = 0;
		
		System.out.println("Introduzca la base y la altura para calcular el perimetro");
		System.out.print("Base: "); base = scanner.nextDouble();
		System.out.print("Altura: "); altura= scanner.nextDouble();
		
		System.out.println("");
		
		double area = (base * altura);
		double perimetro = 2 * (base + altura);
		
		System.out.print("Su perimetro es: " + perimetro + " y su area es de: " + area);
		
		
		scanner.close();
	}
}
