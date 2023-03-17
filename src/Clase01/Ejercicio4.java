/*
 * Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Clase01;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Celsius:");
        int celsius = leer.nextInt();
        double fahrenheit = 32 + (9.0 / 5) * celsius;
        System.out.println("El equivalente en grados Fahrenheit es: " + fahrenheit);
     }
    
}
/*
double fahrenheit = 32 + (9.0 / 5) * celsius;
Este comando calcula la temperatura equivalente en grados Fahrenheit a partir de los grados Celsius 
que el usuario ingresó y la almacena en una variable de tipo doble llamada "fahrenheit".
*/
