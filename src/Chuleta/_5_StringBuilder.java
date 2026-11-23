/*

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



nota del .toString() -->

.toString() sirve para convertir un objeto en un String normal (texto).

En StringBuilder se utiliza para convertirlo en un String.

¿Para qué sirve?

Imagina que has estado modificando un texto con StringBuilder, 
pero después necesitas utilizarlo en un método que recibe un String.

public static void mostrarTexto(String texto) {
    System.out.println(texto);
} --> como por eejemplo aqui pide un String

Ahí utilizas .toString().

.toString() no modifica el StringBuilder original, simplemente devuelve una copia de su contenido como String.


*/