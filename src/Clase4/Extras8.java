/*
Escriba un programa que lea números enteros. Si el número es múltiplo de 
cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
cantidad de números pares y la cantidad de números impares. Al igual que en 
el ejercicio anterior los números negativos no deben sumarse. Nota: recordar 
el uso de la sentencia break.
 */
package Clase4;

import java.util.Scanner;

public class Extras8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, cont = 0, contPares = 0, contImpares = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();

            if (num < 0) {
                break;
            } else if (num % 5 == 0) {
                break;
            } else {
                cont++;
                if (num % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + contPares);
        System.out.println("Cantidad de números impares: " + contImpares);

    }

}
