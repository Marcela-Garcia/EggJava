/*
* Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Clase01;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        /*
        Este comando lee el nombre que el usuario ingresa desde la consola
        y lo almacena en una variable de tipo String llamada "nombre".
         */
        System.out.println(nombre);

    }

}