/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.

 */
package Guia5;

import java.util.Random;

public class extras3 {

    public static void main(String[] args) {
        int[] vector = new int[10]; // Declarar un vector de tamaño 10
        llenarVector(vector); // Llamada 
        imprimirVector(vector); // Llamada 
    }

    // Función para llenar un vector con números aleatorios
    public static void llenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }
    }

    // Procedimiento para imprimir el vector
    public static void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i != vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
