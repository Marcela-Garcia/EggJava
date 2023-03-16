package Clase02;

/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

/**
 *Utilizar el método substring() de la clase String para obtener el primer caracter 
 * de la frase ingresada por el usuario.
 * 
 */
 import java.util.Scanner;
 
public class ejercicio10 {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese una frase o palabra:");
            String frase = sc.nextLine();
            
            String primeraLetra = frase.substring(0, 1);
            
            /*
            *Este método recibe dos argumentos, el primero indica el índice de inicio (en este caso, 0),
            y el segundo indica el índice de fin (en este caso, 1), por lo que se obtiene la primera letra
            de la frase ingresada.
            Utilizar el método equals() de la clase String para comparar si la primera letra obtenida es igual a "A":
            */
            
            if (primeraLetra.equals("A")) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        }
    }
}

/*
Este programa le pide al usuario que ingrese una frase o palabra por consola, utiliza el método 
substring() de la clase String para obtener la primera letra de la frase ingresada, y luego 
utiliza el método equals() de la clase String para comparar si la primera letra es igual a "A". 
Si la primera letra es "A", se muestra un mensaje de "CORRECTO", de lo contrario se muestra un mensaje 
de "INCORRECTO".

En resumen, el método substring() de la clase String se utiliza para obtener una subcadena 
de una cadena de texto, mientras que el método equals() se utiliza para comparar dos cadenas y 
determinar si son iguales. En este programa, se utilizan ambos métodos para obtener la primera 
letra de la frase ingresada y compararla con la letra "A".
*/
