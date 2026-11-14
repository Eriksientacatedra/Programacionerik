package Ejercicios_2;

/*

Pide un nombre de fichero y muestra por separado el nombre y la extensión («informe.final.pdf» →
«informe.final» y «pdf»). Si no tiene extensión, indícalo. Después, di si es un fichero de código Java

*/

import java.util.Scanner;

public class Ej5_34 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca su documento: ");
			String documento = sc.nextLine();
			
			
			String sobrante1="";
			String sobrante2="";
			int nuevo=documento.lastIndexOf('.');
			int conta = documento.length();
			//boolean flag = true;
			
			
			/*for(int i=conta-1;flag;i--) {
				if(documento.charAt(i)==('.')) {
					sobrante1=documento.substring(i,conta);
					sobrante2=documento.substring(0,i);
					flag = false;
				}
			}*/
			
			sobrante1=documento.substring(0,nuevo);
			sobrante2=documento.substring(nuevo,conta);
			
		
			System.out.println(sobrante1+ " "+ sobrante2);
			
			
			
			
			
			sc.close();
		}
	
	
	
}
