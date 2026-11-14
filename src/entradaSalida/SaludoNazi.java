package entradaSalida;

import java.util.Scanner;

public class SaludoNazi {
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre;
		
		System.out.println("El mio ");
		nombre = lector.nextLine();
		System.out.print("Me fue infiel con " + nombre);
		lector.close();
	}
}

