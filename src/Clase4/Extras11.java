/*
 * Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
 */
package Clase4;

import java.util.Scanner;

public class Extras11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = leer.nextInt();
        int contador = 0;
        while (numero != 0) { //se repite mientras el num no sea = a 0
            numero /= 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}

