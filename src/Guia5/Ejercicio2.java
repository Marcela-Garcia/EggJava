/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Guia5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        // Crear el vector de tamaño n y llenarlo con valores aleatorios
        int[] vector = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Los valores aleatorios estarán entre 0 y 99
        }

        // Mostrar el vector generado
        System.out.println("Vector generado: " + Arrays.toString(vector));

        // Pedir al usuario que ingrese el número a buscar
        System.out.print("Ingrese un número a buscar en el vector: ");
        int numeroABuscar = input.nextInt();

        // Buscar el número en el vector y muestra su posición
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroABuscar) {
                if (!encontrado) {
                    System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + i);
                    encontrado = true;
                } else {
                    System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + i + " (repetido)");
                }
            }
        }

        // Mostrar un mensaje si el número no se encontró en el vector
        if (!encontrado) {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el vector");
        }
    }
}
/*
genera un vector de tamaño N con valores aleatorios entre 0 y 99, luego le pide al usuario 
que ingrese un número a buscar en el vector. El programa muestra dónde se encuentra 
el número buscado y si se encuentra repetido.
utiliza un objeto de la clase Scanner para pedir al usuario que ingrese el 
tamaño del vector y el número a buscar. Luego, utiliza un objeto de la clase Random 
para generar los valores aleatorios del vector.
Una vez generado el vector, el programa lo muestra por consola utilizando el método toString() 
de la clase Arrays.
utiliza un bucle for para buscar el número ingresado por el usuario en el vector. 
Si encuentra el número, el programa muestra la posición en la que se encuentra el número. 
Si el número se encuentra más de una vez en el vector, muestra un mensaje indicando que el número está repetido.


*/