/*
 *Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Clase4;

import java.util.Scanner;

public class Extras6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();

        double suma = 0.0;
        int count = 0;
        double sumaBajo160 = 0.0;
        int countBajo160 = 0;

        for (int i = 1; i <= n; i++) { //for se utiliza para solicitar al usuario la altura de cada persona.
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            double altura = leer.nextDouble(); // lee el número desde la consola y lo asigna a la variable altura.

            suma += altura; //para calcular la suma de todas las alturas ingresadas y el número total de alturas ingresadas.
            count++;

            if (altura < 1.60) { // if se utiliza para verificar si la altura de la persona actual es menor a 1.60 metros. Si es así, la altura se suma a "sumaBajo160" y se incrementa "countBajo160" para realizar el cálculo del promedio de alturas menores a 1.60 metros
                sumaBajo160 += altura;
                countBajo160++;
            }
        }

        double promedio = suma / count; // calcular el promedio de todas las alturas ingresadas.
        double promedioBajo160 = (countBajo160 > 0) ? sumaBajo160 / countBajo160 : 0.0;
        //calcula el promedio de alturas menores a 1.60 metros. Si hay al menos 
        //una altura menor a 1.60 metros, se calcula el promedio dividiendo la 
        //suma de alturas menores a 1.60 metros por el número total de alturas 
        //menores a 1.60 mts. De lo contrario, el valor del promedio es 0.0.

        System.out.println("El promedio de estaturas es: " + promedio);
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioBajo160);
    }

}
// ? es una forma abreviada de escribir if else 
