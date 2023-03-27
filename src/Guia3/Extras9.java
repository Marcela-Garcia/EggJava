/*
 *Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando 
sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado
menor que el divisor, este resultado es el residuo, y el número de restas 
realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package Guia3;

import java.util.Scanner;

public class Extras9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        // Variables para contar el cociente y el residuo
        int cociente = 0;
        int residuo = 0;

        //  la división usando restas
        while (dividendo >= divisor) {
            dividendo -= divisor; //Restamos el divisor del dividendo en cada vuelta del bucle.
            cociente++; //Incrementa el contador de cociente 
        }

        residuo = dividendo; //almacena el valor final del dividendo en la variable residuo

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);

    }

}
