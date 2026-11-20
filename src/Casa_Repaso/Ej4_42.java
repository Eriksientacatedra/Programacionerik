package Casa_Repaso;
/*
 4.42 Validar un DNI ★★☆ ValidarDni.java
Escribe un método letraDni(int numero) que devuelva la letra (la regla está en el ejercicio 2.55) y
otro esDniValido(int numero, char letra) que lo use. El main pide número y letra y dice si el DNI
es válido.

*/

/*
2.55 Letra del DNI ★★☆ LetraDni.java
Pide el número de un DNI (sin letra) y muestra la letra que le corresponde. La letra se obtiene con el
resto de dividir el número entre 23, usado como posición en la cadena "TRWAGMYFPDXBNJZSQVHLCKE":
char letra = letras.charAt(numero % 23);. Comprueba antes que el número tiene como máximo
ocho cifras y no es negativo.
*/




import java.util.Scanner;

public class Ej4_42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sino = false;
		int ndni = 0;
		String dnicompleto="";
		char letra = ' ';
		String confirmacion = "";
		
		
		
		System.out.print("Introduzca su numero de ndi: ");
		ndni = scanner.nextInt();
		System.out.println("");
		
		sino=verificardni(ndni);
		
		while(!(sino)) {
			System.out.print("Introduzca su numero de ndi: ");
			ndni = scanner.nextInt();
			System.out.println("");
			sino=verificardni(ndni);
		}
		
		System.out.println(""); //Hasta aqui llego
		dnicompleto=letradni(ndni);
		
		System.out.print("Su dni con letra es el siguiente: "+dnicompleto);
		
		
		//Nueva parte -->
		//
		//
		//
		
		System.out.println("");
		
		System.out.print("Introducce tu dni y la letra para verificar si es correcto: ");
		ndni = scanner.nextInt();
		System.out.println("");
		sino = false;
		sino=verificardni(ndni);
		
		while(!(sino)) {
			System.out.print("Introduzca su numero de ndi: ");
			ndni = scanner.nextInt();
			System.out.println("");
			sino=verificardni(ndni);
		}
		
		System.out.println(""); 
		System.out.print("Introducce la letra de su dni: ");
		letra = scanner.next().toUpperCase().charAt(0);
		System.out.println("");
		
		
		verificarletradni(ndni,letra);
		
		//
		//
		//
		//
		scanner.close();
	}
	
	public static boolean verificardni(int dni) {
		boolean flag = false;
		String verificador= "";
		verificador += dni;
		if(verificador.length()==8) {
			flag = 	true;
		}
		else {
			flag = false;
		}
		
		return flag;
		
		}
	
	/*
	• 0: T | 1: R | 2: W | 3: A | 4: G | 5: M
	• 6: Y | 7: F | 8: P | 9: D | 10: X | 11: B
	• 12: N | 13: J | 14: Z | 15: S | 16: Q | 17: V
	• 18: H | 19: L | 20: C | 21: K | 22: E
	 */
	
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
	}
	
	
	//Segunda Parte -->
	//
	//
	//
	//
	public static void verificarletradni(int dniii, char letra){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		double asignada = Math.round(dniii%23);
		char letrabuena = ' ';
		
		for(int i =0;i<=letras.length()-1;i++) {
			if(i==asignada) {
				letrabuena = letras.charAt(i);
			}
		}
		
		if(letrabuena == letra) {
			System.out.println("Letra correcta acertaste");
		}
		else {
			System.out.println("Letra INcorrecta, la letra correcta es: "+letrabuena);
		}
		}
	
	
	
}// Final clase
