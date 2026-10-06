package variables;

public class Casting {
	public static void main (String[] args) {
		int entero = 127;
		
		//Podemos inicializar una variablecon otra
		//Aqui el cambio es automatico
		
		long grande = entero;
		
		//Esto no se puede hacer, si descomentamos la línea de abajo falla 
		//No puedo meter una caja grande en una pequeña
		//Byte es < que int
		
		//Podemos hacer un cast, java me deja hacerlo
		int enteroQueCabe=125;
		int enteroQueNoCabe=5000;
		byte pequeña =(byte) enteroQueCabe;/**/
		byte pequeña2 = (byte) enteroQueNoCabe;
		
		//Sumar	
		String edad = "42";
		//Edad le sumamos 1
		System.out.println("Numero edad "+ (Integer.parseInt(edad) + 1) + "años");
		System.out.println("Numero edad "+ (edad + 1) + "años");
		
		//Integer.parseInt --> es para transformarlo en entero 
		
	
	}
}
