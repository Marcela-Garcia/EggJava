/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Clase4;

import java.util.Scanner;

public class Extras1 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos; // declara la variable para almacenar el tiempo en minutos ingresado por el usuario

        System.out.print("Ingrese el tiempo en minutos: ");
        minutos = leer.nextInt();

        int horas = minutos / 60; // calcula el equivalente en horas
        int dias = horas / 24; // calcula el equivalente en días
        horas = horas % 24; // calcula las horas restantes

        // resultado del cálculo
        System.out.println(minutos + " minutos equivalen a " + dias + " días, " + horas + " horas.");
    }
}
