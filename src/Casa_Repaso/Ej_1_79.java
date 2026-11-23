package Casa_Repaso;
/*

1.79 Conversor de tiempo completo ★★★ ConversorTiempo.java

Pide una cantidad de segundos y desglósala en días, horas, minutos y segundos. 


Después pide días,horas, minutos y segundos y haz la conversión contraria. Comprueba que, encadenando las dos,
vuelves al número original


*/
/*
1 dia --> 24 horas 
1 hora --> 60 min 
1 min --> 60 seg



*/
import java.util.Scanner;
public class Ej_1_79 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double seg = 0.0;
		double dia = 0.0;
		
		System.out.print("Introducce unos segundos: ");
		seg = scanner.nextDouble();
		pasotiempo(seg);
		
		
		//scanner.nextLine(); //Para limpiar
		
		System.out.print("Introducce unos días: ");
		dia= scanner.nextDouble();
		
		
		pasotiempo2(dia);
		
		scanner.close();
	}
	
	public static void pasotiempo(double seg) {
		double min = 0.0;
		double hor = 0.0;
		double dia = 0.0;
		
		min = seg/60;
		hor = min/60;
		dia= hor/24;
		
		System.out.println("");
		System.out.print("Los segundos introduccidos "+seg+" son: "+min+" minutos y "+hor+" horas "+ " y "+dia+" días");
		System.out.println("");
	}
	
	public static void pasotiempo2(double dia) {
		double seg = 0.0;
		double min = 0.0;
		double hor = 0.0;
		
		hor=dia*24;
		min=hor*60;
		seg=min*60;
		
		System.out.println("");
		System.out.print("Los días introduccidos "+dia+" son: "+hor+" horas y "+min+" mins "+ " y "+seg+" segundos");
		System.out.println("");
	}
	
}
