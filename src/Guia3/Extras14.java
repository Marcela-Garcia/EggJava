/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
de todas las familias.

 */
package Guia3;

import java.util.Scanner;

public class Extras14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de familias: ");
        int numFamilias = leer.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;
        for (int i = 1; i <= numFamilias; i++) { //recorrer todas las familias ingresadas 
            System.out.print("Introduce la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();

            for (int j = 1; j <= numHijos; j++) { //recorrer todos los hijos de la familia actual.
                System.out.print("Introduce la edad del hijo " + j + ": ");
                int edadHijo = leer.nextInt(); //se agrega la edad del hijo actual a la suma total 
                totalEdades += edadHijo;
            }

            totalHijos += numHijos;
        }

        double mediaEdad = (double) totalEdades / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es " + mediaEdad);
    }
}
