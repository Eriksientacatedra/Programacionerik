/*

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
Integer --> para incluir
*** .parseInt --> Convierte una cadena de texto en un número entero. (indicando en que base por defecto en 10)

parseInt("25", 10);      // 25
parseInt("101", 2);      // 5 (binario)
parseInt("ff", 16);      // 255 (hexadecimal)
parseInt("abc", 10);     // NaN



*/


