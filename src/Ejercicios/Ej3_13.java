package Ejercicios;

/*

3.13 Un factorial que siempre da cero   ★☆☆
 
 Encuentra el error. 
 
 int fact = 0; 
 for (int i = 1; i <= n; i++) fact *= i; 
 System.out.println(n + "! = " + fact); 

*/


public class Ej3_13 {
	public static void main(String[] args) {
	 int fact = 1; //Si esta a cero **** 
	 int n = 10; // Este entendemos que lo pasa usuario
	 
	 for (int i = 1; i <= n; i++) {
		 fact *= i; // **** multiplica por 0 todo el rato
		 System.out.println(n + "! = " + fact);}
	}
	
// El problema era que no tenia las llaves y que la variable esta a 0 eso solo multiplica por 0 todo el rato
}
