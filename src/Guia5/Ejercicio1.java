/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Guia5;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaración del vector de tamaño 100
        int[] numeros = new int[100];

// Llenado del vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

// Recorrido del vector en orden descendente y muestra de los números por pantalla
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
      }