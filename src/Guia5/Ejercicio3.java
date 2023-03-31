/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] vector;
        int n, digitos, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        vector = new int[n];
        System.out.println("Ingrese los números de cada elemento del vector");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            digitos = String.valueOf(vector[i]).length();
            switch (digitos) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Cantidad de números de 1 dígito: " + unDigito);
        System.out.println("Cantidad de números de 2 dígitos: " + dosDigitos);
        System.out.println("Cantidad de números de 3 dígitos: " + tresDigitos);
        System.out.println("Cantidad de números de 4 dígitos: " + cuatroDigitos);
        System.out.println("Cantidad de números de 5 dígitos: " + cincoDigitos);
    }

}

        