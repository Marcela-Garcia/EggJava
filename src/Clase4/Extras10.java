/*
 *Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar 
la función Math.random() de Java.
 */
package Clase4;

import java.util.Scanner;

public class Extras10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11); // aleatorio entre 0 y 10
        int num2 = (int) (Math.random() * 11); //otro número aleatorio entre 0 y 10
        int resultado = num1 * num2; // Calcula el resultado de la multiplicación

        System.out.println("Adivina el resultado de la multiplicación entre " + num1 + " y " + num2 + ": ");

        int respuesta = -1; // Inicializa la respuesta como -1

        while (respuesta != resultado) { // Repite hasta que la respuesta sea correcta
            respuesta = leer.nextInt();
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto, intenta de nuevo.");
            }
        }

    }
}
