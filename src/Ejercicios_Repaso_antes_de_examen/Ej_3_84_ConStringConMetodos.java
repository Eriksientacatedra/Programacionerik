package Ejercicios_Repaso_antes_de_examen;

/*

1- Metodo --> avanza
2- Metodo --> Dibujar recorrido
3- Metodo --> Hay ganador


*/

import java.util.Random;

public class Ej_3_84_ConStringConMetodos {
	
	public static void main(String[] args) {
		int caracol1=0;
		int caracol2=0;
		int caracol3=0;
		//
		char A='A';
		char B='B';
		char C='C';
		//
		boolean total = true;
		int cont1=0;
		int cont2=0;
		int cont3=0;
		 
		for(int i =0; total;i++) {
			//Asignar valores aleatorios
			//Caracol 1
			caracol1=avanza(caracol1);
			//Caracol 2
			caracol2=avanza(caracol2);
			//Caracol 3
			caracol3=avanza(caracol3);
			
			
			//Avanzar los caracoles
			recorrido(A,caracol1);
			System.out.println("");
			recorrido(B,caracol2);
			System.out.println("");
			recorrido(C,caracol3);
			System.out.println("");
			//Suma 
			
			cont1+=caracol1;
			cont2+=caracol2;
			cont3+=caracol3;
			
			if(cont1>=50 || cont2>=50 || cont3>=50) {
				ganador(cont1,cont2,cont3);
				total=false;
			}}
		
		
		System.out.println(""+total+" , "+cont1+" , "+cont2+" , "+cont3);
		
		}
	
	public static int avanza(int num) {
		Random azar = new Random();
		num=azar.nextInt(4);
		return num;
	} 
	
	public static void recorrido(char letra,int cacacol) {
		String caracolcolcol = "-";
		System.out.println(letra+"-->");
		for(int i =0;i<cacacol;i++) {
			System.out.print(caracolcolcol);
		}
		System.out.print("@");
		System.out.println("");
	} 
	
	public static void ganador(int winner1,int winner2,int winner3) {
		String ganador ="";
		
		if(winner1 >winner2 && winner1> winner3) {
			ganador = "El caracol A es el ganador";
		}
		else if(winner2 >winner1 && winner2> winner3){
			ganador = "El caracol B es el ganador";
		}
		else if(winner3 >winner1 && winner3> winner2) {
			ganador = "El caracol C es el ganador";
		}
		else{ganador = "HUBO UN EMPATE";}
		
		System.out.println(ganador);
	}
	
}
