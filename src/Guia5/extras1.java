/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Guia5;

import java.util.Scanner;

public class extras1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Ingrese el tamaño del vector: ");
        N = input.nextInt();

        int[] vector = new int[N];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = input.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
