/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
3
 */
package Guia5;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce los valores del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = leer.nextInt();
            }
        }
        if (validarCuadrado(cuadrado)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    public static boolean validarCuadrado(int[][] cuadrado) {
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if (sumaFila != 15 || sumaColumna != 15) {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            sumaDiagonal1 += cuadrado[i][i];
            sumaDiagonal2 += cuadrado[i][2 - i];
        }
        return !(sumaDiagonal1 != 15 || sumaDiagonal2 != 15);
    }
}
