/*
 * Realice un programa que calcule y visualice el valor máximo, 
el valor mínimo y el promedio de n números (n>0). El valor de 
n se solicitará al principio del programa y los números serán 
introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”
 */
package Clase4;

import java.util.Scanner;

public class Extras7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = leer.nextInt();

        int i = 0;
        double suma = 0;
        double min = Double.MAX_VALUE; //Inicializa la variable min con el valor máximo posible para un número de punto flotante o sea que tiene una parte entera y na parte decimal.
        double max = Double.MIN_VALUE; //Inicializa la variable max con el valor mínimo posible para un número de punto flotante.

        while (i < n) {
            System.out.print("Ingrese un número: ");
            double num = leer.nextDouble();

            suma += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            i++;
        }

        double promedio = suma / n;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);

    }
}
