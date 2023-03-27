/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 
1 y 10 y se muestre su equivalente en romano.
 */
package Guia3;

import java.util.Scanner;

public class Extras4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 

        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = leer.nextInt();

        String numeroRomano = ""; // Inicializar una cadena vacía que contendrá el número romano.

        switch (numero) { //  switch para seleccionar el número romano según el valor ingresado.
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default: // Si el número ingresado está fuera del rango, mensaje de error y salir del programa.
                System.out.println("El número ingresado está fuera del rango permitido.");
                System.exit(0); // Salir del programa.
        }

        System.out.println("El número " + numero + " en romano es " + numeroRomano); // Imprimir el resultado.

    }
}
