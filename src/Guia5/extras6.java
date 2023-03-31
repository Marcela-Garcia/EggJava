/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida 
la ubicación de las palabras, rellene los espacios no utilizados con un número 
aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package Guia5;

import java.util.Scanner;

public class extras6 {

    public static void main(String[] args) {
        char[][] matriz = new char[40][40];
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        int fila = (int) (Math.random() * 20);
        int columna = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = leer.nextLine().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i + 1) + ": ");
                palabras[i] = leer.nextLine().toUpperCase();
            }
        }
        // Insertar las palabras en la fila aleatoria
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                matriz[fila][columna + j] = palabra.charAt(j);
            }
            columna += palabra.length() + 1;
        }
        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                if (matriz[i][j] == '\u0000') {
                    matriz[i][j] = (char) (Math.random() * 10 + 48); //da como resultado 53 q es el código ASCII decimal del carácter 5. se garantiza que el caracter aleatorio generado sea un número del 0 al 9 en lugar de un carácter alfabético o de otro tipo.
                }// genera un número aleatorio que se convierte directamente en un char, al sumar 
                //48, se asegura que el número generado esté en el rango adecuado 
                //de valores ASCII decimales que corresponden a los caracteres numéricos '0' a '9'. 
                //asi, el número generado por Math.random() se convierte en el carácter que 
                //representa el dígito numérico aleatorio para separar las palabras en la sopa:)
            }
        }
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
if (matriz[i][j] == '\u0000') comprueba si el valor almacenado en la posición i, j 
de la matriz es igual al caracter nulo, representado por '\u0000'.
El caracter nulo es un caracter especial que se utiliza para indicar que no hay ningún
valor almacenado en una posición de memoria. En este caso, si la posición i, j de la matriz
contiene el caracter nulo, significa que no se ha insertado ninguna letra en esa posición, 
y por lo tanto, se debe rellenar con un número aleatorio.

*/