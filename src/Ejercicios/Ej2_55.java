package Ejercicios;

/*

Pide el número de un DNI (sin letra) y muestra la letra que le corresponde. La letra se obtiene con el
resto de dividir el número entre 23, usado como posición en la cadena "TRWAGMYFPDXBNJZSQVHLCKE":
char letra = letras.charAt(numero % 23);. Comprueba antes que el número tiene como máximo
ocho cifras y no es negativo.

*/
import java.util.Scanner;

public class Ej2_55 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
			String ndni = "";
			
			while(ndni.length()<8 || ndni.length()>8) {
				System.out.println("Escribe un numero de DNI de 8 digitos para generar una letra: ");
				ndni = scanner.nextLine().strip().toLowerCase().replaceAll(" ","");	
				System.out.println("");
			}
			
			for(int i = 0; i<ndni.length()-1;i++) {
				
			}
			
			System.out.print(ndni);
			System.out.println("");
			System.out.print(ndni.length());
	
		scanner.close();
	}
	
}
