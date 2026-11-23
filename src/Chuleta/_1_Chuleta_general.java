/*

Cosas para saber si contiene -->

-
-
-


1--> Character.
	___________
		- isUpperCase(ejemplo.charAt(i)) --> Mira si dentro de la cadena contiene mayusculas.
		- isLowerCase(ejemplo.charAt(i)) --> Mira si dentro de la cadena contiene minusculas.
		- isDigit(ejemplo.charAt(i)) --> Mira si dentro de la cadena contiene numeros.
		- isLetterorDigit(ejemplo.charAt(i)) --> Mira si dentro de la cadena contiene letras o numeros

Ejemplo de formacion:

///// Character.isLetterorDigit(ejemplo.charAt(i)). //////


____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

2--> Metodos -->

-
-
-

***.startsWith("Por lo que emppieza y quieras buscar") --> Sirve para comprobar si un String empieza por un texto o carácter concreto.
 _____________											Devuelve un boolean:
													- true → si empieza por lo que buscas.
													- false → si no empieza por ello.
--------------------------
Ejemplo de optimizacion

String s = "Programacion";
boolean empieza = s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' && s.charAt(2) == 'o';

// En cambio con el metodo se queda en -->

empieza=s.startsWith("pro"); //Esto esta haciendo que si empeiza por esa salte true o false
System.out.print(empieza);

Ejemplo de formacion:

///// variable(boolean)=s.startsWith("pro"); /////

--------------------------

-
-
-


*** .indexOf()--> Sirve para buscar algo dentro de un String y decirte en qué posición se encuentra.
 	__________

Lo usamos para saber en que posicion se encuentra algo.

-------------------------------------
Devuelve un número (int):

Ejemplo practivo:

String texto = "Hola mundo";
				0123456789

System.out.println(texto.indexOf('o')); // 1
System.out.println(texto.indexOf('m')); // 5
System.out.println(texto.indexOf('a')); // 3
--------------------------------------

Ejemplo de optimizacion:

int pos = -1;
	for (int i = 0; i < s.length() && pos == -1; i++) {
		if (s.charAt(i) == '@') { pos = i;}
		}
		
//En este para entender indica que cuando el bucle encuentre @ guardara la posicion en pos
		
Estaria más claro y más optimizado asi -->

System.out.println(s.indexOf('@')); 

Ejemplo de formacion: ******

cadena.indexOf('Lo que querramos saber la posicion en la cadena')

-----------------------------------------

-
-
-


*** .substring(desde donde queremos, hasta donde queremos) --> sirve para extraer una parte de un String
     _________
--------------
Ejemplo:

trozo.de.cadena=cadena.substring(2,6) --> nos coge desde la posicion 2, hasata la 6
Hola mundo! --> Se nos quedaria en: "la mu"
01234567891							 23456
		  0							 01234 --> Ahora en la nueva variable trozo.de.cadena se guardaria asi


---------------------------------------------
Ejemplo de optimizacion:

String r= "";
	for (int i=2;i<6;i++) {
		r +=cadena.charAt(i);
	}
// aqui le mandamos ir guardando el caracter de la posicion i desde el dos al 6

//El metodo que hace esto de la clase String es substring
 
System.out.println(s.substring(2,6)); // coge del 2 - al 6

Ejemplo de formacion: ********

///// variable.nueva=cadena.substring(2,6) /////
										^
										|
										Aqui de que posicion a que posicion queremos guardar.
										(Posicion inicial,Posicion final).
-------------------------------------------

-
-
-


*** .isEmpty() --> sirve para comprobar si un String está vacío, es decir, si no contiene ningún carácter.

	Devuelve un boolean:
	- true → está vacío ("").
	- false → tiene algún contenido.

-------------------------------

Ejemplo de optimizacion:

boolean vacia = cadena.length() == 0;

// En este creeamos un booleano siempre y cuando este vacia la cadena
 
cadena.isEmpty()

Ejemplo de formacion:

cadena.isEmpty()

-------------------------------


3 Matematicas:


// METODOS MATH EN JAVA

Math.abs(-5);       // Valor absoluto -> 5
Math.max(4, 9);     // Devuelve el mayor -> 9
Math.min(4, 9);     // Devuelve el menor -> 4
Math.pow(2, 3);     // Potencia -> 8.0
Math.sqrt(25);      // Raiz cuadrada -> 5.0
Math.round(4.7);    // Redondea -> 5
Math.ceil(4.2);     // Redondea hacia arriba -> 5.0
Math.floor(4.8);    // Redondea hacia abajo -> 4.0
Math.random();      // Numero aleatorio entre 0.0 y 1.0


// NUMERO ALEATORIO DEL 1 AL 10
int numero = (int) (Math.random() * 10) + 1;


------------------------------------------


4. StringBuilder -->

StringBuilder sirve para crear y modificar cadenas de texto (String) sin tener que crear un String nuevo 
cada vez que haces un cambio, Es parecido a crear un String normal, pero puedes modificarlo.

1. Crear un StringBuilder:

StringBuilder nombre_que_se_quiera_dar = new StringBuilder("Hola");



2.MÉTODOS MÁS IMPORTANTES DE STRINGBUILDER (No todos se pueden usar en string normal)
(→ = También se puede usar en String)

.append()      -> Añade texto al final
.insert()      -> Inserta texto en una posición
.delete()      -> Borra caracteres
.replace()     -> Sustituye una parte --------> Si se puede     
.reverse()     -> Invierte el texto
.charAt()      -> Obtiene un carácter --------> Si se puede
.length()      -> Devuelve la longitud -------> Si se puede
.toString()    -> Lo convierte en String


// y con esto ya puedes trabajar con StringBuilder
 
Ejemplo:


StringBuilder texto = new StringBuilder("Hola");
			---------

texto.append(" mundo");      // Añadir
texto.insert(0, "Ey ");      // Insertar
texto.delete(0, 3);          // Eliminar
texto.replace(0, 2, "XX");   // Sustituir
texto.reverse();             // Invertir
texto.charAt(0);             // Obtener caracter
texto.length();              // Longitud
texto.toString();            // Convertir a String


------------------------------------------------------------------------------------



















Como Declarar -->

*** Scanner:

import java.util.Scanner; <-- importar el scanner

public static void main(String[] args){
	Scanner nombre = new Scanner(System.in); <---- Declararle


	nombre.close(); <--- Cerrarlo
}

-------------------------------------------------------------------------------------

*** Random:

import java.util.Random; <-- importar el random


public static void main(String[] args){
	Random nombre = new Random(); <---- Declararle

}


Como usarlo:

rd.nextInt(10);       // Entero del 0 al 9
rd.nextInt(10) + 1;   // Entero del 1 al 10
rd.nextDouble();      // Decimal entre 0.0 y 1.0
rd.nextBoolean();    // true o false aleatorio
rd.nextLong();       // Número long aleatorio (Entero más largo)


----------------------------------------------------------------------------------------


























































































































































































































































































































































































































































































*/
package Chuleta;


