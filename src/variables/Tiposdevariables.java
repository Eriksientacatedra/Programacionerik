package variables;

import java.util.Scanner;

public class Tiposdevariables {
	public static void main(String[] args) {
		
		//Definimos variables de tipo entero
		byte numerosMuypequenos = 100;
		short numeroPequeno = 3550;
		// Ademas de declarar, le podemos dar un valor inicial
		int numeroEstandar = 350000000;
		long numeroGrande = 350000000;
		
		//Para variables numericas decimales
		
		float decimalPequeño = 3.15F;
		double decimalGrande = 3.1555555555555555555555555555555555;
		
		//Existen variables que permiten guardar caracteres
		
		char caracter1 = 'a';
		char caracter2 = 'P';
		char caracter4 = '.';
		char caracter5 = 'a';
		String cadena6 = "Hola buena tarde";
		
		//Hay variables logicas, se usan mucho en bucles y condiciones
		boolean verdadero = true;
		boolean falso = false;
		
		//Cadenas de caracteres
		String cadena1 = "Hola puta";
	
		// Para escribir:
		System.out.print("Sin saltar de linea, escribe seguido");
		System.out.println("Escribe con salto de linea");
		
		Scanner scanner = new Scanner(System.in); 
		//Crear variables y leerlas
		//Para cada variable al leerla para introduccir datos necesitamos indicarle que tipo de dato
		
		//Declarando variable a la vez que le pedimos datos
		System.out.println("Introducce tu nombre ");
		String nombre = scanner.nextLine(); //Lee el texto //Como es texto le indicamos que es texto
		
		
		//Declarar variable antes de usarla
		double altura;
		System.out.println("Introducce tu altura en metros (numero decimal, ej.1,75): ");
		altura = scanner.nextDouble(); //Como es con decimales se lo indicamos
		
		//Mostrar resultados con
		System.out.println(nombre);
		System.out.println(altura);
		
		scanner.close();
	}

}
