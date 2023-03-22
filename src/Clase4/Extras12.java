/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca 
un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package Clase4;

public class Extras12 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        System.out.println(i + "-" + j + "-E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
    }
}
// utiliza tres bucles anidados para recorrer todos los valores posibles de tres 
//dígitos, desde 0-0-0 hasta 9-9-9. En cada vuelta se comprueba si la 
//variable "k" es igual a 3, y si es, se imprime la letra "E" en lugar del 
//valor de la variable "k".  se imprime por consola cada valor en un 
//formato de tres dígitos separados por guiones, con cada valor en una línea diferente.