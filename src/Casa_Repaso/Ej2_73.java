package Casa_Repaso;
/*
 2.73 Cajero automático ★★★ CajeroAutomatico.java
 
 
Un cajero tiene un saldo de 500 € y solo dispone de billetes de 50, 20 y 10. 

Pide la cantidad a retirar y valida que sea positiva, múltiplo de 10, no supere los 300 € por operación y no supere el saldo. 

Si todo es correcto, muestra el desglose en el menor número de billetes y el saldo restante. 

Si no, indica exactamente qué condición falla.
 
 
 */

import java.util.Scanner;
public class Ej2_73 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cajero = 500;
		int cliente = 0;
		
		System.out.print("Cuanto dinero quieres sacar: ");
		cliente=scanner.nextInt();
		verificar(cliente,cajero);
		
		cajero -= cliente;
		
		System.out.println("");
		System.out.print("Saldo restante en el cajero: "+cajero);
		
		scanner.close();
	}// Final Main
	
	public static void verificar(int cantidad, int saldo) {
		Scanner scanner = new Scanner(System.in);
		boolean correcto = false;
		
		System.out.println("");
		while(!(correcto)) {
		if(cantidad<=0 ) {
			correcto = false;
			System.out.println("Disculpe cantidad de saldo erronea no positiva: ");
			cantidad = scanner.nextInt();}
		else if(cantidad > saldo) {
			correcto = false;
			System.out.println("No disponemos de tanto saldo porfavor pida otra cifra: ");
			cantidad = scanner.nextInt();}
		else if(!(cantidad%10==0)) {
			correcto = false;
			System.out.println("Cantidad incorrecta porfavor que sea exacta: ");
			cantidad = scanner.nextInt();}
		else {
			System.out.println("Procedemeos... ");
			correcto=true;
			}}//Final while
		
		System.out.print("Desea sacar dinero?: (responde true o false) ");
		boolean sino = scanner.nextBoolean();
		
		if(sino) {sacar(cantidad,saldo);}
		else {System.out.println(""); 
		System.out.println("Adios");}
		

		}//Final metodo1
	
	
	public static void sacar(int cantidad, int saldo) {
		
		int billetes_50 = 0;
		int billetes_20 = 0;
		int billetes_10 = 0;
		
		
		
		for(int i =0; cantidad > 0;i++) {
			
			if(cantidad - 50 !=0 || cantidad -50 ==0) {
				billetes_50 ++;
				cantidad -= 50;
			}
			else if(cantidad - 20 !=0 || cantidad - 20 == 0) {
				billetes_20 ++;
				cantidad -= 20;
			}
			else if(cantidad - 10 !=0 || cantidad - 10 == 0) {
				billetes_10 ++;
				cantidad -= 10;
			}
				
		}
		
		System.out.print("Se procedera a sacar: "+billetes_50+" billetes de 50, "+billetes_20+ " billetes de 20, "+billetes_10+" billetes de 10");
	
		
	}//Final metodo2
	
	
	
	
}// FINAL CLASE
	
	

