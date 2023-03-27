/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Guia5;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaración de variables
        int[] vector;
        int n, num, cont = 0, pos = -1;
        boolean repetido = false;
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario el tamaño del vector y el número a buscar
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        System.out.print("Ingrese el número a buscar: ");
        num = leer.nextInt();

        // Creación del vector con valores en orden ascendente
        vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = i + 1;
        }

        // Búsqueda del número y comprobación de si está repetido
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                cont++;
                if (pos == -1) {
                    pos = i;
                } else {
                    repetido = true;
                }
            }
        }

        // Mostrar los resultados de la búsqueda
        if (pos != -1) {
            System.out.println("El número " + num + " se encuentra en la posición " + pos);
            if (repetido) {
                System.out.println("El número " + num + " está repetido " + cont + " veces.");
            } else {
                System.out.println("El número " + num + " no está repetido.");
            }
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }

}
