package Casa_Repaso;

/*
5.52 Validar un DNI completo ★★★ ValidarDniTexto.java
Pide un DNI como texto («12345678Z») y valídalo: longitud 9, ocho dígitos y una letra (mayúscula o
minúscula) que coincida con la calculada. Reutiliza el método letraDni del ejercicio 4.42. 
Indica el motivo exacto si no es válido
*/

import java.util.Scanner;

public class Ej5_52 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			String dnientero = "".toUpperCase();
			int ndni=0;
			char letra =' ';
			
			boolean sino = false;
			boolean sino2= false;
			
			System.out.print("Introduzca un dni de 8 caracteres y una letra: ");
			dnientero = scanner.nextLine();
			sino=verificar1(dnientero);
			System.out.println("");
			
			while(!(sino)) {
				System.out.print("Introduzcca un dni valido: ");
				dnientero = scanner.nextLine();
				sino=verificar1(dnientero);
			}
			//Hasta aqui llega
			
			//Siguiente -->
			
			//Partimos el dni
			letra=dnientero.charAt(8);
			dnientero=dnientero.substring(0,7);
			ndni+=Integer.parseInt(dnientero); //Con esto lo tranformamos a numero
			
			System.out.println(letra);
			System.out.println(ndni);
			
			sino2=verificar2(ndni,letra);
			
			
			if(!(sino)){
				System.out.println("Incorrecto numero o letra incorrecto, la letra seria: ");
				System.out.print(letradni(ndni));
				System.out.println("");
				System.out.print("Si el fallo no es la letra corrija el numero");
			}
			else {
				System.out.println("");
				System.out.print("Correcto");
			}
			
			
			
		
		scanner.close();
	}// FINAL MAIN //
	
	
	
	public static boolean verificar1(String dni) {
		boolean sino = false;
		
		if(dni.length()==9) {
			sino= true;
		}
		else {sino=false;}
		
		return sino;
	}// FINAL DE VERIFICAR1 //
	
	//
	
	public static boolean verificar2(int ndni,char letra) {
		boolean sino2 = false;
		String medidor = "";
		medidor += ndni;
		
		if(medidor.length()==8 && Character.isLetter(letra)) {
			sino2=true;
		}
		else {sino2=false;}
		
		return sino2;
	}// FINAL DE VERIFICAR2 //
	
	
	public static String letradni(int dnii) {
		double resultado = 0;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dniconletra = "";
		
		resultado= Math.round(dnii%23);
		//System.out.print(resultado); --> Hasta aqui bien
		
		for(int i=0;i <= letras.length()-1;i++) {
			if(i==resultado) {
				dniconletra = ""+dnii+""+letras.charAt(i);
				/*System.out.print(i);
				System.out.println(letras.charAt(i));*/
				System.out.println("Letra asignada: "+letras.charAt(i));
			}
		};
		
		return dniconletra;
	}// FINAL LETRA //
	
	
}// FINAL CLASS //
