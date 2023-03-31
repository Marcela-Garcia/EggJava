/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.

 */
package Guia5;

import java.util.Random; 

public class extras5 {

    public static void main(String[] args) {

        int N = 4; // cantidad de filas que tendrá la matriz
        int M = 5; // cantidad de columnas que tendrá la matriz

        int[][] matriz = new int[N][M]; 
        
        Random aleatorio = new Random(); 
           ///para llenarla con numeros aleatorios
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = aleatorio.nextInt(10); // Generamos un número aleatorio entre 0 y 9 y lo asignamos a la posición (i,j) de la matriz
            }
        }

        int suma = 0;

        // calcular la suma de sus elementos
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j]; // Suma el valor de la posición (i,j) de la matriz a la variable suma
            }
        }
           //muestra la matriz y la suma d sus elementos
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println(); 
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}
