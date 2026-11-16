package Ejercicios_2;
/*

5.56 Usa el método adecuado ★☆☆

Cada fragmento reimplementa a mano un método que ya existe en String. Sustitúyelo por una sola
llamada.

a)
boolean empieza = s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' &&
s.charAt(2) == 'o';

b)
int pos = -1;
for (int i = 0; i < s.length() && pos == -1; i++) if (s.charAt(i) == '@') pos = i;


c)
String r = "";
for (int i = 2; i < 6; i++) r += s.charAt(i);


d)
boolean vacia = s.length() == 0;

¿En qué situación tendría sentido escribirlos a mano?
  
  
 
 */
public class Ej5_56 {

	public static void main(String[] args) {
	
	String s = "Programacion";
		
		//a
		
	
	boolean empieza = s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' &&
	s.charAt(2) == 'o';
		
	
		//Seria con -->
	
	empieza=s.startsWith("pro"); //Esto esta haciendo que si empeiza por esa salte true o false
	System.out.print(empieza);
		
		
	System.out.println("");
		//b
		
	int pos = -1;
	for (int i = 0; i < s.length() && pos == -1; i++) {
		if (s.charAt(i) == '@') { pos = i;}}
		
	
		//Seria con -->
	
	System.out.println(pos);
	//El metodo de string que ya hace esto es IndexOF
	System.out.println(s.indexOf('n'));//indexOf() en Java sirve para buscar la posición de un carácter o texto dentro de un String.
	
	
	System.out.println("");
	//c
	String r= "";
	for (int i=2;i<6;i++) {
		r +=s.charAt(i);
	}
	System.out.println(r);
	System.out.println("a");
	
	//El metodo que hace esto de la clase String es substring
	System.out.println(s.substring(2,6)); // coge del 2 - al 6
	
	System.out.println("");
	
	//d
	boolean vacia = s.length() == 0;
	
	//para comprobar si esta vacia
	
	//Podemos usar isEmpty -->
	
	System.out.println(s.isEmpty());
	
}}
