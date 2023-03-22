/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Clase3;

import java.util.Scanner;

public class Guia3aNumAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero; // declara la variable para almacenar el número 

        // Se solicita al usuario que ingrese 4 números comprendidos entre 1 y 20
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.print("Ingrese el número " + i + " (entre 1 y 20): ");
                numero = leer.nextInt(); // lee el número ingresado por el usuario
            } while (numero < 1 || numero > 20); // se repite el ciclo mientras el número ingresado no esté entre 1 y 20

            // Imprime el número ingresado seguido de asteriscos 
            for (int j = 1; j <= numero; j++) {
                System.out.print("*");
            }
            System.out.println(); // imprime una nueva línea para separar los resultados de cada número ingresado
        }
    }
}
