package Casa_Repaso;

/*
4.46 Leer un entero con validación ★★☆ LeerEnteroValidado.java

Escribe un método leerEntero(Scanner sc, String mensaje, int min, int max) que muestre el
mensaje, lea un entero y repita la pregunta hasta que esté entre min y max. 

Úsalo en un main que pida un día, un mes y una hora. Este método te servirá en casi todos los ejercicios siguientes.

*/


/*
 Ordenados por número de días:
28 días (29 en año bisiesto)
- 2 → Febrero
30 días
- 4 → Abril
- 6 → Junio
- 9 → Septiembre
- 11 → Noviembre
31 días
- 1 → Enero
- 3 → Marzo
- 5 → Mayo
- 7 → Julio
- 8 → Agosto
- 10 → Octubre
- 12 → Diciembre

 */



import java.util.Scanner;

public class Ej4_46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia =-1;
		int mes =-1;
		double hora =-1.0;
		
		dia(dia,mes,hora);
		
		scanner.close();
	}// Final Main
	
	public static void dia(int dia, int mes, double hora) {
		Scanner scanner = new Scanner(System.in);	
		boolean flag = false;
		int cont = 0;
		
		System.out.print("Introduza un mes: ");
		mes = scanner.nextInt();
		while(!(flag)) {
			if(mes <= 0) {
				System.out.print("Muy pequeño: ");
				mes = scanner.nextInt();
				System.out.println("");
				cont ++;
				flag = false;
			}
			else if(mes > 12) {
				System.out.print("Muy Grande: ");
				mes = scanner.nextInt();
				System.out.println("");
				cont ++;
				flag = false;
			}
			else {
				System.out.println("Okkkk");
				System.out.print("");
				cont ++;
				flag = true;
			}
			}//Final while
		
			flag=false;
		
			
			
			System.out.print("Introduza un día: ");
			dia = scanner.nextInt();
			System.out.println("");
		while(!(flag)) {
			
			if(mes == 2) {
				System.out.println("Bisiesto: ");
				if(dia <28) {
					System.out.print("Muy Pequeño: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else if(dia>28){
					System.out.print("Muy Grande: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else {
					System.out.println("Okkkk");
					System.out.print("");
					flag = true;
				}
			}
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("de 30: ");
				if(dia <30) {
					System.out.print("Muy Pequeño: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else if(dia>30){
					System.out.print("Muy Grande: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else {
					System.out.println("Okkkk");
					System.out.print("");
					flag = true;
				}
			}
			else {
				System.out.println("de 31: ");
				if(dia <31) {
					System.out.print("Muy Pequeño: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else if(dia>31){
					System.out.print("Muy Grande: ");
					dia = scanner.nextInt();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else {
					System.out.println("Okkkk");
					System.out.print("");
					flag = true;
				}
			}}// Final while2
		
			flag = false;
		
			
			
			System.out.print("Introduzca una hora: ");
			hora=scanner.nextDouble();
			System.out.print(" ");
			
			while(!(flag)) {
				if(hora < 00.00) {
					System.out.print("Muy Pequeño: ");
					hora = scanner.nextDouble();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else if(hora > 23.59) {
					System.out.print("Muy Grande: ");
					hora = scanner.nextDouble();
					System.out.println("");
					cont ++;
					flag = false;
				}
				else {
					System.out.println("Okkkk");
					System.out.print("");
					flag = true;
				}
			
			}//Final while3
			
			System.out.printf("Su resultado es: día %d, en el mes %d, a la hora: %.2f, realizado en %d intentos ", dia,mes,hora,cont);
		
	}// Final metodo1
	
	

	
	
}//Final class

