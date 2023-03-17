/*
 *Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package Clase01;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El doble de " + numero + " es: " + (numero * 2));
        System.out.println("El triple de " + numero + " es: " + (numero * 3));
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
/*
double raizCuadrada = Math.sqrt(numero);
Este comando calcula la raíz cuadrada del número entero ingresado por el usuario
utilizando el método estático "sqrt" de la clase Math y 
almacena el resultado en una variable de tipo doble llamada "raizCuadrada".
*/
