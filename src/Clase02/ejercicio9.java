package Clase02;

/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

/**
 *Utilizar el método length() de la clase String para obtener la longitud de la frase ingresada 
 * por el usuario, y compararla con el número 8. Si la longitud es igual a 8, 
 * mostrar un mensaje de "CORRECTO", de lo contrario mostrar un mensaje de "INCORRECTO"
 * El método length() de la clase String en Java devuelve la cantidad de caracteres que contiene 
 * una cadena de texto. Este método no recibe argumentos y devuelve un valor entero que
 * representa la longitud de la cadena.
 * ej String mensaje = "Hola Mundo";
 * int longitud = mensaje.length();
 * El método length() es muy útil cuando se necesitan realizar operaciones que involucren el tamaño 
 * o longitud de una cadena de texto, como por ejemplo validar que una cadena tenga un tamaño determinado,
 * cortar una cadena en una posición específica, entre otras.

Es importante destacar que el método length() devuelve la longitud de la cadena contando
* todos los caracteres que la conforman, incluyendo espacios en blanco, signos de puntuación
* y caracteres especiales.
 */
  import java.util.Scanner;
public class ejercicio9 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra de 8 caracteres:");
        String frase = sc.nextLine();

        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

        sc.close();
    }
}


