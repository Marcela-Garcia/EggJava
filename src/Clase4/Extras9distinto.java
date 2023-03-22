/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package Clase4;

import java.util.Scanner;

public class Extras9distinto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        int residuo = dividendo;
        int contador = 0;

        while (residuo >= divisor) {
            residuo -= divisor;
            contador++;
            System.out.println(dividendo + " - " + contador + " * " + divisor + " = " + residuo + "\t" + contador + " resta(s) realizada(s)");
        }

        System.out.println("El cociente es: " + contador);
        System.out.println("El residuo es: " + residuo);

    
    }
}


