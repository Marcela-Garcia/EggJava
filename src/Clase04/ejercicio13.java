/*
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package Clase04;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite, suma = 0, numero;

        System.out.print("Ingrese el valor límite: ");
        limite = scanner.nextInt();

        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
/*
declara tres variables de tipo int llamadas limite, suma y numero. 
La variable suma se inicializa en cero.
suma += numero;: agrega el número ingresado por el usuario a la variable suma.
*/
