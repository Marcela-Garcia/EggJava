package Clase3;

/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

/**
 *el método substring se utiliza para obtener una subcadena 
de una cadena de texto, el método equals() se utiliza para comparar dos cadenas y 
determinar si son iguales. se utilizan ambos métodos para obtener la primera 
letra de la frase ingresada y compararla con la letra "A".
 */
 import java.util.Scanner;

public class Guia3Ejerc4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra:");
        String frase = leer.nextLine();
        String primeraLetra = frase.substring(0, 1);
        
        /*
        *Este método recibe dos argumentos, el primero indica el índice de inicio (en este caso, 0),
        y el segundo indica el índice de fin (en este caso, 1), por lo que se obtiene la primera letra
        de la frase ingresada.
        Utilizar el método equals()para comparar si la primera letra obtenida es igual a "A":
        */
        
        if (primeraLetra.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
       
    }
}
