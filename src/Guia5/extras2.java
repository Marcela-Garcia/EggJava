/*
 * Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Guia5;

import java.util.Scanner;

public class extras2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el tamaño de los vectores: ");
        N = leer.nextInt();

        int[] vector1 = new int[N];
        int[] vector2 = new int[N];

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < N; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vector1[i] = leer.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = leer.nextInt();
        }

        boolean iguales = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
